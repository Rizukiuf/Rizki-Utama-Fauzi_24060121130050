/**
 * File      : Asersi2.java		02/04/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Program untuk demo asersi, yg akan menolak input
 * jari-jari lingkaran yg bernilai nol
 * 
*/

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari-jari tidak boleh nol!";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("keliling lingkaran = "+kelilingLingkaran);
    }
}

//Jawab Pertanyaan
//Secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
//Jika mengikuti keterangan, input jariJari yang diharapkan adalah
//tidak boleh nol, maka seharusnya kodingan yang tepat adalah 
//assert(jariJari!=0):"jari-jari tidak boleh nol!";
//Tetapi jika mengikuti kodingan, maka keterangan apabila melanggar
//asersi seharusnya "jari-jari harus bernilai positif", sehingga
//assert(jariJari>0):"jari-jari harus bernilai positif!";

//Di sisi lain, konsep dari sebuah lingkaran itu semestinya memiliki
//jari-jari non negatif (bisa nol atau bilangan positif),
//jadi yang lebih tepat secara konsep lingkaran adalah
//assert(jariJari>=0):"jari-jari tidak boleh negatif!";