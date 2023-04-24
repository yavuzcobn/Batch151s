package calisma.nisan04;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {

        //soru 1 :

        int num [][]= {{1,2,3}, {4,5,6}};

        int carpim = 1;

        for (int i = 0; i <num.length ; i++) {

            for (int j = 0; j <num[i].length ; j++) {

                carpim = carpim* num[i][j];
            }
        }
        System.out.println(carpim);

        //soru 2:

        int arr [][]= {{1,2,3}, {4,5}, {6}, {7,8,10}};

        int counter = 1;

        for (int i = 0; i < arr.length; i++) {

            counter = counter * arr[i][arr[i].length-1];
        }
        System.out.println(counter);

        //soru 4 :

        int crr [][]= {{1,2,3}, {4,5}, {6,7}};

        int toplam = 0;

        int drr [] = new int[crr.length];

        for (int i = 0; i < crr.length; i++) {

            for (int j = 0; j < crr[i].length; j++) {

                toplam = toplam + crr[i][j];

            }

            drr[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(drr));//[6, 9, 13]


        //soru 5 :

        Scanner input = new Scanner(System.in);
        System.out.println("Bize bir cumle verin ki parcalayalim...");
        String s = input.nextLine().trim();

        String cumle [] = s.split( " ");

        System.out.println(Arrays.toString(cumle));

        System.out.println(cumle.length);

        //2.yol

        String string ="hhshAAS   DDA  AS dw  wsasA ZERSEE dadsasa";
        System.out.println(kelimeSay(string) + " kelime.");


    }
    static int kelimeSay(String string)
    {
        int count=0;

        char ch[]= new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            ch[i]= string.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
    }


}

