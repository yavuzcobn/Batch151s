package calisma.nisan01;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
         /*
        Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı
        santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız.
        Google'dan dönüşümler için formülleri bulunuz.

        a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
        konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)

        b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde,
        konsolda kodunuz "2" yazmalıdır (sayı dinamik olacak)

        c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak
        girdiğinde,konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

        d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata 'dan farklı bir
        işlem girdiğinde, kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır

        1 mil =  1,609344 kilometre'dir

        1 Saniye = 0.00027777777777778 Saat

        T(°C) = (a°F – 32) × 5/9 =  b °C

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen operatorü sekildeki gibi (mildenKmye, saniyedenSaate, fahrenaytdanSantigarata) giriniz");
        String operator = input.nextLine().toLowerCase().replaceAll("\\s","");


        switch (operator){
            case "mildenkmye":
                System.out.println("Lutfen mil degerini giriniz");
                double mil=input.nextDouble();
                System.out.println(mil * 1.60934);
                break;
            case  "saniyedensaate":
                System.out.println("Lutfen saniye degerini giriniz");
                double saniye=input.nextDouble();
                System.out.println((saniye / 60) / 60);
                break;
            case  "fahrenaytdansantigarata":
                System.out.println("Lutfen fahrenayt degerini giriniz");
                double fahrenayt=input.nextDouble();
                System.out.println((fahrenayt - 32) * 5 / 9);
                break;
            default:
                System.out.println("Lutfen gecerli deger giriniz");

        }

        //        if (operator.equalsIgnoreCase("mildenKmye")){
//            System.out.println("Lutfen mil degerini giriniz");
//            double mil=input.nextDouble();
//            System.out.println(mil * 1.60934);
//        }else if (operator.equalsIgnoreCase("saniyedenSaate")){
//            System.out.println("Lutfen saniye degerini giriniz");
//            double saniye=input.nextDouble();
//            System.out.println((saniye / 60) / 60);
//        }else if (operator.equalsIgnoreCase("fahrenaytdanSantigarata")){
//            System.out.println("Lutfen fahrenayt degerini giriniz");
//            double fahrenayt=input.nextDouble();
//            System.out.println((fahrenayt - 32) * 5 / 9);
//        }else {
//            System.out.println("Lutfen gecerli deger giriniz");
//        }







    }
    }


