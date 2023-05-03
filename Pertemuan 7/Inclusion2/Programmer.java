/**
 * File      : Programmer.java		03/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas Programmer, turunan dari kelas Pegawai
 * 
*/

// package Inclusion2;

public class Programmer extends Pegawai {
    private int bonus = 450000;
    public Programmer(String nama){
        setNama(nama);
        // bonus = 450000;
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : "+bonus);
    }
}