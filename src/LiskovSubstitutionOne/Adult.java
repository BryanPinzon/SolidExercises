package LiskovSubstitutionOne;

public class Adult extends PersonOne {
    private String item;
    private String dni;

    public Adult(String nombre, String apellido, String item, String dni){
        super(nombre,apellido);
        this.item=item;
        this.dni=dni;
    }
    public void pay(){
        System.out.println("paid it since the adult");
    }
}
