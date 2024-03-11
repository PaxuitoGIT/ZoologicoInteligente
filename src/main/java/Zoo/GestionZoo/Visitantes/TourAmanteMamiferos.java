package Zoo.GestionZoo.Visitantes;

public class TourAmanteMamiferos implements Tour {
    @Override
    public void realizarTour() {
        System.out.println("Bienvenidos al tour para amantes de los mamíferos!");
        System.out.println("Primero, vamos a visitar el área de los grandes felinos, donde podrán ver leones y tigres.");
        System.out.println("Luego, iremos al área de los primates, donde podrán ver monos y gorilas.");
        System.out.println("Después, iremos al área de los marsupiales, donde podrán ver canguros y koalas.");
        System.out.println("Finalmente, tendremos una actividad de alimentación de mamíferos. Recuerden, siempre debemos respetar a los animales y seguir las instrucciones del guía.");
        System.out.println("¡Esperamos que disfruten el tour!");
    }
}