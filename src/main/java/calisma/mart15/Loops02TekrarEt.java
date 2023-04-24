package calisma.mart15;

import java.util.Scanner;

public class Loops02TekrarEt {
    public static void main(String[] args) {

            /*
        Her girdi satırı, tek boşluklarla ayrılmış bir veya birkaç sözcük içerir. Sözcükler değişmeden,
        her giriş satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
        Çıktınızın satırlarında sonunda veya başında boşluk olmamalıdır.
        Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüşecektir.
     */

        /*
        String s ="Kullanıcıdan bir String ve bir karakter alınız.\n" +
                    "String'de verilen karakterin ilk olduğu index ile son\n " +
                    "tekrarlandığı index arasındaki karakter\n";

        String ters ="";

        for (int i =s.length()-1; i>=0;i--){
            if(i!=0){
                ters = ters + s;
            }

        }
        System.out.println(ters);

         */




    /*
            Kullanıcıdan bir String ve bir karakter alınız.
        String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
        sayısını sayınız.
        Boşluk karakterlerini saymayınız.
        Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1,
        Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
        Örneğin; "Java is easy" - 'a' ==> 5
         "Java is easy" - 'w' ==> -1
         "Java is easy" - 'e' ==> -1
        Scanner scan = new Scanner(System.in
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String s = input.nextLine();

        System.out.println("Bir karakter giriniz :");
        char ch = input.next().charAt(0);

        int firsIdx = s.indexOf(ch);
        int lastIdx = s.lastIndexOf(ch);
        int counter = 0;

        if (firsIdx==lastIdx){
            System.out.println(-1);

        } else{
            for (int i=firsIdx+1; i<lastIdx;i++) {

                if (s.charAt(i)!=' '){
                    counter++;
                }
        }
            System.out.println(counter);
        }

        /*
        Belirli bir arrayden, toplamı belirli bir sayı olan tüm çiftleri bulunuz.
        Array {4, 6, 5, -10, 8, 5, 20} ve sayı 10 ise, çıktı 4+6=10, 5+5=10, -10+20=10 olacaktır.
         */

        Integer arr [] = {4, 6, 5, -10, 8, 5, 20};
        int num = 10;
        for(int i=0; i<arr.length; i++) {

            for(int j=i+1; j<arr.length; j++) {

                if(arr[i]+arr[j]==num) {

                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }












    }
}
