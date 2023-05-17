/**
 * File      : ArrayListTest.java		17/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas main ArrayListTest
 * 
*/

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args) {
        //inisialisasi
        ArrayList<String> strings = new ArrayList<String>();
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //menghapus elemen
        strings.remove("praktikum");
        //iterasi pd seluruh ArrayLlist
        for(String s : strings){
            System.out.println(s+" ");
        }
    }
}