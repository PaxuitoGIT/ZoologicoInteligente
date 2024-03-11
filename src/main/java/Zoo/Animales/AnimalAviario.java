package Zoo.Animales;

public class AnimalAviario extends Animal {
    boolean vuela;
    boolean plumaje;
    boolean pico;
    String tipo_aviario;

    public AnimalAviario(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, String id, boolean vuela, boolean plumaje, boolean pico, String tipo_aviario) {
        super(especie, nombre, alimentacion, habitat, comportamiento, salud, id, true, true, true, "Informacion del animal aviario");
        this.vuela = vuela;
        this.plumaje = plumaje;
        this.pico = pico;
        this.tipo_aviario = tipo_aviario;
    }


    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public String getAlimentacion() {
        // TODO Auto-generated method stub
        return super.getAlimentacion();
    }

    @Override
    public String getComportamiento() {
        // TODO Auto-generated method stub
        return super.getComportamiento();
    }

    @Override
    public String getEspecie() {
        // TODO Auto-generated method stub
        return super.getEspecie();
    }

    @Override
    public String getHabitat() {
        // TODO Auto-generated method stub
        return super.getHabitat();
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return super.getNombre();
    }

    @Override
    public String getSalud() {
        // TODO Auto-generated method stub
        return super.getSalud();
    }

    @Override
    public void setAlimentacion(String alimentacion) {
        // TODO Auto-generated method stub
        super.setAlimentacion(alimentacion);
    }

    @Override
    public void setComportamiento(String comportamiento) {
        // TODO Auto-generated method stub
        super.setComportamiento(comportamiento);
    }

    @Override
    public void setEspecie(String especie) {
        // TODO Auto-generated method stub
        super.setEspecie(especie);
    }

    @Override
    public void setHabitat(String habitat) {
        // TODO Auto-generated method stub
        super.setHabitat(habitat);
    }

    @Override
    public void setNombre(String nombre) {
        // TODO Auto-generated method stub
        super.setNombre(nombre);
    }

    @Override
    public void setSalud(String salud) {
        // TODO Auto-generated method stub
        super.setSalud(salud);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

}