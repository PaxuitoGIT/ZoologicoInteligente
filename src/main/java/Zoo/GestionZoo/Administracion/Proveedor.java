package Zoo.GestionZoo.Administracion;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    private String nombre;
    private List<Recurso> suministros;

    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.suministros = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        this.suministros.add(recurso);
    }

    public void eliminarRecurso(Recurso recurso) {
        this.suministros.remove(recurso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Recurso> getSuministros() {
        return new ArrayList<>(suministros);
    }
}