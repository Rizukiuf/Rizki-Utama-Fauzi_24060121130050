/**
 * File      : BangunDatar.java		01/04/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas abstrak, berisi abstraksi bangun datar
 * 
*/

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);
    public void setLuas(double luas){
        this.luas = luas;
    }
    public double getLuas(){
        return luas;
    }
}
