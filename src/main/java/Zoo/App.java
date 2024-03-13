package Zoo;

import Zoo.GestionHabitat.*;
import Zoo.Animales.*;
import Zoo.GestionZoo.DatosZoo;
import Zoo.GestionZoo.Visitantes.*;
import Zoo.GestionZoo.Administracion.*;
import Zoo.GestionZoo.MantenimientoYSeguridad.*;

import java.util.*;

public class App {
    public static void main(String[] args) {

        DatosZoo datosZoo = new DatosZoo();

        List<Animal> animales = datosZoo.initializeAnimals();
        List<Habitat> habitats = datosZoo.initializeHabitats();
        AdministracionRecursos administracionRecursos = datosZoo.initializeAdministracionRecursos();
        Mantenimiento mantenimiento = datosZoo.initializeMantenimiento();
        Monitoreo monitoreo = datosZoo.initializeMonitoreo();

        Seguridad seguridad = new Seguridad();

        // Creamos las instancias de la cámara y el sensor especificando la localización
        Camara camara = new Camara("Entrada");
        Sensor sensor = new Sensor("Entrada");


        // Crearemos las instancias de los tours aquí
        Tour tourNinos = new TourNinos();
        Tour tourAmanteMamiferos = new TourAmanteMamiferos();
        Tour tourAmanteAcuaticos = new TourAmanteAcuaticos();
        Tour tourAmanteAviario = new TourAmanteAviario();

        //Aquí el quiosco para el visitante
        Quiosco quiosco = new Quiosco(animales, habitats);


        // El menú principal
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Empleado"); //IMPORTANTE: La contraseña es "admin"
            System.out.println("2.Visitante");
            System.out.println("Seleccione una opción: ");

            int opcion;

            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                System.out.println();
                scanner.next();
                continue;
            }

            if (opcion == 1) {
                System.out.println("Ingrese la contraseña: ");
                String contrasena = scanner.next();
                if (!contrasena.equals("admin")) {
                    System.out.println("Contraseña incorrecta. Saliendo...");
                    System.out.println();
                    continue;
                }

                while (true) {

                    System.out.println();
                    System.out.println("1. Analizar Hábitats");
                    System.out.println("2. Interactuar con animales");
                    System.out.println("3. Administrar recursos");
                    System.out.println("4. Ver tareas de mantenimiento");
                    System.out.println("5. Ver cámaras y sensores");
                    System.out.println("9. Volver al menú principal");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");
                    System.out.println();

                    int opcionEmpleado;

                    try {
                        opcionEmpleado = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Opción no válida. Por favor, intente de nuevo.");
                        System.out.println();
                        scanner.next();
                        continue;
                    }
                    switch (opcionEmpleado) {
                        case 1:
                            monitoreo.analizarHabitats();
                            break;
                        case 2:
                            System.out.println("1. Interactuar con animales terrestres");
                            System.out.println("2. Interactuar con animales acuáticos");
                            System.out.println("3. Interactuar con animales de aviario");
                            System.out.print("Seleccione una opción: ");
                            System.out.println();

                            int opcionAnimales;

                            try {
                                opcionAnimales = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println();
                                scanner.next();
                                continue;
                            }

                            switch (opcionAnimales) {
                                case 1:
                                    System.out.println("Animales terrestres:");
                                    for (Animal animal : animales) {
                                        if (animal instanceof AnimalTerrestres) {
                                            AnimalTerrestres animalTerrestre = (AnimalTerrestres) animal;
                                            System.out.println("Has seleccionado el animal terrestre: " + animalTerrestre.getNombre());
                                            System.out.println("Especie: " + animalTerrestre.getEspecie());
                                            System.out.println("Alimentación: " + animalTerrestre.getAlimentacion());
                                            System.out.println("Hábitat: " + animalTerrestre.getHabitat());
                                            System.out.println("Comportamiento: " + animalTerrestre.getComportamiento());
                                            System.out.println("Salud: " + animalTerrestre.getSalud());
                                            System.out.println();
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Animales acuáticos:");
                                    for (Animal animal : animales) {
                                        if (animal instanceof AnimalAcuatico) {
                                            AnimalAcuatico animalAcuatico = (AnimalAcuatico) animal;
                                            System.out.println("Has seleccionado el animal acuático: " + animalAcuatico.getNombre());
                                            System.out.println("Especie: " + animalAcuatico.getEspecie());
                                            System.out.println("Alimentación: " + animalAcuatico.getAlimentacion());
                                            System.out.println("Hábitat: " + animalAcuatico.getHabitat());
                                            System.out.println("Comportamiento: " + animalAcuatico.getComportamiento());
                                            System.out.println("Salud: " + animalAcuatico.getSalud());
                                            System.out.println();
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Animales de aviario:");
                                    for (Animal animal : animales) {
                                        if (animal instanceof AnimalAviario) {
                                            AnimalAviario animalAviario = (AnimalAviario) animal;
                                            System.out.println("Has seleccionado el animal de aviario: " + animalAviario.getNombre());
                                            System.out.println("Especie: " + animalAviario.getEspecie());
                                            System.out.println("Alimentación: " + animalAviario.getAlimentacion());
                                            System.out.println("Hábitat: " + animalAviario.getHabitat());
                                            System.out.println("Comportamiento: " + animalAviario.getComportamiento());
                                            System.out.println("Salud: " + animalAviario.getSalud());
                                            System.out.println();
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                    System.out.println();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("1. Ver recursos");
                            System.out.println("2. Ver proveedores");
                            System.out.println("3. Ver pedidos");
                            System.out.print("Seleccione una opción: ");
                            System.out.println();

                            int opcionRecursos;

                            try {
                                opcionRecursos = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println();
                                scanner.next();
                                continue;
                            }

                            switch (opcionRecursos) {
                                case 1:
                                    System.out.println();
                                    System.out.println("Recursos:");
                                    for (Recurso recurso : administracionRecursos.getRecursos()) {
                                        System.out.println("Nombre: " + recurso.getNombre() + ", Cantidad: " + recurso.getCantidad());
                                    }
                                    break;
                                case 2:
                                    System.out.println();
                                    System.out.println("Proveedores:");
                                    for (Proveedor proveedor1 : administracionRecursos.getProveedores()) {
                                        System.out.println("Nombre: " + proveedor1.getNombre());
                                    }
                                    break;
                                case 3:
                                    System.out.println();
                                    System.out.println("Pedidos:");
                                    for (Pedido pedido : administracionRecursos.getPedidos()) {
                                        System.out.println("Recurso: " + pedido.getRecurso().getNombre() + ", Cantidad: " + pedido.getCantidad() + ", Proveedor: " + pedido.getProveedor().getNombre());
                                    }
                                    break;
                                default:
                                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                    System.out.println();
                                    break;
                            }
                            break;
                        case 4:
                            List<Tarea> tareasPendientes = mantenimiento.obtenerTareasPendientes();
                            System.out.println("Tareas de mantenimiento pendientes:");
                            for (Tarea tarea : tareasPendientes) {
                                System.out.println("Descripción: " + tarea.getDescripcion());
                                System.out.println("Fecha programada: " + tarea.getFechaProgramada());
                                System.out.println("Es urgente:" + (tarea.isEsUrgente() ? "Sí" : "No"));
                                System.out.println("Estado: " + tarea.getEstado());
                                System.out.println("Fecha de finalización: " + tarea.getFechaFinalizacion());
                                System.out.println();
                            }
                            break;
                        case 5:
                            System.out.println("Cámara y sensor activados");
                            System.out.println();
                            seguridad.monitorZoo();
                            camara.activar();
                            sensor.activar();
                            System.out.println();
                            break;
                        case 9:
                            System.out.println("Volviendo...");
                            System.out.println();
                            break;
                        case 0:
                            System.out.println("Saliendo...");
                            return;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            System.out.println();
                            break;
                    }
                    if (opcionEmpleado == 9) {
                        break;
                    }
                }
            }  else if (opcion == 2) {
                while (true) {
                    System.out.println("1. Realizar tour");
                    System.out.println("2. Mostrar información de animales");
                    System.out.println("3. Mostrar información de hábitats");
                    System.out.println("9. Volver al menú principal");
                    System.out.println("0. Salir");
                    System.out.print("Seleccione una opción: ");
                System.out.println();

                    int opcionVisitante;

                try {
                    opcionVisitante = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    System.out.println();
                    scanner.next();
                    continue;
                }

                    switch (opcionVisitante) {
                        case 1:
                            System.out.println("1. Tour para niños");
                            System.out.println("2. Tour para amantes de mamíferos");
                            System.out.println("3. Tour para amantes de animales acuáticos");
                            System.out.println("4. Tour para amantes de aviario");
                            System.out.print("Seleccione una opción: ");
                            System.out.println();

                            int opcionTour;

                            try {
                                opcionTour = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                System.out.println();
                                scanner.next();
                                continue;
                            }

                            switch (opcionTour) {
                                case 1:
                                    tourNinos.realizarTour();
                                    break;
                                case 2:
                                    tourAmanteMamiferos.realizarTour();
                                    break;
                                case 3:
                                    tourAmanteAcuaticos.realizarTour();
                                    break;
                                case 4:
                                    tourAmanteAviario.realizarTour();
                                    break;
                                default:
                                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                                    System.out.println();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Lista de animales por hábitat:");
                            System.out.println("Animales terrestres:");
                            for (Animal animal : animales) {
                                if (animal instanceof AnimalTerrestres) {
                                    System.out.println("ID: " + animal.getId() + ", Nombre: " + animal.getNombre());
                                }
                            }
                            System.out.println("Animales acuáticos:");
                            for (Animal animal : animales) {
                                if (animal instanceof AnimalAcuatico) {
                                    System.out.println("ID: " + animal.getId() + ", Nombre: " + animal.getNombre());
                                }
                            }
                            System.out.println("Animales de aviario:");
                            for (Animal animal : animales) {
                                if (animal instanceof AnimalAviario) {
                                    System.out.println("ID: " + animal.getId() + ", Nombre: " + animal.getNombre());
                                }
                            }
                            System.out.print("Ingrese el ID del animal: ");
                            String idAnimal = scanner.next();
                            System.out.println();
                            quiosco.mostrarInformacionAnimalCompleta(idAnimal);
                            System.out.println();
                            break;
                        case 3:
                            System.out.println("Lista de hábitats:");
                            System.out.println("Hábitats terrestres:");
                            for (Habitat habitat : habitats) {
                                if (habitat instanceof Terrestre) {
                                    System.out.println("ID: " + habitat.getId() + ", Nombre: " + habitat.getNombre());
                                }
                            }
                            System.out.println("Hábitats acuáticos:");
                            for (Habitat habitat : habitats) {
                                if (habitat instanceof Acuatico) {
                                    System.out.println("ID: " + habitat.getId() + ", Nombre: " + habitat.getNombre());
                                }
                            }
                            System.out.println("Hábitats de aviario:");
                            for (Habitat habitat : habitats) {
                                if (habitat instanceof Aviario) {
                                    System.out.println("ID: " + habitat.getId() + ", Nombre: " + habitat.getNombre());
                                }
                            }
                            System.out.print("Ingrese el ID del Hábitat: ");
                            String idHabitat = scanner.next();
                            System.out.println();
                            quiosco.mostrarInformacionHabitat(idHabitat);
                            System.out.println();
                            break;
                        case 9:
                            System.out.println("Volviendo...");
                            System.out.println();
                            break;
                        case 0:
                            System.out.println("Saliendo...");
                            return;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            System.out.println();
                            break;
                    }

                 if (opcionVisitante == 9) {
                    break;
                 }
                }
            } else {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                System.out.println();
                }
            }
        }
}