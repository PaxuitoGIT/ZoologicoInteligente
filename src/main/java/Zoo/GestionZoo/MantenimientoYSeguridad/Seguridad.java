package Zoo.GestionZoo.MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class Seguridad {
    private final List<Camara> cameras;
    private final List<Sensor> sensors;

    public Seguridad() {
        this.cameras = new ArrayList<>();
        this.sensors = new ArrayList<>();
    }

    public void addCamera(Camara camera) {
        this.cameras.add(camera);
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    public void monitorZoo() {
        for (Camara camera : this.cameras) {
            camera.record();
        }
        for (Sensor sensor : this.sensors) {
            sensor.detectMovement();
        }
    }
}