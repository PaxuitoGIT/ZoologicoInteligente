package Zoo.GestionZoo.MantenimientoYSeguridad;

import java.util.Calendar;
import java.util.Date;

public class Tarea {
    private final String descripcion;
    private final Date fechaProgramada;
    private final boolean esUrgente;
    private final String estado;
    private Date fechaFinalizacion;

    public Tarea(String descripcion, Date fechaProgramada, boolean esUrgente, String estado) {
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
        this.esUrgente = esUrgente;
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public boolean isEsUrgente() {
        return esUrgente;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 1);
        this.fechaFinalizacion = calendar.getTime();
    }
}