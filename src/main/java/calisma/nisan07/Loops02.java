package calisma.nisan07;

public class Loops02 {
    public static void main(String[] args) {

        //Soru12:
        /*
         Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                    A A A A A A A A
                    A X X X X X X A
                    A X X X X X X A
                    A X X X X X X A
         */

        int satir = 4;
        int sutun = 8;

        for (int i = 0; i <= satir; i++) {

            for (int j = 1; j <sutun ; j++) {

                if (i==0||j==1 || j==sutun-1 ){
                    System.out.print("A ");
                }else {
                    System.out.print("X ");
                }

            }
            System.out.println();

            }








    }
}
