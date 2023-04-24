package calisma.nisan11;

public class Loops01 {
    public static void main(String[] args) {
        /*
         Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            * * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
         */


        int a = 6;
        //String y = "";

        for (int i = 1; i <= a; i++) {


            for (int j = a; j >=i ; j--) {
                System.out.print("* ");

            }
            System.out.println();
        }

        /*
         Example 1: Asagidaki sekli cizen kodu yaziniz
          1
          1 2
          1 2 3
          1 2 3 4
          1 2 3 4 5
        */
        
        int num = 5;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");

            }
            System.out.println();
        }





    }


}
