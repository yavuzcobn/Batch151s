package practice.day_02_practice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
            Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
            Ternary kullanarak;
            Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
            Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi Giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi Giriniz");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1==sayi2 ? ("Sayılar Birbirine Esit"):(sayi1>sayi2 ? ("Buyuk sayi : "+ sayi1) : ("Buyuk sayi : "+ sayi2)));


    }
}
