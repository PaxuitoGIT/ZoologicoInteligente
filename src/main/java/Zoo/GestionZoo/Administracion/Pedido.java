package Zoo.GestionZoo.Administracion;

public class Pedido {
    private Recurso recurso;
    private int cantidad;
    private Proveedor proveedor;

    public Pedido(Recurso recurso, int cantidad, Proveedor proveedor) {
        this.recurso = recurso;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
}