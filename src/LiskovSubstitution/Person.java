package LiskovSubstitution;

public class Person {
    private String dni;
    private String nombre;
    private String apellidos;
    private String tarjeta;



    public Person(String dni, String nombre, String apellidos, String tarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tarjeta = tarjeta;
    }

    public void pay(){
        System.out.println("Pay it off");
    }
}
