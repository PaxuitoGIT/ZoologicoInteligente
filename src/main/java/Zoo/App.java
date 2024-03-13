package Zoo;

import Zoo.GestionHabitat.*;
import Zoo.Animales.*;
import Zoo.GestionZoo.*;
import Zoo.GestionZoo.Visitantes.*;
import Zoo.GestionZoo.Administracion.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Acuatico acuatico = new Acuatico(25, 80, true, "Acuático", "acuatico", "Habitat acuático", true, 10.0);
        Terrestre terrestre = new Terrestre(30, 60, true, "Terrestre", "terrestre", "Habitat terrestre", true);
        Aviario aviario = new Aviario(20, 70, true, "Aviario", "aviario", "Habitat aviario", true, 15.0);

        AnimalTerrestres animalTerrestres = new AnimalTerrestres("Mamífero", "Tigre", "Carne", "Terrestre", "Agresivo", "Saludable", "1", true, true, true);
        AnimalAcuatico animalAcuatico = new AnimalAcuatico("Pez", "Dorado", "Algas", "Acuatico", "Tranquilo", "Saludable", "2", true, true, true, "Dulce");
        AnimalAviario animalAviario = new AnimalAviario("Ave", "Canario", "Semillas", "Aviario", "Tranquilo", "Saludable", "3", true, true, true, "Canario");

        Tour tourNinos = new TourNinos();
        Tour tourAmanteMamiferos = new TourAmanteMamiferos();

        List<Animal> animales = new ArrayList<>();
        animales.add(animalTerrestres);
        animales.add(animalAcuatico);
        animales.add(animalAviario);

        List<Habitat> habitats = new ArrayList<>();
        habitats.add(terrestre);
        habitats.add(acuatico);
        habitats.add(aviario);

        Quiosco quiosco = new Quiosco(animales, habitats);

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



        Monitoreo monitoreo = new Monitoreo();

        monitoreo.configurarHabitat(terrestre, 30, 60, true);
        monitoreo.registrarHabitat(acuatico);
        monitoreo.configurarAcuatico(acuatico, true, 10.0);
        monitoreo.registrarHabitat(terrestre);
        monitoreo.configurarTerrestre(terrestre, true, "Arenoso");
        monitoreo.registrarHabitat(aviario);
        monitoreo.configurarAviario(aviario, true, 15.0);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Analizar hábitats");
            System.out.println("2. Interactuar con animales");
            System.out.println("3. Realizar un tour");
            System.out.println("4. Mostrar información de un animal");
            System.out.println("5. Administrar recursos");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    monitoreo.analizarHabitats();
                    break;
                case 2:
                    System.out.println("1. Interactuar con animales terrestres");
                    System.out.println("2. Interactuar con animales acuáticos");
                    System.out.println("3. Interactuar con animales de aviario");
                    System.out.print("Seleccione una opción: ");

                    int opcionAnimales = scanner.nextInt();

                    switch (opcionAnimales) {
                        case 1:
                            System.out.println("Has seleccionado el animal terrestre: " + animalTerrestres.getNombre());
                            System.out.println("Especie: " + animalTerrestres.getEspecie());
                            System.out.println("Alimentación: " + animalTerrestres.getAlimentacion());
                            System.out.println("Hábitat: " + animalTerrestres.getHabitat());
                            System.out.println("Comportamiento: " + animalTerrestres.getComportamiento());
                            System.out.println("Salud: " + animalTerrestres.getSalud());
                            break;
                        case 2:
                            System.out.println("Has seleccionado el animal acuático: " + animalAcuatico.getNombre());
                            System.out.println("Especie: " + animalAcuatico.getEspecie());
                            System.out.println("Alimentación: " + animalAcuatico.getAlimentacion());
                            System.out.println("Hábitat: " + animalAcuatico.getHabitat());
                            System.out.println("Comportamiento: " + animalAcuatico.getComportamiento());
                            System.out.println("Salud: " + animalAcuatico.getSalud());
                            break;
                        case 3:
                            System.out.println("Has seleccionado el animal de aviario: " + animalAviario.getNombre());
                            System.out.println("Especie: " + animalAviario.getEspecie());
                            System.out.println("Alimentación: " + animalAviario.getAlimentacion());
                            System.out.println("Hábitat: " + animalAviario.getHabitat());
                            System.out.println("Comportamiento: " + animalAviario.getComportamiento());
                            System.out.println("Salud: " + animalAviario.getSalud());
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Tour para niños");
                    System.out.println("2. Tour para amantes de mamíferos");
                    System.out.print("Seleccione una opción: ");

                    int opcionTour = scanner.nextInt();

                    switch (opcionTour) {
                        case 1:
                            tourNinos.realizarTour();
                            break;
                        case 2:
                            tourAmanteMamiferos.realizarTour();
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el ID del animal: ");
                    String idAnimal = scanner.next();
                    quiosco.mostrarInformacionAnimalCompleta(idAnimal);
                    break;
                case 5:
                    System.out.println("1. Ver recursos");
                    System.out.println("2. Ver proveedores");
                    System.out.println("3. Ver pedidos");
                    System.out.print("Seleccione una opción: ");

                    int opcionRecursos = scanner.nextInt();

                    switch (opcionRecursos) {
                        case 1:
                            System.out.println("Recursos:");
                            for (Recurso recurso : administracionRecursos.getRecursos()) {
                                System.out.println("Nombre: " + recurso.getNombre() + ", Cantidad: " + recurso.getCantidad());
                            }
                            break;
                        case 2:
                            System.out.println("Proveedores:");
                            for (Proveedor proveedor2 : administracionRecursos.getProveedores()) {
                                System.out.println("Nombre: " + proveedor.getNombre());
                            }
                            break;
                        case 3:
                            System.out.println("Pedidos:");
                            for (Pedido pedido : administracionRecursos.getPedidos()) {
                                System.out.println("Recurso: " + pedido.getRecurso().getNombre() + ", Cantidad: " + pedido.getCantidad() + ", Proveedor: " + pedido.getProveedor().getNombre());
                            }
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, intente de nuevo.");
                            break;
                    }
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}