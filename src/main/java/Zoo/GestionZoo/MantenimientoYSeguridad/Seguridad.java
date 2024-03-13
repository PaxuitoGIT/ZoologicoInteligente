package Zoo.GestionZoo.MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class Seguridad {
    public  List<Camara> camaras;
    public final List<Sensor> sensors;

    public Seguridad() {
        this.camaras = new ArrayList<>();
        this.sensors = new ArrayList<>();
    }

    public void monitorZoo() {
        for (Camara camara : this.camaras) {
            camara.activar();
            System.out.println("La cámara en " + camara.getLocation() + " está grabando...");
        }
        for (Sensor sensor : this.sensors) {
            sensor.activar();
            System.out.println("El sensor en " + sensor.getLocation() + " ha detectado movimiento...");
        }
    }
}