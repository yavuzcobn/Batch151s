package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");

        int sayi = input.nextInt();//8649

        int birlerBas =sayi%10;//9

        int binler =sayi/1000;//8

        System.out.println(birlerBas+binler);//17


    }
}
