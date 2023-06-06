/**
 * File      : Person.java		31/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Person database model
 * 
*/

public class Person {
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
