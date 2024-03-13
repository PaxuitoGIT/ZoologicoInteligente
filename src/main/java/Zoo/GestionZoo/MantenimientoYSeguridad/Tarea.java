package Zoo.GestionZoo.MantenimientoYSeguridad;

import java.util.Date;

public class Tarea {
    private String descripcion;
    private Date fechaProgramada;
    private boolean esUrgente;
    private String estado;
    private Date fechaFinalizacion;

    public Tarea(String descripcion, Date fechaProgramada, boolean esUrgente, String estado) {
        this.descripcion = descripcion;
        this.fechaProgramada = fechaProgramada;
        this.esUrgente = esUrgente;
        this.estado = "Pendiente";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public boolean isEsUrgente() {
        return esUrgente;
    }

    public void setEsUrgente(boolean esUrgente) {
        this.esUrgente = esUrgente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }
}