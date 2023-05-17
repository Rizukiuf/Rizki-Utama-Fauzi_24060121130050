/**
 * File      : MapTest.java		17/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas main MapTest
 * 
*/

import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        //kunci-> inteder, nilai->string
        Map<Integer,String> map = new HashMap<Integer,String>();
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kuci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        //bagaimana iterasi untuk mengambil keseluruhan
        //nilai dari kunci ? tulis pd laporan Anda!
        //petunjuk : gunakan iterasi seperti program ArrayListTest
        for (Integer i : key){
            System.out.println(i+": "+map.get(i));
        }
    }
}
