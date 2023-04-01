/**
 * File      : Lingkaran.java		01/04/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Kelas implementasi IArea berupa
 * cata menghitung luas lingkaran
 * 
*/

import static java.lang.Math.PI;

public class Lingkaran implements IArea {
    public double jejari;

    public Lingkaran(double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
