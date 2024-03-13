package Zoo.GestionZoo.MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Mantenimiento {
    private final List<Tarea> tareas;

    public Mantenimiento() {
        this.tareas = new ArrayList<>();
    }

    public void programarTarea(Tarea tarea) {
        this.tareas.add(tarea);
    }

    public void completarTarea(Tarea tarea) {
        tarea.setEstado("Completada");
        tarea.setFechaFinalizacion(new Date());
    }

    public List<Tarea> obtenerTareasPendientes() {
        List<Tarea> tareasPendientes = new ArrayList<>();
        for (Tarea tarea : this.tareas) {
            if (tarea.getEstado().equals("Pendiente")) {
                tareasPendientes.add(tarea);
            }
        }
        return tareasPendientes;
    }
}