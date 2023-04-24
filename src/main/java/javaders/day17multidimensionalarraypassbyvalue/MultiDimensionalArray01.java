package javaders.day17multidimensionalarraypassbyvalue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray01 {

    /*
        1)Bir array'in elemanlari da array olursa bu tarz array'lere "Multidimensional Array" denir.
     */


    public static void main(String[] args) {

        //"Multidimensional Array" nasil olusturulur?
        String names[][] = new String[3][2];//[[A, K], [P, M], [C, Z]]

        //"Multidimensional Array" nasil eleman eklenir?
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";

        System.out.println(Arrays.deepToString(names));//[[A, K], [P, M], [C, Z]]
        //"Multidimensional Array"leri konsola yazdirmak icin "toString()" method'u degil "deepToString() method'unu kullaniniz

        //"Multidimensional Array" icinden specific bir eleman nasil yazdirilir?
        System.out.println(names[1][1]);//M

        //"Multidimensional Array" icinden bir array nasil yazdirilir?

        System.out.println(Arrays.toString(names[0]));//[A, K]

        System.out.println(Arrays.toString(names[1]));//[P, M]

        //Kisa yoldan Multidimensional Array nasil olusturulur?

        String student[][] = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Kayahan"}};

        //Exaple 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int sum = 0;

        for (String[] w : student) {

            sum = sum + w.length;
        }
        System.out.println(sum);//8

        //Exaple 2: Yukaridaki students array'inde icinde "m" olan isimleri konsola yazdiriniz.

        for (String[] w : student) {

            for (String k : w) {

                if (k.contains("m")) {
                    System.out.println(k);
                }
            }
        }

        //Exaple 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz.
        int nums[][] = {{5, 4}, {2, 3, 2}, {7}};

        int result = 1;

        for (int[] w : nums) {

            for (int k : w) {

                result = result * k;

            }

        }
        System.out.println(result);//1680

        //Exaple 4: Iki boyutlu bir array'i tek boyuntuya ceviriniz.
        int numbers[][] = {{5, 4}, {2, 3, 2}, {7}};//==>{5, 4, 2, 3, 2, 7}

        //1.Step: iki boyutlu array'de kac eleman oldugunu bulan kodu yazmaliyiz
        int toplamElemanSayisi = 0;

        for (int[] w : numbers) {

            toplamElemanSayisi = toplamElemanSayisi + w.length;

        }

        //2.Step: tek boyutlu array'i iki boyutlu array'in eleman sayisini kullanarak olusturmaliyiz
        int newArr[] = new int[toplamElemanSayisi];

        //3.Step: Iki boyutlu array'deki elemanlari tek boyutlu array'e transfer etmeliyim.
        int idx = 0;

        for (int[] w : numbers) {

            for (int k : w) {

                newArr[idx] = k;

                idx++;

            }
        }

        System.out.println(Arrays.toString(newArr)); //[5, 4, 2, 3, 2, 7]

        //Exaple 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplaminin bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}, {7}};//==> 4 + 43 =47

        int small = ages[0][0];
        int big = ages[0][0];

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
        int outerL = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < outerL; i++) {
            int innerL = Math.min(arr1[i].length, arr2[i].length);
            for (int j = 0; j < innerL; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + (arr1[i][j] + arr2[i][j]));
            }
        }
    }
}
