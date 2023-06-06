/**
 * File      : LambdaList.java		06/06/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * 
*/

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda dignakan sbg parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}