package calisma.day0103;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        //Kullanicidan bir pozitif sayi isteyin ve girilen sayinin carpim taplosunu olusturalim
        // 5
        //  1  2  3  4  5
        //  2  4  6  8 10
        //  3  6  9 12 15
        //  4  8 12 16 20
        //  5 10 15 20 25

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz...");
        int sayi = input.nextInt();

        for (int a =1; a<=sayi;a++ ){

            for (int b=1; b<=sayi; b++){
                System.out.printf("%3d",(b*a));
            }
            System.out.println();
        }
    }
}
