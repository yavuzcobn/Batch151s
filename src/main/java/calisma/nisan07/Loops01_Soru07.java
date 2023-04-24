package calisma.nisan07;

import java.util.Arrays;

public class Loops01_Soru07 {
    public static void main(String[] args) {

        //7.soru:
        int tablo = 3;

        for (int i = 1; i <= 10; i++) {

            System.out.println(tablo + "x" + i + "=" + tablo * i);
        }

        //8.Soru:

        String s = "";
        for (int i = 20; i > 2; i--) {
            if (i % 2 != 0) {
                s = s + i + " ";
            }
        }
        System.out.println(s);

        //9

        String s1 = "Ali Can?";
        s1 = s1.replaceAll("[^a-z]", "");
        String t = "";
        for (int i = 0; i < s1.length(); i++) {

            String r = s1.substring(i, i + 1);
            t = t + r + '*';

        }
        System.out.println(t);

        //11
        String reverse = "YavuZ";
        String rev = "";

        for (int i = reverse.length()-1; i >-1 ; i--) {

            rev = rev + reverse.substring(i,i+1);

        }
        System.out.println(rev);

        //10

        double num = 75.4238;
        String s2 = String.valueOf(num);
        int idxOfComma = s2.indexOf(".");
        String decimalPart = s2.substring(idxOfComma + 1);
        String t1 = "";
        Integer i=0;
        while(i<decimalPart.length()){
            String r = decimalPart.substring(i,i+1);
            t1 = t1 + '*' + r;
            i++;
        }
        System.out.println(t1);

























    }
}
