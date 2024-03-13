package Zoo.GestionZoo.Administracion;

import java.util.ArrayList;
import java.util.List;

public class Proveedor {
    public String nombre;
    public List<Recurso> suministros;

    public Proveedor(String nombre) {
        this.nombre = nombre;
        this.suministros = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        this.suministros.add(recurso);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}