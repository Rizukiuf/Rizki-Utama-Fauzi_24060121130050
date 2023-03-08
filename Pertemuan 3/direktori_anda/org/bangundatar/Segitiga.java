/**
 * File      : Segitiga.java		08/03/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : representasi dasar dari objek segitiga, turunan kelas poligon
 * 
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas, tinggi;
	
	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return alas * tinggi / 2;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
	}
	
}