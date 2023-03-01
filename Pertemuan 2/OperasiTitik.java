/**
 * File      : MOperasiTitik.java		01/03/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Kelas yang berisi class OperasiTitik
 * 
 */

class OperasiTitik{
	//method untuk merefleksikan titik terhadap sumbu X menggunakan prosedur void
	private void refleksiSumbuX(Titik titik){
		titik.setOrdinat(-titik.getOrdinat());
	}
	//method untuk merefleksikan titik terhadap sumbu Y menggunakan prosedur void
	private void refleksiSumbuY(Titik titik){
		titik.setAbsis(-titik.getAbsis());
	}
	//fungsi2 yang memanggil method/prosedur sebelumnya, yang mengeluarkan titik yang
	//sudah direfleksi
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}