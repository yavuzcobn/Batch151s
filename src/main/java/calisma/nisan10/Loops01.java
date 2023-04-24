package calisma.nisan10;

public class Loops01 {
    public static void main(String[] args) {

        //         ____*____
        //         ___*_*___
        //         __*___*__
        //         _*_____*_
        //         *_*_*_*_*



        int row=5;

        for (int i =1; i <=row ; i++) {
            for (int k =i; k <row ; k++) {
                System.out.print(" ");/// bosluklar icin
            }
            for (int m = 1; m <=2*i-1 ; m++) {
                if (i==row || m==1 || m==2*i-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
