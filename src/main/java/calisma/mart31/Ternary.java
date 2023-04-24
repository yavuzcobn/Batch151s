package calisma.mart31;

import java.util.Scanner;

public class Ternary {
    /*
        Example 6 =  Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
        Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
                 3 basamakli degilse cift olup olmadigini kontrol edin
        Cift ise "3 basamakli olmayan cift sayi" yazdirin
        Cift degilse " 3 basamakli olmayan tek sayi" yazdirin

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int sayi = input.nextInt();

        boolean pozitifse = sayi >0;
        boolean sifirdanBuyukUcBas = sayi >99 && sayi <1000;

        String sonuc = (pozitifse) ? (sifirdanBuyukUcBas) ? ("3 baasmakli ") : (sayi %2 ==0) ? " 3 basamakli olmayan cift sayi " : "3 basamakli olmayan tek sayi " : "Lutfen pozitif sayi giriniz";
        System.out.println(sonuc);



    }
}
