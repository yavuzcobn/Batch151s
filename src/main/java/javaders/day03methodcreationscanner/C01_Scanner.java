package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        /*
            Kullanicidan data almak icin Scanner Classi kullanilir ve bir input/scan/scanner Objesi olusturulur
            Bu objeyi new key worduyle olustururuz


         */
        //1. Adim : Object olusturma
        Scanner input = new Scanner(System.in);

        //. Adim : Kullaniciya ne yapacagini soyluyoruz
        System.out.println("Lutfen maasinizi giriniz");

        //2: Adim : Kullanicidan alinan datalar yapisina ve buyuklugune gore bir Variable'a yarleştirilir.

        long maas = input.nextLong();

        //4. Adim : Kulanicinin verdigi bilgileri teyit vs icin yazdiriyoruz

        System.out.println("maas = " + maas);

        // Kullaniciya cinsiyetini, adini, memleketini, yasini, boyunu
        // ulkesini sevip sevmediğini, soran bir program yaziniz

        System.out.println("Lutfen cinsiyetiniz Kadin ise K erkek ise E olarak giriniz");
        char cinsiyet = input.next().charAt(0);//erkek
        //System.out.println("cinsiyet = " + cinsiyet);//e

        System.out.println("Lutfen adinizi giriniz");
        input.nextLine();
        String isim = input.nextLine();//Tolgahan Metehan
        //input.nextLine();
        //System.out.println("isim = " + isim);

        System.out.println("Lutfen memleketinizi giriniz");
        String memleket = input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();


        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi True/False seklinde giriniz");
        boolean seviyiyorMu = input.nextBoolean();

        System.out.println("**************Tolgahan************");
        System.out.println("isim : " + isim +"\ncinsiyet : " + cinsiyet+"\nmemleket : " + memleket +
                "\nyas : "+yas+"\nboy : "+boy+ "\nseviyorMu : "+seviyiyorMu);







    }
}
