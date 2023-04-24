package calisma.mart31;

import java.util.Scanner;

public class If01 {

    public static void main(String[] args) {

        /*
        Example 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
           asagidaki tabloya gore yazdiran kodu olusturunuz

           0-4 ==> bebek
           5-12 ==> cocuk
           13-20 ==> genc
           21-30 ==> yetiskin
           Tanimlanmamis Evre
           Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz
         */

        int yas = 31;


        if (yas<0){
            System.out.println("Gecerli bir yas giriniz");
        }else if (yas<5){
            System.out.println("bebek");
        } else if (yas<13){
            System.out.println("cocuk");
        } else if  (yas<21){
            System.out.println("genc");
        } else if  (yas<31){
            System.out.println("yetiskin");
        } else{
            System.out.println("Tanimlanmamis Evre");

        }

        //ex2: kullanicidan alacaginiz 2 sayiyi yine kullaniciya sectireceginiz dort islemden biri
        // ile isleme koyup yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        double a = input.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double b = input.nextDouble();
        System.out.println("lütfen yapilacak islemi giriniz (+, - , *, /) seklinde");
        String ch = input.next();

        if (ch.equals("+")){
            System.out.println("Toplama isleminin sonucu: " + (a+b));
        }else if (ch.equals("-")){
            System.out.println("Cikartma isleminin sonucu: " + (a-b));
        }else if (ch.equals("*")){
            System.out.println("Carpma isleminin sonucu: " + (a*b));
        }else if (ch.equals("/")){
            System.out.println("Bolme isleminin sonucu: " + (a/b));
        }else {
            System.out.println("Lutfen gecerli bir islem giriniz");
        }







    }
}
