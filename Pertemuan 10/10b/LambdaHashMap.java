/**
 * File      : LambdaHashMap.java		06/06/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Implementasi lambda pada HashMap, dengan pasangan key-value.
 * 
*/

import java.util.Map;
import java.util.HashMap;

public class LambdaHashMap {
    public static void main(String[] args) {
        Map<String,String> mahasiswa = new HashMap<String,String>();
        
        mahasiswa.put("24060121130050", "Rizki Utama Fauzi");
        mahasiswa.put("24060121130082", "Abyan Izzah Azzam Hastono");
        mahasiswa.put("24060121130070", "Daffa Aulia Rizky Karunia");
        mahasiswa.put("24060121140134", "Dhiya Ulhaq");
        mahasiswa.put("24060121130086", "Muhammad Rizki");

        mahasiswa.keySet().forEach((nim) -> System.out.println(nim+" - "+mahasiswa.get(nim)));
    }
}