package javaders.day13loops;

import java.io.FilterOutputStream;

public class Loops02 {
    public static void main(String[] args) {
        //Verilen bir Strint'de kucuk harfleri console'a yazdmayiniz
        //"Pwd12?Ab" ==> P12?A

        //Break looplarda veya swich statement lerde kullanılabilir.
        // continue ise loop yapaken bazı elemanlaı işleme sokmamada kullanılır.
        //break ile comtinue arasindaki fark:
        //Break: switch'in disina cikmak icin ve loop'u kirmak icin kullanilir
        //Continue : ise Loop yaparken bazi elemanlari isleme sokmamak icin kullanilir

        String s = "Pwd12?Ab";

        for (int i = 0; i<s.length(); i++){

            char ch = s.charAt(i);

            if (ch>='a'&& ch<='z'){
                continue;
            }else {
                System.out.print(ch);
            }
        }
        System.out.println();

        //Bir String'i tersten yazdiran kodu yazinizö

        String t ="Apex";
        String ters ="";// yeni bir data olusturacagimiz icin her zaman memory de yeni bir konteynir olustururuz.

        for (int  i= t.length()-1 ; i>=0; i--){

            ters=  ters + t.substring(i, i+1);

        }
        System.out.println(ters);

        //2.Way:
        String u = "Java";
        String ters2 = "";

        for(int i=u.length()-1; i>=0;i--){
            ters2 = ters2 + u.charAt(i);
        }
        System.out.println(ters2);

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578==> 5+7+8 =20

        int sum =0;

        int n = -578;
        n = Math.abs(n);

        for (int i =n; i>0; i=i/10){

           sum = sum +i%10;

        }
        System.out.println(sum);

    }

}
