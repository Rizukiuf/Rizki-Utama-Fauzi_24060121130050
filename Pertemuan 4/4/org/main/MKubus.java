/**
 * File      : MKubus.java		15/03/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : driver class untuk bangun ruang kubus
 * 
 */
 
package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(5);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Alas Kubus dengan panjang sisi " + bujurSangkar.getPanjangSisi() + " adalah " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus dengan panjang sisi " + bujurSangkar.getPanjangSisi() + " adalah " + kubus.hitungVolume());
	}
}