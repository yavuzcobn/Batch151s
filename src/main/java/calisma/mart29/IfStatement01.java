package calisma.mart29;

import java.util.Scanner;

public class IfStatement01 {

    //Soru 7
    /*
         Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
        a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
        b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
        c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
        d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
        yazmalıdır.
        e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
        yazmalıdır.
        Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda
        görünmelidir. Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve
        "Geçersiz Ad"
     */


    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz");
//        String isim = input.nextLine();
//
//        String adinIlkHarfi = isim.substring(0,1);
//        Integer boslukIndex = isim.trim().indexOf(' ');
//        String soyadinIlkHarfi = isim.substring(boslukIndex +1, boslukIndex +2 );
//        Boolean adinIlkHarfiBuyukMu = (adinIlkHarfi.charAt(0)>='A' && adinIlkHarfi.charAt(0)<='Z');
//        Boolean soyadinIlkHarfiBuyukMu = (soyadinIlkHarfi.charAt(0)>='A' && soyadinIlkHarfi.charAt(0)<='Z');
//
//        if (boslukIndex==-1){
//            System.out.println("Ad veya sayadi eksik");
//        }if (!adinIlkHarfiBuyukMu || !soyadinIlkHarfiBuyukMu){
//            System.out.println("Bas harflerinde hata");
//        }if (isim.replaceAll("\\s", "").length()==0){
//            System.out.println("Isim girilmedi");
//        }if (isim.replaceAll("\\s", "").replaceAll("[A-Za-z]","").length()>0){
//            System.out.println("Gecersiz isim");
//        }

        //Soru 8:

        String eyaletIsim = "AL";

        if (eyaletIsim.length()>2){
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz ");

        }if (eyaletIsim.replaceAll("[^a-z]","").length()!=0){
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");

        }if (eyaletIsim.replaceAll("[A-Z]","").length()!=0){
            System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez.\n" +
                    "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        }else {
            System.out.println("Dogru kisaltma girdiniz");
        }

        //9
//        double a = 10.2, b=5;
//        String operator = "+";
//
//        if(operator.equals("+")){
//            System.out.println(a+b);
//
//        }else if(operator.equals("-")){
//            System.out.println(a-b);
//
//        }else if(operator.equals("*")){
//            System.out.println(a*b);
//
//        }else if(operator.equals("/")) {
//            System.out.println(a / b);
//        }

        //10
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen BMI degerinizi giriniz");
        double bmi = scan.nextDouble();

        if (bmi<0){
            System.out.println("Gecersiz BMI degeri");
        } else if (bmi<18.5) {
            System.out.println("Zayif");

        }else if (bmi>=18.5&& bmi<=24.9) {
            System.out.println("Normal ağırlık");

        }else if (bmi>=25&& bmi<=29.9) {
            System.out.println("Fazla kilolu");

        }else {
            System.out.println("OBEZITE");
        }




    }


}
