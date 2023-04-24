package practice.day_01_practice;

import java.util.Scanner;

public class C07_ifElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz...");
        int ilkSayi =input.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz...");
        int ikinci =input.nextInt();

        if (ilkSayi>ikinci){

            System.out.println("Ilk sayi ikinci sayidan buyuk");
        }else {
            System.out.println("Ilk sayi ikinci sayidan buyuk degildir");
        }




    }
}
