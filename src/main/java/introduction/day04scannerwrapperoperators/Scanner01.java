package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 5 basamakli bir sayi giriniz...");

        int number = input.nextInt();
        //bir sayinin son rakamini alabilmek icin o sayiyi 10'a bolup kalani almaliyiz.
        //%==>modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        //dolasisiyla %10 her zaman birler basamaginda bulunan sayiyi verir.
        //bir tamsayisis bir tamsayiya bolerseniz java sonucu kesinlikle bir tamsayi yapar
        //java bu durumda yuvarlama yapmaz ondalikli kismi iptal eder
        //dolayisiyla bur tamsayiyi 10'a bolersek birler basamagını silmis oluruz

        //son rakami al
        int lastDigit = number%10;
        //sayi kucult
        number = number/10;

        //sondan ikinci rakami al
        int lastSecondDigit = number%10;
        //sayi kucult
        number=number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        //sayi kucult
        number=number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        //sayi kucult
        number=number/10;

        // sondan besinci rakami al
        int lastFifithDigit = number%10;
        number= number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifithDigit);


    }

}

