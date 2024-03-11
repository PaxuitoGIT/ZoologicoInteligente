package Zoo.GestionHabitat;

import java.util.ArrayList;
import java.util.List;

public class Monitoreo {
    private final List<Habitat> habitats;

    public Monitoreo() {
        this.habitats = new ArrayList<>();
    }

    public void registrarHabitat(Habitat habitat) {
        this.habitats.add(habitat);
    }

    public void analizarHabitats() {
        for (Habitat habitat : habitats) {
            analizarHabitat(habitat);
        }
    }

    private void analizarHabitat(Habitat habitat) {
        System.out.println("Analizando hábitat...");
        System.out.println("Temperatura: " + habitat.getTemperatura());
        System.out.println("Humedad: " + habitat.getHumedad());
        System.out.println("Limpieza: " + (habitat.isLimpieza() ? "Limpio" : "Sucio"));

        if (habitat instanceof Terrestre) {
            Terrestre terrestre = (Terrestre) habitat;
            System.out.println("Puede caminar: " + (terrestre.isPuedeCaminar() ? "Sí" : "No"));
        } else if (habitat instanceof Aviario) {
            Aviario aviario = (Aviario) habitat;
            System.out.println("Pueden volar: " + (aviario.isPuedenVolar() ? "Sí" : "No"));
            System.out.println("Altura: " + aviario.getAltura());
        } else if (habitat instanceof Acuatico) {
            Acuatico acuatico = (Acuatico) habitat;
            System.out.println("Pueden nadar: " + (acuatico.isPuedenadar() ? "Sí" : "No"));
            System.out.println("Profundidad: " + acuatico.getProfundidad());
        }

        System.out.println("-------------------------");
    }
}