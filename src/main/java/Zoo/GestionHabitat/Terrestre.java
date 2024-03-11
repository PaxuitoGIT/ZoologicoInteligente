package Zoo.GestionHabitat;

public class Terrestre extends Habitat {

    boolean puedeCaminar;
    private String tipoDeSuelo;

    public Terrestre(int temperatura, int humedad, boolean limpieza, boolean puedeCaminar) {
        super(temperatura, humedad, limpieza);
        this.puedeCaminar = puedeCaminar;
    }

    public boolean isPuedeCaminar() {
        return puedeCaminar;
    }

    public void setPuedeCaminar(boolean puedeCaminar) {
        this.puedeCaminar = puedeCaminar;
    }

    private String getTipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void setTipoDeSuelo(String tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }
}
