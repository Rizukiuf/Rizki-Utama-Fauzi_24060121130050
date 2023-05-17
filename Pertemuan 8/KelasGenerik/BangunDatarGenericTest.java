/**
 * File      : BangunDatarGenericTest.java		17/05/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : kelas main untuk Kelas Generic BangunDatarGeneric
 * 
*/

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<BangunDatar> bdg = new BangunDatarGeneric<BangunDatar>();
        bdg.set(l);
        System.out.println("keliling lingkaran : "+bdg.hitungKeliling());
        System.out.println("tipe generic : "+bdg.get().getClass().getName());

        Segitiga s = new Segitiga(4, 5, 6);
        bdg.set(s);
        System.out.println("keliling segitiga : "+bdg.hitungKeliling());
        System.out.println("tipe generic : "+bdg.get().getClass().getName());
    }
}