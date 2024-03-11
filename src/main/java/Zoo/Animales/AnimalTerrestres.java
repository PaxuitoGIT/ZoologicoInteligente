package Zoo.Animales;


public class AnimalTerrestres extends Animal{
    boolean patas;
    boolean cola;
    boolean pelaje;
    String tipo;

    public AnimalTerrestres(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, String id, String tipo, int edad, double peso, boolean patas, boolean cola, boolean pelaje) {
        super(especie, nombre, alimentacion, habitat, comportamiento, salud, id, true, true, true);
        this.patas = patas;
        this.cola = cola;
        this.pelaje = pelaje;
        this.tipo = tipo;
    }

    public AnimalTerrestres(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, String id, boolean esSaludable, boolean seComporta, boolean seAlimenta) {
        super(especie, nombre, alimentacion, habitat, comportamiento, salud, id, esSaludable, seComporta, seAlimenta);
    }

    public boolean isPatas() {
        return patas;
    }

    public void setPatas(boolean patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "animal_terrestres [patas=" + patas + ", cola=" + cola + ", pelaje=" + pelaje
                + ", tipo=" + tipo + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
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
    public int getEdad() {
        // TODO Auto-generated method stub
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        // TODO Auto-generated method stub
        super.setEdad(edad);
    }

    @Override
    public double getPeso() {
        // TODO Auto-generated method stub
        return super.getPeso();
    }

    @Override
    public void setPeso(double peso) {
        // TODO Auto-generated method stub
        super.setPeso(peso);
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public void setId(String id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }

    @Override
    public String getComportamiento() {
        // TODO Auto-generated method stub
        return super.getComportamiento();
    }

    @Override
    public String getAlimentacion() {
        // TODO Auto-generated method stub
        return super.getAlimentacion();
    }


}