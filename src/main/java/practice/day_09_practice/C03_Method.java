package practice.day_09_practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {

    public static void main(String[] args) {

     /*
       Kullanıcıdan bir cumle sisteme girmesini isteyiniz.
       method olusturarak cumlede gecen sesli harfleri konsola yazdırınız aeiou
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz hadi...");
        String cumle = scan.nextLine();

        String [] arr = cumle.split("");

        System.out.println(Arrays.toString(arr));

        sesliharfleriyazdir(arr);



    }

    public static void sesliharfleriyazdir(String[] arr) {

        for (int i = 0 ; i < arr.length ; i++) {

            if (arr[i].equalsIgnoreCase("a")
             ||arr[i].equalsIgnoreCase("e")
             ||arr[i].equalsIgnoreCase("i")
             ||arr[i].equalsIgnoreCase("o")
             ||arr[i].equalsIgnoreCase("u")){

                System.out.print(arr[i]);

            }

        }




    }
}
