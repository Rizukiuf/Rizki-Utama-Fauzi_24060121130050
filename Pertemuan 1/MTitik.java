/**
 * File      : MTitik.java		01/03/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Kelas yang berisi main dari Titik
 * 
 */

class MTitik{
	public static void main(String[] args){
		Titik titik1 = new Titik();
		titik1.setAbsis(1.0);
		titik1.setOrdinat(2.0);
		Titik titik2 = new Titik();
		titik2.setAbsis(3.0);
		titik2.setOrdinat(4.5);
		Titik titik3 = new Titik(9.9,12);
		
		int counterTitik = titik1.getCounterTitik();
		
		System.out.println("Jumlah objek titik= " + counterTitik);
		System.out.println("titik1(" + titik1.getAbsis() + ", " + titik1.getOrdinat() + ")");
		System.out.println("titik2(" + titik2.getAbsis() + ", " + titik2.getOrdinat() + ")");
		System.out.println("titik3(" + titik3.getAbsis() + ", " + titik3.getOrdinat() + ")");
	}
}
