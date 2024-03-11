package Zoo.GestionHabitat;

public class Aviario extends Habitat {

    private boolean puedenVolar;
    private double altura;

    public Aviario(int temperatura, int humedad, boolean limpieza, boolean puedenVolar, double altura) {
        super(temperatura, humedad, limpieza, "Aviario");
        this.puedenVolar = puedenVolar;
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
