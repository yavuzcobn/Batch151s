package calisma.day4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

        // soru 2
        int arr[][] = {{1, 2, 3}, {4, 6}, {6}};
        int carpim = 1;

        for (int[] w : arr) {

            carpim = carpim * w[w.length - 1];
        }
        System.out.println(carpim);//108

        int carp = 1;

        for (int i = 0; i < arr.length; i++) {

            carp = carp * arr[i][arr[i].length - 1];

        }
        System.out.println(carp);//108

        //soru 3

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
/*
        arr1.length=arr2.length;
        int sum1 = 0;
        int sum2 = 0;

        for (int[] w : arr1) {

            for (int k : w) {

                if (w.length(sum)){

            w++;

                }
                System.out.println(sum*w);
            }
*/

        }
}