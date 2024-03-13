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

    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    public void agregarProveedor(Proveedor proveedor) {
        this.proveedores.add(proveedor);
    }

    public void eliminarProveedor(Proveedor proveedor) {
        this.proveedores.remove(proveedor);
    }
}