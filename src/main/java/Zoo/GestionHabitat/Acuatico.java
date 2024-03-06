package Zoo.GestionHabitat;

import Zoo.GestionHabitat.Habitat;

public class Acuatico extends Habitat {

    boolean puedenadar;

    public Acuatico(int temperatura, int humedad, boolean limpieza, boolean puedenadar) {
        super(temperatura, humedad, limpieza);
        this.puedenadar = puedenadar;
    }

    public boolean isPuedenadar() {
        return puedenadar;
    }

    public void getPuedenadar(boolean puedenadar) {
        this.puedenadar = puedenadar;
    }

    private double profundidad;

    public double getProfundidad() {
        return profundidad;
    }

    public void ajustarProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
}