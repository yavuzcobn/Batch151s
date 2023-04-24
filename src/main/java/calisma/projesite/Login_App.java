package calisma.projesite;

import java.util.Scanner;

public class Login_App {

    public static void main(String[] args) {

        start();

    }

    public static void start() {
        Scanner sc = new Scanner(System.in);

        int select;
        do {
            showMenu();
            select=sc.nextInt();

            switch (select){
                case 1 ://uye olacka
                    break;
                case 2 : // kayit olacak
                    break;
                case 0 : // cikis
                    System.out.println("Iyi Gunler...");
                    break;
                default:
                    System.out.println("Lutfen Gecerli Bir Deger Giriniz");


            }

        }while (select!=0);




    }
    public  static void showMenu(){

        System.out.println("====== Scool Management App ========");
        System.out.println("\n 1 - Uye Ol\n 2 - Giris Yap \n 0 - Cikis \n ");
        System.out.println("Seciminiz : ");
    }

}
