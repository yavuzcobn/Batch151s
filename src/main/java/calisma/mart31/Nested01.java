package calisma.mart31;

import java.util.Scanner;

public class Nested01 {
    public static void main(String[] args) {
     /*
        Example 3: Kullanicidan 3 tane sayi aliniz.
           Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
           Eger ucgen ise "eskenar Ucgen " olma durumunu kontrol ediniz.
           INFO = Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                  herhangi iki kenar farki ucuncu kenardan kucuk olmali
           a+b>c>a-b
           a+c>b>a-c
           b+c>a>b-c
           a=b=c ise eskenar ucgen
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 adet sayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int y = 1;
        int z = 1;
        int d = y<10 ? y++ : z++;
        System.out.println(y + ", "+ z + ", "+ d);
















    }
}
