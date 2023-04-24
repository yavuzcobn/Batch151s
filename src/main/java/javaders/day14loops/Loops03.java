package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {

        //while loop
    int i =1;

    while (i<1){//while loopta loop body'sinin hic calismamasi mumkundur(Zero Execution is possible)
        System.out.println("while loop");
        i++;

    }
    //do-while-loop

        int k=1;
    do {//do-while-loop'da loop body'si en az bir kere calisir
        System.out.println("do-while-loop");
        k++;

    }while (k<1);


    //while kontrol yapar kodu oyle calistir.
    //do-while  calistirir sonra kontrol eder.

        //Kullanici bir sayi girsin sayi, 100'den kucuk ise kullanici "KAZANDINIZ" mesaji alsin
        //diger durumlarda "Kaybettiniz" mesaji alsin

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter an integer");
            int n = input.nextInt();
        if(n<100){
            System.out.println("WON!");
        }else {
            System.out.println("LOST!");
            break;
            }
        }while (true);

        //Kullanicidan alinan bir cumlenin buyuk harfle baslayıp, nokta ile bittigini kontrol eden
        // kodu yaziniz.

        do {
            System.out.println("Please enter a word");

            String s = input.next();

            if (s.endsWith(".") && (s.charAt(0)>='A'&& s.charAt(0)<='Z')){
                System.out.println("Your sentence is correcet grammerically.");

            }else {
                System.out.println("Your sentence has grammerically mistake .");
                break;
            }

        }while (true);













    }
}
