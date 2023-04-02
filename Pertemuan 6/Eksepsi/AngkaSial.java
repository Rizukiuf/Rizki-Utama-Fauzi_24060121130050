/**
 * File      : AngkaSial.java		02/04/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Program penggunaan exception buatan sendiri.
 * Pengenalan klausa 'throw' dan 'throws'
 * 
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!");
        }
    }
}

//Jawab Pertanyaan
//1
//Ketika eksepsi terjadi, baris {System.out.println(angka+" bukan angka sial");}
//tidak akan dieksekusi, karena sudah dilempar sebagai kesalahan
//(throw ke kelas eksepsi tereksekusi), sehingga ekseskusi method sudah
//dihentikan/program keluar dari method tersebut.

//2
//Baris {catch (AngkaSialException ase) {...}} akan dieksekusi setelah throw
//ke kelas eksepsi tereksekusi, sehingga ketika mencoba method cobaAngka
//dengan parameter 13 pada blok try, throw tereksekusi, dan blok catch dijalankan.

//Sebagai tambahan pada blok try, baris-baris setelah baris yang terkena eksepsi
//tidak akan dijalankan, karena setelah catch dijalankan, dilanjutkan
//finally (kalau ada), lalu program selesai.
