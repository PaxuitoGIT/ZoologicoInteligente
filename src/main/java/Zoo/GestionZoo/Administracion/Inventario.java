package Zoo.GestionZoo.Administracion;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Recurso> recursos;

    public Inventario() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }

    public void eliminarRecurso(Recurso recurso) {
        this.recursos.remove(recurso);
    }
}
