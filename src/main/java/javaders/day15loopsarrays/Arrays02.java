package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {

    /*
        1. Application'larda "data" ile bu data'lari isleyen kod'lar(Logic) birbirinden ayrilir
        Yani; Logic data'ya bagimli olmamalidir
        dataya bagimli olarak yazilan data'ya "HARD CODE" denir.
        "HARD CODE" hatali kod demektir.

        Asagidaki grades array'inde son elemani almak icin "4" veya "grades.length-1" kullanilabilir.
        "4" kullanirsaniz array'e bir eleman eklendiginde kodunuz yanlis cikti verir "grades.length-1"
        kullanirsaniz hep dogru sonucu alirsiniz.

     */

    public static void main(String[] args) {

        //Array'leri kisa yoldan nasil olusturabiliriz?

        int grades[] ={67, 98, 100, 34, 76};

        System.out.println(Arrays.toString(grades));//[67, 98, 100, 34, 76]

        // Example 1: grades array'indeki en kucuk ve en buyuk grade'in toplamini ekrana yazdiran kodu yaziniz

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));//[34, 67, 76, 98, 100]

        System.out.println(grades[0] + grades[grades.length-1]);//134


        // Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleriu console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (String w :stdNames) {
            if (w.length() < 5) {
                System.out.println(w);
            }
        }

        // Example 3: Size verilen bir String array'deki isimleri alfabatik siraya koyduktan sonra F ile baslayan
        //            isimlerden önceki isimleri console'a yazdiriniz

        System.out.println();

        Arrays.sort(stdNames);

        for (String w : stdNames) {
            if (w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }

        // Example 4: Size verilen bir String array'deki isimleri alfabatik siraya koyduktan sonra F ile baslayan
        //            isimlerden önceki isimleri ve "F" ila baslayanlari console'a yazdiriniz

        System.out.println();

        Arrays.sort(stdNames);

        for (String w : stdNames) {
            System.out.println(w);
            if (w.startsWith("F")){
                break;
            }
        }

        System.out.println();
        // Example 5: Size verilen bir String array'deki isimleri alfabatik siraya koyduktan sonra F ile baslayan
        //            isimler haric diger isimleri console'a yazdiriniz

        Arrays.sort(stdNames);//short() method'u numeric data'lari kucukten buyuge(ascending) dizer
                              //Stringleri ise alfabetik(alphabetically) sirada dizer
                              // ascending + alphabetically==> Naturel Order

        for (String w : stdNames) {
            if (w.startsWith("F")) {
                continue;
            } else {
                System.out.println(w);
            }
        }









    }//main
}//class
