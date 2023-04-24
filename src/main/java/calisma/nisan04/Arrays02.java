package calisma.nisan04;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

    public static void main(String[] args) {

        //soru 6 : Verilen bir Arrrayde istenen degere esit olan elemanlari kaldir ve kalanlari yeni Array e kayon bir method yazdiriniz

        int arr [] = {3,2,1,1,2,3};

        int sayi = 3;

        int arr2 [] = {};

        for (int i = 0; i < arr.length; i++) {

            if (i==sayi){
                continue;
            }else {
                arr2[i]=arr[i];
            }
            System.out.println(Arrays.toString(arr2));

        }

        //      INTERWIEW QUESTION !!!!
        /*
        kullanicidan bir String aliniz
        stringde var olan her characterin sayisini ekrana yazdir
        alacan a=3 l=1 c=1 n=1
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String name=input.nextLine().toLowerCase();

        String str[]=name.split("");
        System.out.println(Arrays.toString(str));
        int counter=0;
        Arrays.sort(str);

        for (int i = 1; i <str.length; i++) {
            if (str[i-1].equalsIgnoreCase(str[i])){
                counter++;
            }else {
                System.out.println(str[i-1]+ " karakterinin sayisi " + (counter+1));
                counter=0;
            }
            if (i==str.length-1){
                System.out.println(str[i]+ " karakterinin sayisi " + (counter+1) + "kez tekrarlanmistir ");
            }

        }
    }
}
