package calisma.day0103;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0'a basmasini soyleyin
        //Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozifit sayilarin toplaminin kac olduğunu yazdirin

        Scanner input = new Scanner(System.in);


        int toplam = 0;
        int a;
        int countPozitif=0;
        int countNegetif=0;

        do {
            System.out.println("Lutfen pozitif sayi giriniz, toplama islemini sonlandirmak icin sifira basin");
            a = input.nextInt();

            if (a>0){

                toplam = toplam + a;
                 countPozitif++;
            }

        }while (a!=0);
        System.out.println("toplam = " + toplam);
        System.out.println("countPozitif = " + countPozitif);



    }
}
