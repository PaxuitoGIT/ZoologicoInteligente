package Zoo.Animales;

public class Animal {
    protected int edad;
    protected double peso;
    String especie;
    String nombre;
    String alimentacion;
    String habitat;
    String comportamiento;
    String salud;
    String id;
    String informacion;
    boolean esSaludable;
    boolean seComporta;
    boolean seAlimenta;


    public Animal(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, String id, boolean esSaludable, boolean seComporta, boolean seAlimenta, String informacion) {
        this.especie = especie;
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.comportamiento = comportamiento;
        this.salud = salud;
        this.id = id;
        this.esSaludable = esSaludable;
        this.seComporta = seComporta;
        this.seAlimenta = seAlimenta;
        this.informacion = informacion;
    }

    public void mostrarInformacion() {
        System.out.println("Especie: " + getEspecie());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Alimentación: " + getAlimentacion());
        System.out.println("Hábitat: " + getHabitat());
        System.out.println("Comportamiento: " + getComportamiento());
        System.out.println("Salud: " + getSalud());
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "animales []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public void setId(String id) {
        this.id = id;
    }

}