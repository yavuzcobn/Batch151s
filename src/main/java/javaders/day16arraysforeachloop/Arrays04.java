package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz

        String s = "Java is easy. Learn Java earn Money.";

        String words[] = s.split(" ");

        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, Money.]

        System.out.println(words.length);//7

        //size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        String letters[] = s.replaceAll("[^a-zA-Z]","").split("");
        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, M, o, n, e, y]

        System.out.println(letters.length);//28



    }
}
