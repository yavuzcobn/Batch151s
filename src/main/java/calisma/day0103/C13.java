package calisma.day0103;

import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        int note = input.nextInt();

        if (note>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        } else if (note>80) {
            System.out.println("A");
        }else if (note>60) {
            System.out.println("B");
        }else if (note>50) {
            System.out.println("C");
        }else if (note>0) {
            System.out.println("D");
        }else {
            System.out.println("Lutfen pozitif bir sayi giriniz");
        }
    }
}
