package Zoo.GestionZoo;

import Zoo.Animales.*;
import Zoo.GestionHabitat.*;
import java.util.List;

public class Quiosco {
    private final List<Animal> animales;
    private final List<Habitat> habitats;

    public Quiosco(List<Animal> animales, List<Habitat> habitats) {
        this.animales = animales;
        this.habitats = habitats;
    }

    public void mostrarInformacionAnimal(String idAnimal) {
        for (Animal animal : animales) {
            if (animal.getId().equals(idAnimal)) {
                System.out.println(animal.getInformacion());
                return;
            }
        }
        System.out.println("Lo siento, no se encontró ningún animal con el ID proporcionado.");
    }

    public void mostrarInformacionHabitat(String idHabitat) {
        for (Habitat habitat : habitats) {
            if (habitat.getId().equals(idHabitat)) {
                System.out.println(habitat.getInformacion());
                return;
            }
        }
        System.out.println("Lo siento, no se encontró ningún hábitat con el ID proporcionado.");
    }
}