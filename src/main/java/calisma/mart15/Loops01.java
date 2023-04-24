package calisma.mart15;

public class Loops01 {
    //herangi bir dongu kullanmadan 1'den 100'e kadar tam sayilari yazdiran programi yaziniz.

    public static void main(String[] args) {


        number(1);


    }

    public static void number(int a) {
        System.out.print(a + " ");
        a ++;
        if (a < 100) {
            number(a);


        }

    }




}

