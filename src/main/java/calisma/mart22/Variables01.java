package calisma.mart22;

import java.util.Scanner;

public class Variables01 {
    public static void main(String[] args) {

        //1. Soru:
        double telefon = 1200.499;
        double laptop = 23400.999;
        double xbox = 9900.50;
        System.out.println(telefon+laptop+xbox);//34501.998

        //2. Soru:
        float f1 = 12.99F;
        long l1 = 1985L;
        int i1 = 196;
        System.out.println(f1*l1*i1);//5053889.5

        //3. Soru:
        /*
        Basit faizi bulmak için bir kod yazınız.
        Not: Basit faiz formülü = anapara * oran * yılDegeri /100
         */

        double para =10000 , oran = 5, yilDegeri=3;
        double basitFaiz = para*oran*yilDegeri/100;
        System.out.println("basitFaiz = " + basitFaiz);//1500.0

        //4. Soru:
        String s = "degisken";
        long l2 = 10L;
        long l3 = 20L;
        System.out.println(s + (l2+l3));//degisken30
        System.out.println(s + (l2*l3));//degisken200

        //5. Soru:
        boolean a = true;
        boolean b = false;
        System.out.println(a + " " + b);//true false

        long kitap = 50;
        long defter = 25;
        long laptap =1500;
        System.out.println((2*kitap)+(4*defter)+(3*laptap));//4700

        //6. Soru:
        float kitap1 = 12.99F, defter1 = 23.45F, laptop1 = 34.12F;
        float toplamFiyat= 2* kitap1 + 4* defter1 + 3*laptop1;
        System.out.println("Toplam fiyat : " + toplamFiyat);//222.14

        //7. Soru:
        Scanner input = new Scanner(System.in);
        System.out.println("2 sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        int bos = sayi1;
        sayi1=sayi2;
        sayi2=bos;
        System.out.println(sayi1);
        System.out.println(sayi2);

    }
}
