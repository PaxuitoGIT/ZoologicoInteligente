package Zoo.GestionZoo.Visitantes;

public class TourAmanteAcuaticos implements Tour {
    @Override
    public void realizarTour() {
        System.out.println("Bienvenidos al tour para amantes de los animales acuáticos!");
        System.out.println("Primero, vamos a visitar el área de los animales marinos, donde podrán ver delfines y ballenas.");
        System.out.println("Luego, iremos al área de los animales de agua dulce, donde podrán ver nutrias y dorados.");
        System.out.println("Después, iremos al área de los animales de agua salada, donde podrán ver tiburones y mantarrayas.");
        System.out.println("Finalmente, tendremos una actividad de alimentación de animales. Recuerden, siempre debemos respetar a los animales y seguir las instrucciones del guía.");
        System.out.println("¡Esperamos que disfruten el tour!");
    }
}
