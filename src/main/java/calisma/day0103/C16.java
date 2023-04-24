package calisma.day0103;

import java.util.Arrays;

public class C16 {
    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        Örnek: (12, 5, :sunglasses: ==> (5, 8, 12) ==> Çıktı =8 (12, 5, 8, 13)
        ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
         */

        int arr[] = {5, 8, 12, 13};
        Arrays.sort(arr);
        int ort = 0;
        int a = (arr.length) / 2;
        if (a % 2 != 0) {
            System.out.println(arr[a]);
        } else {
            ort = arr[a - 1] + arr[a];
            System.out.println(ort / 2);
        }

        /*
        String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
        Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */


    }
}
