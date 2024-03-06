package Zoo;

public class Acuatico extends Habitat {
    private double profundidad;

    public double getProfundidad() {
        return profundidad;
    }

    public void ajustarProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
}