package Zoo.GestionZoo.Administracion;

public class Pedido {
    public Recurso recurso;
    public int cantidad;
    public Proveedor proveedor;

    public Pedido(Recurso recurso, int cantidad, Proveedor proveedor) {
        this.recurso = recurso;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
}