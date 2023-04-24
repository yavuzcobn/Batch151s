package calisma.day0103;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bininci sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        int buyukSayi = Math.max(sayi1, sayi2);
        int kucukSayi = Math.min(sayi1,sayi2);

        int toplam = 0;

        for (int i= kucukSayi; i<=buyukSayi;i++){
            toplam=toplam+i;
        }
        System.out.println(toplam);

        //Kullanicidan 10'dan kucuk bir tamsayi isteyin ve girilen sayinin faktoriyelini bulunuz (5!=5*4*3*2*1)

        System.out.println("Lutfen 10`dan kucuk bir sayiyi giriniz");
        int sayi = input.nextInt();
        int carpim=1;

        if (sayi>0 && sayi<10){
            for (int i=sayi; i>0; i--) {
                carpim = carpim * i;
            }System.out.println(sayi+"!="+carpim);
        } else if (sayi>10) {
            System.out.println("Lutfen gecerli bir sayi giriniz");
        }else{
            System.out.println("Lutfen pozitif bir sayi giriniz");
        }
    }
}
