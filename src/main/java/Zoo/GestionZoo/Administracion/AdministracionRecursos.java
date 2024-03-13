package Zoo.GestionZoo.Administracion;

import java.util.ArrayList;
import java.util.List;

public class AdministracionRecursos {
    private List<Recurso> recursos;

    public AdministracionRecursos() {
        this.recursos = new ArrayList<>();
    }

    public void agregarRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }

    public void eliminarRecurso(Recurso recurso) {
        this.recursos.remove(recurso);
    }

    public Recurso buscarRecurso(String nombre) {
        for (Recurso recurso : this.recursos) {
            if (recurso.getNombre().equals(nombre)) {
                return recurso;
            }
        }
        return null;
    }
}