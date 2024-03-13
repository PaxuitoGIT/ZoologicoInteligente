package Zoo.GestionZoo.Visitantes;

public class TourAmanteAviario implements Tour {
    @Override
    public void realizarTour() {
        System.out.println("Bienvenidos al tour para amantes de los aviarios!");
        System.out.println("Primero, vamos a visitar el área de las aves rapaces, donde podrán ver águilas y halcones.");
        System.out.println("Luego, iremos al área de los pájaros exóticos, donde podrán ver loros y tucanes.");
        System.out.println("Después, iremos al área de los pájaros acuáticos, donde podrán ver patos y flamencos.");
        System.out.println("Finalmente, tendremos una actividad de alimentación de aves. Recuerden, siempre debemos respetar a los animales y seguir las instrucciones del guía.");
        System.out.println("¡Esperamos que disfruten el tour!");
        System.out.println();
    }
}
