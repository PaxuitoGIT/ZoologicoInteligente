package Zoo.GestionZoo.Administracion;

import java.util.ArrayList;
import java.util.List;

public class AdministracionRecursos {
    public List<Recurso> recursos;
    public List<Pedido> pedidos;
    public List<Proveedor> proveedores;

    public AdministracionRecursos() {
        this.recursos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.proveedores = new ArrayList<>();
    }

    public List<Recurso> getRecursos() {
        return new ArrayList<>(recursos);
    }

    public List<Pedido> getPedidos() {
        return new ArrayList<>(pedidos);
    }

    public List<Proveedor> getProveedores() {
        return new ArrayList<>(proveedores);
    }

    public void agregarRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void agregarProveedor(Proveedor proveedor) {
        this.proveedores.add(proveedor);
    }
}