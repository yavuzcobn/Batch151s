package calisma.nisan10;

public class LoopsElmas {
    public static void main(String[] args) {
/*
        5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
                Test Data:
        Yarım elmas uzunluğu : 7
        Beklenen Çıktı:
        *
       ***
      *****
     *******
    *********
   ***********
  *************
   ***********
    *********
     *******
      *****
       ***
        *

*/

        int input = 7;
        int space = input - 1;
        int num_len = 1;

        for (int i = 1; i <= input * 2 - 1; i++) {//kac satir olacagini belirler

            for (int j = 0; j < space; j++) {

                System.out.print(" ");

            }
            int num = 1;

            for (int j = 1; j <= num_len; j++) {
                System.out.print("*");
                if (num < input) {
                    num++;
                } else {
                    num--;
                }
            }

            if (i < input) {
                space--;
                num_len = num_len + 2;
            } else {
                space++;
                num_len = num_len - 2;
            }
            System.out.println();
        }

    }
}




