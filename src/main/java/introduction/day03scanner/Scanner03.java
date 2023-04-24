package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //Kullanicidan adresini aliniz ve ekrana yazdiriniz.
    // next() methodu kullanicidan tek kelimeli String'i olmak icin kullanilir.
    //nextLine() methodu kullanicidan cok kelimeli String'i almak icin kullanilir.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adresinizi giriniz...");

        String address = input.nextLine();
        System.out.println(address);
    }

}
