package javaders.day03methodcreationscanner;

import static java.awt.AWTEventMulticaster.add;

public class C03_MethodCreation {

    /*

        Java method nasil olusturulur?

        1. Javada method main'in disinda olusturulur
        2. Tekrar tekrar kullanmamiz gerekiyorsa method olustururuz
        Access Modifier + Return Type + methodIsmı + ( ) + { }
        isle yapilecek olan sayilari methodIsmi () parantezin icine eklenir


        Scope== Kapsam Alani bir variable'nin bir digerin, hangi alanda kapsam icinde oldugunu gosterir

     */

    public static void main(String[] args) {

        //1) Verilen iki sayiyi toplayan methodu olusturunuz
        toplamaYap(30,87);

        //2) Verilen iki sayisyi toplayan methodu yaziniz
        multiply(46,12);

        //3) Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplana method'u olusturunuz ve kullaniniz
        System.out.println(toplamaCarprma(30, 40, 50));

        //4) Verilen bir ondalikli sayinin kupunu hesaplayin kullandiran bir method olusturunuz
        double sayininKubu = getCube(5.6);
        System.out.println("Sayinin Kubu = " + sayininKubu);

        //5) Dairenin cevresini hesaplayan methodu olusturunuz ve kullaniniz

        System.out.println("daireninCevresi = " + daireninCevresi(2));

    }//main

    private static double daireninCevresi(int r) {

        return 2*314*r/100;
    }

    static double getCube(double v) {
        return v*v*v;
    }

    public static int toplamaCarprma(int a, int b, int c) {
        return a*b+c;
    }

    private static void multiply(int a, int b) {
        System.out.println(a*b);
    }

    static void toplamaYap(int a, int b) {//Access modifiers default oldugu icin bir sey yazilmadi
         System.out.println(a+b);

    }

}//class
