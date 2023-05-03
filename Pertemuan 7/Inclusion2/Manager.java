/**
 * File      : Manager.java		03/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas Manager, turunan dari kelas Pegawai
 * 
*/

// package Inclusion2;

public class Manager extends Pegawai {
    private int tunjangan = 700000;
    public Manager(String nama){
        setNama(nama);
        // tunjangan = 700000;
    }
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+tunjangan);
    }
}