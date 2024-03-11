package Zoo.GestionHabitat;

public class Habitat {
    protected double temperatura;
    protected double humedad;
    protected boolean limpieza;
    protected String nombre;
    protected String id;
    protected String informacion;

    public Habitat(int temperatura, int humedad, boolean limpieza, String nombre, String id, String informacion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;
        this.nombre = nombre;
        this.id = id;
        this.informacion = informacion;
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

    public String getNombre() {
        return nombre;
    }
    public String getId() {
        return id;
    }
    public String getInformacion() {
        return informacion;
    }
}
