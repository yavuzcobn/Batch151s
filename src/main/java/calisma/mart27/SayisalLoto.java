package calisma.mart27;

import java.util.Arrays;
import java.util.Scanner;

public class SayisalLoto {

    static int [] bilett;

    static  int[] tahminiSayi;

        /*

               Create  n random numbers with user to generated for the ticket.
               Create  n random numbers  for the result of the lottery.
               There should be no repeated numbers in the numerical lottery.
               Take the min and max from user to use in the lottery...

               Compare the result and ticket than print  how many matches is there
    */

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String cikis;

        do{
            System.out.println("lutfen alacaginiz biletin hane sayisini giriniz...");
            int haneSayisi=sc.nextInt();

            System.out.println("Lutfen gireceginiz bilette bulunacak maksimum degeri giriniz ....");
            int maksimumDeger= sc.nextInt();

            System.out.println("Lutfen gireceginiz bilette bulunacak minimum degeri giriniz ....");
            int minimumDeger=sc.nextInt();

            if(maksimumDeger<minimumDeger){

                int temp=maksimumDeger;
                maksimumDeger=minimumDeger;
                minimumDeger=temp;

            }

            Sayimatik bilet = new Sayimatik(haneSayisi,minimumDeger,maksimumDeger);

            bilett=bilet.sayiArray;

            Sayimatik pcnininTahmini= new Sayimatik(haneSayisi,minimumDeger,maksimumDeger);

            tahminiSayi=pcnininTahmini.sayiArray;

            Sayimatik ikinciBiletim=new Sayimatik(haneSayisi,minimumDeger,maksimumDeger);
            int[] ikinciBilet=ikinciBiletim.sayiArray;

            System.out.println("Biletiniz   : " +Arrays.toString(bilett));

            System.out.println("Sansli Sayi : " +Arrays.toString(tahminiSayi));

            System.out.println("ikinciBiletim = " + Arrays.toString(ikinciBilet));

            int count=0;

            for(int i=0;i< bilett.length;i++){
                if(bilett[i]==tahminiSayi[i]){
                    count++;
                }
            }
            if(count==0){

                System.out.println("Malesef Hicbir numarayi tuttturamadiniz.. Tekrar bekleriz...");

            } else if (count==bilett.length) {
                System.out.println("Tebrikler Ikramiyeyi Kazandiniz....");

            }else {
                System.out.println("Malesef sadece "+count+" tane eslesme oldu.. ");
            }

            System.out.println("Cikis icin q, devam etmek icin herhangi bir tus");

            cikis = sc.next();


        }while (!cikis.equalsIgnoreCase("q"));


        System.out.println("Tsk ederiz....");

    }

}