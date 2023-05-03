/**
 * File      : Pegawai.java		03/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas Pegawai sebagai Super Class
 * 
*/

// package Inclusion2;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilData(){
        System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
    }
}