/**
 * File      : Sewa.java		03/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas driver/main untuk Inclusion1
 * 
*/

// package Inclusion1;

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}