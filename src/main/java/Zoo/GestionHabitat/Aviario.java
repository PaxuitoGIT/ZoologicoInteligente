package Zoo.GestionHabitat;

public class Aviario extends Habitat {

    private boolean puedenVolar;
    private double altura;

    public Aviario(int temperatura, int humedad, boolean limpieza, String nombre, String id, String informacion, boolean puedenVolar, double altura) {
        super(temperatura, humedad, limpieza, nombre, id, informacion);
        this.puedenVolar = puedenVolar;
        this.altura = altura;
    }

    public boolean isPuedenVolar() {
        return puedenVolar;
    }

    public void setPuedenVolar(boolean puedenVolar) {
        this.puedenVolar = puedenVolar;
    }

    public double getAltura() {
        return altura;
    }

    public void ajustarAltura(double altura) {
        this.altura = altura;
    }


}
