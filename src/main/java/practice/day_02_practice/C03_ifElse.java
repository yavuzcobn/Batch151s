package practice.day_02_practice;

import java.util.Scanner;

public class C03_ifElse {
    public static void main(String[] args) {
         /*
            Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
            Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola " 3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
            Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen uc karakterden uzun bir kelime giriniz");
        String str = input.next();
        String sonIndex =str.substring(str.length()-3);

        if (str.length()<4){
            System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz");
        }else {
            System.out.println(sonIndex + str + sonIndex);
        }



    }
}
