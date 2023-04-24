package calisma.mart21;

import java.util.Scanner;

public class test38 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String password = "";
        do {
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();

            if(!(password.equals("AliCan"))) {
                System.out.println("Yanlış");
            }
        }while(!(password.equals("AliCan")));
        System.out.println("Doğru");
    }
}
