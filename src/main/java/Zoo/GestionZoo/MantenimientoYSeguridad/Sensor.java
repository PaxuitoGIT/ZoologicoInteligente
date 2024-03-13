package Zoo.GestionZoo.MantenimientoYSeguridad;

public class Sensor {
    public String location;

    public Sensor(String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

    public void activar() {
        System.out.println("El sensor en " + location + " ha detectado movimiento...");
    }
}