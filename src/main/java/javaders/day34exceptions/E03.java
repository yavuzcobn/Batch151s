package javaders.day34exceptions;

public class E03 {


    public static void main(String[] args) {

        System.out.println(getNumOfChars("Java"));//4
        System.out.println(getNumOfChars("Money"));//5
        System.out.println(getNumOfChars(""));//0
        System.out.println(getNumOfChars(null));////String'in degeri "null" oldugunda String Class'daki bazi methodlari kullanamayiz. Kullanirsaniz Java "NullPointerException" atar


    }

    //Bir String'deki character sayisini veren method olusturunuz

    public static int getNumOfChars(String s) {

        int result = 0;

        try {

            result = s.length();

        }catch (NullPointerException e){//NullPointerException String Class'da null ile uyumlu olmayan method'lar kullanildiginda atilir.

            System.out.println("Some String methods do not work with null...");

            System.out.println(e.getMessage());//Java'nin exception icin urettigi teknik mesaji varsa verir.

        }

        return result;

    }

}
