package calisma.day0103;

import java.util.Scanner;

public class C01_SoruCozumleri {
    public static void main(String[] args) {
        /*
        Kulanicidan 100'den kucuk bir tamsayi isteyin 1'den baslayarak girilen  sayiya kadar tum sayilari yazdirin, Ancak
        -Sayi 3'un kati ise sayi yerine "Java" yazdirin
        -Sayi 5'in kati ise sayi yerien "Guzeldir" yazdirin
        -Sayi hem 3'un hem 5in kati ise sayi yerien "Java Guzeldir" yazdirnin
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100den kucuk bir tam sayi giriniz");
        int sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Java guzeldir");
            } else if (i % 3 == 0) {
                System.out.println("Java");
            } else if (i % 5 == 0) {
                System.out.println("Guzeldir");
            } else {
                System.out.println(i);
            }

        }
        //Kullanicidan bir String isteyin ve Stringi tersten yazdirin

        //1.yol
        System.out.println("Bir string giriniz");
        String st=input.nextLine();

        for (int i = st.length()-1; i >-1 ; i--) {
            System.out.print(st.charAt(i));

        }
        System.out.println();


        //2.yol
        System.out.println("Bir string giriniz: ");
        String st2=input.nextLine();
        String bos="";
        for (int i = st2.length()-1; i >-1 ; i--) {
            bos+=st2.charAt(i);
        }
        System.out.print(bos);

    }

}
