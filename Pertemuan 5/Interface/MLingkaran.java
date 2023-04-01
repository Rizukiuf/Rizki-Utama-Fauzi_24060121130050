/**
 * File      : MLingkaran.java		01/04/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas yang berisi driver dari kelas lingkaran
 * 
*/

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari lingkaran: ");
        Lingkaran lingkaran = new Lingkaran(scan.nextDouble());
        scan.close();
        System.out.println("Luas lingkaran dengan jejari "+lingkaran.jejari+" satuan adalah "+lingkaran.hitungLuas());
    }
}
