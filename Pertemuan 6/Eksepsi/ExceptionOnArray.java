/**
 * File      : ExceptionOnArray.java		02/04/23
 * Penulis   : Rizki Utama Fauzi / 24060121130050
 * Deskripsi : Program penggunaan eksepsi menggunakan class libarary Java
 * 
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instasiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally{
            System.out.println("clean up code");
        }
    }
}
