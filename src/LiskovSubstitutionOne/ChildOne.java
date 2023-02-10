package LiskovSubstitutionOne;

public class ChildOne extends PersonOne {
    private Adult adult;
    public ChildOne(String nombre, String apellido, Adult adult){
        super(nombre, apellido);
        this.adult=adult;
    }
    public void pay(){
        adult.pay();
    }
}
