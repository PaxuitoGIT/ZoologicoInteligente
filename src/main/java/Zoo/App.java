package Zoo;

import Zoo.GestionHabitat.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Acuatico acuatico = new Acuatico(25, 80, true, true, 10.0);
        Terrestre terrestre = new Terrestre(30, 60, true, true);
        Aviario aviario = new Aviario(20, 70, true, true, 10.0);

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
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    monitoreo.analizarHabitats();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}