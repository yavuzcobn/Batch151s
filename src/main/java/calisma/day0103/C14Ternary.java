package calisma.day0103;

import java.util.Scanner;

public class C14Ternary {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /*
        System.out.println("birinci sayiyi giriniz");
        int num1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int num2= input.nextInt();

        System.out.println(num1<num2 ? num1 : num2);

        System.out.println("Bir tamsayi giriniz");
        int num3 = input.nextInt();
        System.out.println(num3%2==0 ? "cift sayi" : "tek sayi");

        System.out.println("Bir sayi giriniz");
        int num4 = input.nextInt();
        System.out.println(num4>0 ? (num4) : (num4*-1));
        */

        System.out.println("Bir sayi giriniz");
        int num5 = input.nextInt();

        Object sifir = num5>0 ? ("Sayi pozitif"): (num5*num5);

        System.out.println(sifir.equals(0) ? "Gecerli sayi giriniz" : sifir);

    }
}
