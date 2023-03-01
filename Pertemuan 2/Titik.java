/**
 * File      : MOperasiTitik.java		01/03/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Kelas yang berisi class Titik
 * 
 */

class Titik{
	//atribut
	private double absis;
	private double ordinat;
	private static int counterTitik;
	//start tugas
	Titik(double a, double o){
		absis = a;
		ordinat = o;
		counterTitik++;
	}
	//end tugas
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	//metode
	public double getAbsis(){ //selektor/getter
		return absis;
	}
	public double getOrdinat(){
		return ordinat;
	}
	public int getCounterTitik(){
		return counterTitik;
	}
	public void setAbsis(double a){ ////mutator/setter
		absis = a;
	}
	public void setOrdinat(double o){
		ordinat = o;
	}
}