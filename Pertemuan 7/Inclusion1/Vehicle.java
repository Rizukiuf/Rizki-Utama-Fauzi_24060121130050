/**
 * File      : Vehicle.java		03/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas Vehicle sebagai Super Class
 * 
*/

// package Inclusion1;

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance*price;
        System.out.println("vehicle price = "+fare);
    }
}