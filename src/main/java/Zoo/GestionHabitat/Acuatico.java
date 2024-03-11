package Zoo.GestionHabitat;

import Zoo.GestionHabitat.Habitat;

public class Acuatico extends Habitat {

    private boolean puedenadar;
    private double profundidad;

    public Acuatico(int temperatura, int humedad, boolean limpieza, boolean puedenadar) {
        super(temperatura, humedad, limpieza, "Acuático");
        this.puedenadar = puedenadar;
        this.profundidad = profundidad;
    }

    public boolean isPuedenadar() {
        return puedenadar;
    }

    public void getPuedenadar(boolean puedenadar) {
        this.puedenadar = puedenadar;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void ajustarProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
}