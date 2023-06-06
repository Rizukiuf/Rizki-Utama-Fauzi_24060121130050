/**
 * File      : SerializePerson.java		31/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Program untuk serialisasi objek Person
 * 
*/

import java.io.*;
//class Person
class Person implements Serializable{
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Rizu");
        try{
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}