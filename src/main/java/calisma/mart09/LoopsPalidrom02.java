package calisma.mart09;

import java.util.Scanner;

public class LoopsPalidrom02 {
    /*
    3) Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.

4. Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
Örnek; 223878 ´ 37
     */
    public static void main(String[] args) {

    Scanner input  = new Scanner(System.in);
    System.out.println("Lutfen bir cumle giriniz");
    String cumle = input.nextLine();
    palindrom(cumle);
    }
    public static void palindrom (String cumle) {

        if (cumle.equalsIgnoreCase(tersCevir(cumle))) {
            System.out.println("cumle palidrom");
        } else {
            System.out.println("Cumle palidrom degildir");
        }
    }
    public static String tersCevir (String cumle){
        String tersHali ="";

        for (int i = cumle.length()-1; i>=0;i-- ){
            String harf = cumle.substring(i, i+1);
            tersHali= tersHali+harf;
        }
        return tersHali;
    }

}
