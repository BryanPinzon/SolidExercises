
import DependecyInversion.DataBase;
import DependecyInversion.PersonService;
import LiskovSubstitution.Child;
import LiskovSubstitution.Person;
import LiskovSubstitutionOne.Adult;
import LiskovSubstitutionOne.ChildOne;

public class Main {
    public static void main(String[] args) {
        //Taste method for pay since Person.
        Child child1 = new Child("123","Tony","Martinez","943");
        child1.pay();
        System.out.println("=====Liskov substitution====");
        Adult adult = new Adult("Andres","Lopez","Golosinas","481");
        ChildOne child2 = new ChildOne("Andrey", "Cuevas", adult);
        child2.pay();

        //Taste database
        DataBase data = new DataBase();
        PersonService service1 = new PersonService(data);
        service1.savePerson("Enrique", "Prueba");





    }
}