package calisma.day4;

import java.util.Arrays;
import java.util.Scanner;

//4

public class MultiDimensionalArray02 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};
        int[] arr1 = new int[arr.length];
        int idx = 0;

        for (int[] w : arr) {
            int sum = 0;
            for (int m : w) {
                sum += m;
            }
            arr1[idx] = sum;
            idx++;
        }
/*
        System.out.println(Arrays.toString(arr1));

        String klm[] = {"Ali", "Yasin", "Ahmet", "Mustafa", "Ali"};
        String kelime = "Mustafa";
        System.out.println(Arrays.toString(brr(kelime, klm)));
    }

    public static String[] brr(String m, String[] arr) {
        int count = 0;
        for (String w : arr) {
            if (w.equals(m)) {
                count++;
            }
        }
        String[] km = new String[arr.length - count];
        int idx = 0;
    }
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle =input.nextLine();

        String brr []= cumle.split(" ");
        System.out.println(brr.length);



    }
}



