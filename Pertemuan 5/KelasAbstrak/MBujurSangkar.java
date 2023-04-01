/**
 * File      : MBujurSangkar.java		01/04/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas yang berisi driver dari kelas bujurSangkar
 * 
*/

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bujurSangkar = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar: ");
        double sisi = scan.nextDouble();
        scan.close();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bujurSangkar.hitungLuas(sisi));
    }
}
