package Zoo.GestionZoo.MantenimientoYSeguridad;

public class Camara {
    private final String location;

    public Camara(String location) {
        this.location = location;
    }

    public void record() {
        System.out.println("La cámara en " + location + " está grabando...");
    }
}