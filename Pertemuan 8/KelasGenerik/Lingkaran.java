/**
 * File      : Lingkaran.java		17/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas Lingkaran, turunan BangunDatar
 * 
*/

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}