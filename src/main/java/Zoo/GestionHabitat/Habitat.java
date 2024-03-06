package Zoo.GestionHabitat;

public class Habitat {
    private double temperatura;
    private double humedad;
    private boolean limpieza;

    public Habitat(int temperatura, int humedad, boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public void setHumedad(double humedad) {
        this.humedad = humedad;
    }

    public boolean isLimpieza() {
        return limpieza;
    }

    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }
}
