package Zoo;

import Zoo.GestionHabitat.*;
import Zoo.Animales.*;
import Zoo.GestionZoo.Visitantes.*;
import Zoo.GestionZoo.Administracion.*;
import Zoo.GestionZoo.MantenimientoYSeguridad.*;

import java.util.*;

public class App {
    public static void main(String[] args) {
        // Crearemos las instancias del hábitat aquí
        Acuatico habitatMarinos = new Acuatico(30, 70, true, "Acuatico", "Habitat Marinos", "Habitat para animales marinos", true, 15.0);
        Acuatico habitatAguaDulce = new Acuatico(25, 75, true, "Acuatico", "Habitat Agua Dulce", "Habitat para animales de agua dulce", true, 10.0);
        Acuatico habitatAguaSalada = new Acuatico(35, 65, true, "Acuatico", "Habitat Agua Salada", "Habitat para animales de agua salada", true, 20.0);
        Terrestre habitatFelinos = new Terrestre(40, 60, true, "Terrestre", "Habitat Felinos", "Habitat para grandes felinos", true);
        Terrestre habitatPrimates = new Terrestre(35, 70, true, "Terrestre", "Habitat Primates", "Habitat para primates", true);
        Terrestre habitatMarsupiales = new Terrestre(30, 65, true, "Terrestre", "Habitat Marsupiales", "Habitat para marsupiales", true);
        Aviario habitatAvesRapaces = new Aviario(20, 70, true, "Aviario", "Habitat Aves Rapaces", "Habitat para aves rapaces", true, 15.0);
        Aviario habitatPajarosExoticos = new Aviario(25, 75, true, "Aviario", "Habitat Pajaros Exoticos", "Habitat para pájaros exóticos", true, 10.0);
        Aviario habitatPajarosAcuaticos = new Aviario(30, 65, true, "Aviario", "Habitat Pajaros Acuaticos", "Habitat para pájaros acuáticos", true, 20.0);

        // Crearemos las instancias de los animales terrestres aquí
        AnimalTerrestres tigre = new AnimalTerrestres("Mamífero", "Tigre", "Carne", "Terrestre", "Agresivo", "Saludable", "1", true, true, true);
        AnimalTerrestres leon = new AnimalTerrestres("Mamífero", "León", "Carne", "Terrestre", "Agresivo", "Saludable", "4", true, true, true);
        AnimalTerrestres mono = new AnimalTerrestres("Mamífero", "Mono", "Frutas", "Terrestre", "Tranquilo", "Saludable", "5", true, true, true);
        AnimalTerrestres gorila = new AnimalTerrestres("Mamífero", "Gorila", "Frutas y Hojas", "Terrestre", "Agresivo", "Saludable", "6", true, true, true);
        AnimalTerrestres canguro = new AnimalTerrestres("Mamífero", "Canguro", "Hierba", "Terrestre", "Tranquilo", "Saludable", "7", true, true, true);
        AnimalTerrestres koala = new AnimalTerrestres("Mamífero", "Koala", "Hojas de Eucalipto", "Terrestre", "Tranquilo", "Saludable", "8", true, true, true);

        // Crearemos las instancias de los animales acuáticos
        AnimalAcuatico Dorado = new AnimalAcuatico("Pez", "Dorado", "Algas", "Acuatico", "Tranquilo", "Saludable", "2", true, true, true, "Dulce");
        AnimalAcuatico delfin = new AnimalAcuatico("Mamífero", "Delfín", "Pescado", "Acuático", "Tranquilo", "Saludable", "9", true, true, true, "Salado");
        AnimalAcuatico ballena = new AnimalAcuatico("Mamífero", "Ballena", "Krill", "Acuático", "Tranquilo", "Saludable", "10", true, true, true, "Salado");
        AnimalAcuatico nutria = new AnimalAcuatico("Mamífero", "Nutria", "Pescado", "Acuático", "Tranquilo", "Saludable", "11", true, true, true, "Dulce");
        AnimalAcuatico tiburon = new AnimalAcuatico("Pez", "Tiburón", "Pescado", "Acuático", "Agresivo", "Saludable", "12", true, true, true, "Salado");
        AnimalAcuatico mantarraya = new AnimalAcuatico("Pez", "Mantarraya", "Plancton", "Acuático", "Tranquilo", "Saludable", "13", true, true, true, "Salado");

        // Crearemos las instancias de los animales de aviario
        AnimalAviario aguila = new AnimalAviario("Ave", "Águila", "Carnes", "Aviario", "Agresivo", "Saludable", "14", true, true, true, "Águila");
        AnimalAviario halcon = new AnimalAviario("Ave", "Halcón", "Carnes", "Aviario", "Agresivo", "Saludable", "15", true, true, true, "Halcón");
        AnimalAviario loro = new AnimalAviario("Ave", "Loro", "Frutas y Semillas", "Aviario", "Tranquilo", "Saludable", "16", true, true, true, "Loro");
        AnimalAviario tucan = new AnimalAviario("Ave", "Tucán", "Frutas", "Aviario", "Tranquilo", "Saludable", "17", true, true, true, "Tucán");
        AnimalAviario pato = new AnimalAviario("Ave", "Pato", "Plantas y Pequeños Insectos", "Aviario", "Tranquilo", "Saludable", "18", true, true, true, "Pato");
        AnimalAviario flamenco = new AnimalAviario("Ave", "Flamenco", "Algas y Crustáceos", "Aviario", "Tranquilo", "Saludable", "19", true, true, true, "Flamenco");

        // Aquí crearemos la lista de animales y hábitats
        List<Animal> animales = new ArrayList<>();
        // Terrestres
        animales.add(tigre);
        animales.add(leon);
        animales.add(mono);
        animales.add(gorila);
        animales.add(canguro);
        animales.add(koala);
        // Acuáticos
        animales.add(Dorado);
        animales.add(delfin);
        animales.add(ballena);
        animales.add(nutria);
        animales.add(tiburon);
        animales.add(mantarraya);
        // Aviario
        animales.add(aguila);
        animales.add(halcon);
        animales.add(loro);
        animales.add(tucan);
        animales.add(pato);
        animales.add(flamenco);

        List<Habitat> habitats = new ArrayList<>();
        habitats.add(habitatFelinos);
        habitats.add(habitatPrimates);
        habitats.add(habitatMarsupiales);
        habitats.add(habitatMarinos);
        habitats.add(habitatAguaDulce);
        habitats.add(habitatAguaSalada);
        habitats.add(habitatAvesRapaces);
        habitats.add(habitatPajarosExoticos);
        habitats.add(habitatPajarosAcuaticos);

        // Crearemos las instancias de los tours aquí
        Tour tourNinos = new TourNinos();
        Tour tourAmanteMamiferos = new TourAmanteMamiferos();
        Tour tourAmanteAcuaticos = new TourAmanteAcuaticos();
        Tour tourAmanteAviario = new TourAmanteAviario();

        //Aquí el quiosco para el visitante
        Quiosco quiosco = new Quiosco(animales, habitats);

        // Aquí el administrador de recursos
        // Para ahorrar espacio, se ha colocado el método getAdministracionRecursos() en la parte inferior de este archivo
        AdministracionRecursos administracionRecursos = getAdministracionRecursos();

        // Aquí para las tareas de mantenimiento
        Mantenimiento mantenimiento = new Mantenimiento();

        // Creamos las instancias de las tareas
        Tarea tarea1 = new Tarea("Limpieza de hábitat", new Date(), true, "Pendiente");
        tarea1.setFechaFinalizacion(new Date());
        Tarea tarea2 = new Tarea("Revisión de seguridad", new Date(), false, "Pendiente");
        tarea2.setFechaFinalizacion(new Date());

        mantenimiento.programarTarea(tarea1);
        mantenimiento.programarTarea(tarea2);

        // Aquí la seguridad
        Seguridad seguridad = new Seguridad();

        // Creamos las instancias de la cámara y el sensor especificando la localización
        Camara camara = new Camara("Entrada");
        Sensor sensor = new Sensor("Entrada");

        // Aquí el monitoreo de los hábitats para el empleado
        Monitoreo monitoreo = new Monitoreo();

        monitoreo.configurarHabitat(habitatFelinos, 40, 60, true);
        monitoreo.registrarHabitat(habitatFelinos);
        monitoreo.configurarTerrestre(habitatFelinos, true, "Arenoso");
        monitoreo.configurarHabitat(habitatPrimates, 35, 70, true);
        monitoreo.registrarHabitat(habitatPrimates);
        monitoreo.configurarTerrestre(habitatPrimates, true, "Arenoso");
        monitoreo.configurarHabitat(habitatMarsupiales, 30, 65, true);
        monitoreo.registrarHabitat(habitatMarsupiales);
        monitoreo.configurarTerrestre(habitatMarsupiales, true, "Arenoso");

        monitoreo.configurarHabitat(habitatMarinos, 30, 70, true);
        monitoreo.registrarHabitat(habitatMarinos);
        monitoreo.configurarAcuatico(habitatMarinos, true, 15.0);
        monitoreo.configurarHabitat(habitatAguaDulce, 25, 75, true);
        monitoreo.registrarHabitat(habitatAguaDulce);
        monitoreo.configurarAcuatico(habitatAguaDulce, true, 10.0);
        monitoreo.configurarHabitat(habitatAguaSalada, 35, 65, true);
        monitoreo.registrarHabitat(habitatAguaSalada);
        monitoreo.configurarAcuatico(habitatAguaSalada, true, 20.0);

        monitoreo.configurarHabitat(habitatAvesRapaces, 20, 70, true);
        monitoreo.registrarHabitat(habitatAvesRapaces);
        monitoreo.configurarAviario(habitatAvesRapaces, true, 15.0);
        monitoreo.configurarHabitat(habitatPajarosExoticos, 25, 75, true);
        monitoreo.registrarHabitat(habitatPajarosExoticos);
        monitoreo.configurarAviario(habitatPajarosExoticos, true, 10.0);
        monitoreo.configurarHabitat(habitatPajarosAcuaticos, 30, 65, true);
        monitoreo.registrarHabitat(habitatPajarosAcuaticos);
        monitoreo.configurarAviario(habitatPajarosAcuaticos, true, 20.0);

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
                    System.out.println("9. Salir");
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
                            System.out.println("Saliendo...");
                            return;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            System.out.println();
                            break;
                    }
                }
            }  else if (opcion == 2) {
                    System.out.println("1. Realizar tour");
                    System.out.println("2. Mostrar información de animales");
                    System.out.println("9. Salir");
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
                            System.out.print("Ingrese el ID del animal: ");
                            String idAnimal = scanner.next();
                            System.out.println();
                            quiosco.mostrarInformacionAnimalCompleta(idAnimal);
                            System.out.println();
                            break;
                        case 9:
                            System.out.println("Saliendo...");
                            return;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            System.out.println();
                            break;
                    }
                } else {
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                System.out.println();
                }
            }
        }

    private static AdministracionRecursos getAdministracionRecursos() {
        Recurso.Alimento Alimento = new Recurso.Alimento("Alimento", 100);
        Recurso.Medicamento Medicamento = new Recurso.Medicamento("Medicamento", 50);
        Recurso.Equipamiento Equipamiento = new Recurso.Equipamiento("Material de limpieza", 200);

        Proveedor proveedor = new Proveedor("Proveedor 1");
        proveedor.agregarRecurso(Alimento);
        proveedor.agregarRecurso(Medicamento);
        proveedor.agregarRecurso(Equipamiento);

        Pedido pedidoAlimento = new Pedido(Alimento, 50, proveedor);
        Pedido pedidoMedicamento = new Pedido(Medicamento, 25, proveedor);
        Pedido pedidoMaterialLimpieza = new Pedido(Equipamiento, 100, proveedor);

        AdministracionRecursos administracionRecursos = new AdministracionRecursos();
        administracionRecursos.agregarRecurso(Alimento);
        administracionRecursos.agregarRecurso(Medicamento);
        administracionRecursos.agregarRecurso(Equipamiento);
        administracionRecursos.agregarProveedor(proveedor);
        administracionRecursos.agregarPedido(pedidoAlimento);
        administracionRecursos.agregarPedido(pedidoMedicamento);
        administracionRecursos.agregarPedido(pedidoMaterialLimpieza);
        return administracionRecursos;
    }
}