/**
 * File      : Car.java		03/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas Car, turunan dari kelas Vehicle
 * 
*/

// package Inclusion1;

public class Car extends Vehicle {
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}