package practice.day_01_practice;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz...");
        String Ad = input.nextLine();

        System.out.println("Lutfen soyadinizi giriniz...");
        String Soyad = input.nextLine();

        System.out.println("Lutfen yasinizi giriniz...");
        int Yas = input.nextInt();

        System.out.println("Lutfen boyunuzu giriniz...");
        int Boy = input.nextInt();

        System.out.println("Lutfen kilonuzu giriniz...");
        int Kilo = input.nextInt();

        System.out.println("Adı : "+ Ad);
        System.out.println("Soyadı : " + Soyad);
        System.out.println("Yas : " + Yas);
        System.out.println("Boy : " + Boy);
        System.out.println("Kilo : " + Kilo);

        System.out.println("Adı: " + Ad + "\n" + "Soyad: " + Soyad + "\n" + "Yas: " + Yas + "\n" + "Boy: " + Boy + "\n" + "Kilo: " + Kilo);

    }


}
