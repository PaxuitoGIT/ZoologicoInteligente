package Zoo.GestionHabitat;

public class Terrestre extends Habitat {

    boolean puedeCaminar;

    public Terrestre(int temperatura, int humedad, boolean limpieza, boolean puedeCaminar) {
        super(temperatura, humedad, limpieza);
        this.puedeCaminar = puedeCaminar;
    }

    public boolean isPuedeCaminar() {
        return puedeCaminar;
    }

    public void getPuedeCaminar(boolean puedeCaminar) {
        this.puedeCaminar = puedeCaminar;
    }

    private String tipoDeSuelo;
    private String tipoDeSuelo() {
        return tipoDeSuelo;
    }

    public void cambiarTipoDeSuelo(String tipoDeSuelo) {
        this.tipoDeSuelo = tipoDeSuelo;
    }
}
