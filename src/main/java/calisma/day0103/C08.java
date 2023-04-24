package calisma.day0103;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin(% KULLANMADAN)

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();
        sayi = Math.abs(sayi);

        int sum =0;

        for (int i =sayi; i>0; i=i/10){

            sum = sum +i%10;

        }
        System.out.println(sum);

// 2. yol macilis kullanmadan

        toplaRka(2585);

    }

    public static void toplaRka(int num){

        num=Math.abs(num);

        String num1=String.valueOf(num);

        int sum=0;

        for(int i=0;i<num1.length();i++){
            String a=num1.substring(i,i+1);
            int say=Integer.valueOf(a);
            sum+=say;

        }
        System.out.println(sum);

    }
}
