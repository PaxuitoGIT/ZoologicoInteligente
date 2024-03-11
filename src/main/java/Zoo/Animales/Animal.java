package Zoo.Animales;

public class Animal {
    String especie;
    String nombre;
    String alimentacion;
    String habitat;
    String comportamiento;
    String salud;
    String id;
    boolean esSaludable;
    boolean seComporta;
    boolean seAlimenta;


    public Animal(String especie, String nombre, String alimentacion, String habitat, String comportamiento, String salud, String id, boolean esSaludable, boolean seComporta, boolean seAlimenta) {
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
    }

    public void buenaSalud(boolean esSaludable){
        if(esSaludable){
            System.out.println("es saludable");
        }else{
            System.out.println("no es saludable");
        }
    }

    public void buenComportamiento(boolean seComporta){
        if(seComporta){
            System.out.println("se comporta");
        }else{
            System.out.println("no se comporta");
        }
    }

    public void buenaAlimentacion(boolean seAlimenta){
        if(seAlimenta){
            System.out.println("se alimenta bien");
        }else{
            System.out.println("no se alimenta bien");
        }
    }

    public boolean isEsSaludable() {
        return esSaludable;
    }

    public void setEsSaludable(boolean esSaludable) {
        this.esSaludable = esSaludable;
    }

    public boolean isSeComporta() {
        return seComporta;
    }

    public void setSeComporta(boolean seComporta) {
        this.seComporta = seComporta;
    }

    public boolean isSeAlimenta() {
        return seAlimenta;
    }

    public void setSeAlimenta(boolean seAlimenta) {
        this.seAlimenta = seAlimenta;
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

    //Desarrollar funciones para registrar los animales, asegurando que se cumplan todas sus necesidades.
    public void alimentar(){
        System.out.println("El animal ha sido alimentado");
    }
    public void salud(){
        System.out.println("El animal ha sido revisado por el veterinario");
    }
    public void comportamiento(){
        System.out.println("El animal ha sido observado por el cuidador");
    }
    public void habitat(){
        System.out.println("El animal ha sido ubicado en su habitat");
    }
    public void setId(String id) {
        this.id = id;
    }

}