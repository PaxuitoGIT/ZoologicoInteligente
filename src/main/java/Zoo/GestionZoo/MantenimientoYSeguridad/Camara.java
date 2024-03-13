package Zoo.GestionZoo.MantenimientoYSeguridad;

public class Camara {
    public String location;

    public Camara(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void activar() {
        System.out.println("La cámara en " + location + " está grabando...");
    }
}