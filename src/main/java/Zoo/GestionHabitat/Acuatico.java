package Zoo.GestionHabitat;


public class Acuatico extends Habitat {

    private boolean puedenadar;
    private double profundidad;

    public Acuatico(int temperatura, int humedad, boolean limpieza, String nombre, String id, String informacion, boolean puedenadar, double profundidad) {
        super (temperatura, humedad, limpieza, nombre, id, informacion);
        this.puedenadar = puedenadar;
        this.profundidad = profundidad;
    }

    public void getPuedenadar(boolean puedenadar) {
        this.puedenadar = puedenadar;
    }
    public boolean isPuedenadar() {
        return puedenadar;
    }


    public double getProfundidad() {
        return profundidad;
    }

    public void ajustarProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
}