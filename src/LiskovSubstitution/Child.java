package LiskovSubstitution;

public class Child  extends  Person{

    public Child(String dni, String nombre, String apellidos, String tarjeta) {
        super(dni, nombre, apellidos, tarjeta);
    }

    @Override
    public void pay() {
        System.out.println("Im a child and i can paid anythings, but i should not paid.");;
    }
}
