package Zoo.GestionZoo.MantenimientoYSeguridad;

public class Sensor {
    private final String location;

    public Sensor(String location) {
        this.location = location;
    }

    public void detectMovement() {
        System.out.println("El sensor en " + location + " ha detectado movimiento...");
    }
}