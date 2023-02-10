package DependecyInversion;

import javax.xml.crypto.Data;

public class PersonService {
    private DataBase dataBase;

    public PersonService(DataBase dataBase){ this.dataBase= dataBase;}

    public void savePerson(String nombre, String apellido){
        dataBase.savePerson(nombre,apellido);


    }

}
