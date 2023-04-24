package javaders.day09stringmanipulationsifstatement;

public class C02_IfStatement {

    public static void main(String[] args) {

        //INTERWIEW QUESTIONS USA QA

        //Bir Stringdeki tekrarsiz karaktarleri ekrana yazdiriniz.
        // String y = "abbccdc"

        String y = "aac";

       char ch =y.charAt(0);

       if (y.indexOf(ch)==y.lastIndexOf(ch)){

           System.out.println(ch);
       }

        char ch1 =y.charAt(1);

         if(y.indexOf(ch1)==y.lastIndexOf(ch1)){

            System.out.println(ch1);
        }

        char ch2 =y.charAt(2);

        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){

            System.out.println(ch2);
        }

        //Ex : Verilen sayi pozitif ise ekrana "Sayi Pozitif" yazdiran kodu yaziniz

        int num =9;
        if (num>0){
            System.out.println("Sayi Pozitif");
        }


        //Ex : Sayi -1 ile 10 arasinda ise ekrana "Verilen Data Rakamdir" yazdiran kodu yaziniz


        int rakam= 1;

        if (rakam<10 && rakam>-1){

            System.out.println("Verilen Data Rakamdir");
        }

        //Ex: Sayi 3 basamakli ise "Verilen sayi 3 Basamaklidir" yazdiran kodu yaziniz

        int number =-123;

        number= Math.abs(number);

        if (number>99 && number<1000)
            System.out.println("Verilen sayi 3 Basamaklidir\"");


    }
}
