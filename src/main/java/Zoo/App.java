package Zoo;

import Zoo.GestionHabitat.*;
import Zoo.Animales.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Acuatico acuatico = new Acuatico(25, 80, true, true, 10.0);
        Terrestre terrestre = new Terrestre(30, 60, true, true);
        Aviario aviario = new Aviario(20, 70, true, true, 10.0);

        AnimalTerrestres animalTerrestres = new AnimalTerrestres("Mamífero", "Tigre", "Carne", "Terrestre", "Agresivo", "Saludable", "1", true, true, true);
        AnimalAcuatico animalAcuatico = new AnimalAcuatico("Pez", "Dorado", "Algas", "Acuatico", "Tranquilo", "Saludable", "2", true, true, true, "Dulce");
        AnimalAviario animalAviario = new AnimalAviario("Ave", "Canario", "Semillas", "Aviario", "Tranquilo", "Saludable", "3", true, true, true, "Canario");

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
            System.out.println("3. Salir");
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
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}