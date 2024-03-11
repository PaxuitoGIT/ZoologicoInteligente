package Zoo.GestionZoo;

public class TourNinos implements Tour {
    @Override
    public void realizarTour() {
        System.out.println("Bienvenidos al tour para niños!");
        System.out.println("Primero, vamos a visitar el aviario, donde podrán ver diferentes tipos de aves.");
        System.out.println("Luego, iremos al área de los animales terrestres, donde podrán ver tigres.");
        System.out.println("Después, iremos al área de los animales acuáticos, donde podrán ver peces.");
        System.out.println("Finalmente, tendremos una actividad de alimentación de animales. Recuerden, siempre debemos respetar a los animales y seguir las instrucciones del guía.");
        System.out.println("¡Esperamos que disfruten el tour!");
    }
}
