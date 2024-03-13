package Zoo.GestionZoo.Administracion;

public class Recurso {
    private String nombre;
    private int cantidad;

    public Recurso(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    class Alimento extends Recurso {
        public Alimento(String nombre, int cantidad) {
            super(nombre, cantidad);
        }
    }
    class Medicamento extends Recurso {
        public Medicamento(String nombre, int cantidad) {
            super(nombre, cantidad);
        }
    }
    class Equipamiento extends Recurso {
        public Equipamiento(String nombre, int cantidad) {
            super(nombre, cantidad);
        }
    }
}
