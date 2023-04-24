package calisma.day0103;

import java.util.Scanner;

public class C07 {
    //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int s = Math.abs(input.nextInt());


        int counter = 0;
        for (int i = 1; i <= s; i++) {
            if (s % i == 0) {
                counter++;
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println(s + " sayisinin " + counter + " tane pozitif tam sayi boleni vardir.");
        System.out.println(s + " sayisinin " + counter * 2 + " tane tam sayi boleni vardir.");


    }
}
