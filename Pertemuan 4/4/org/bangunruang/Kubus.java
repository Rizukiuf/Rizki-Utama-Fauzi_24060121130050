/**
 * File      : Kubus.java		15/03/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : representasi dasar dari objek kubus
 * 
 */
 
package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungLuasAlas(){
		return this.permukaan.hitungLuas();
	}
	
	public double hitungVolume(){
		return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
	}
}