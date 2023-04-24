package calisma.mart30;

import java.util.ArrayList;
import java.util.List;

public class SwitchOnStatement01soruVar {

    public static void main(String[] args) {

        //1. Soru:

//        Scanner input = new Scanner(System.in);
//        System.out.println("Bize ay ismi veriniz, biz size mevsimi soyleyek");
//
//        String ayIsmi = input.next().toLowerCase();
//
//        switch (ayIsmi){
//
//            case "aralik":
//            case "ocak":
//            case "subat":
//                System.out.println("Kis");
//                break;
//            case "mart":
//            case "nisan":
//            case "mayis":
//                System.out.println("Bahar");
//                break;
//            case "haziran":
//            case "temmuz":
//            case "agustos":
//                System.out.println("Yaz");
//                break;
//            case "eylul":
//            case "ekim":
//            case "kasim":
//                System.out.println("Guz");
//                break;
//            default:
//                System.out.println("Gecersiz ay adi");
//                break;
//        }
//
//        //2. Soru:
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Bize ay numarasini verin, biz size ay ismini soyleyek");
//
//        int ayNo = scan.nextInt();
//        String ayAdi = "";
//
//        switch (ayNo){
//            case 1: ayAdi = "Ocak";
//                break;
//            case 2: ayAdi = "Subat";
//                break;
//            case 3: ayAdi = "Mart";
//                break;
//            case 4: ayAdi = "Nisan";
//                break;
//            case 5: ayAdi = "Mayis";
//                break;
//            case 6: ayAdi = "Haziran";
//                break;
//            case 7: ayAdi = "Temmuz";
//                break;
//            case 8: ayAdi = "Agustos";
//                break;
//            case 9: ayAdi = "Eylul";
//                break;
//            case 10: ayAdi = "Ekim";
//                break;
//            case 11: ayAdi = "Kasim";
//                break;
//            case 12: ayAdi = "Aralik";
//                break;
//            default:
//                ayAdi = "Gecersiz numara";
//                break;
//
//        }
//        System.out.println(ayAdi);

        //Soru 3:

        List<String> gelecekAylar = new ArrayList<>();
        int ayNo = 22;
        switch (ayNo) {
            case 1: gelecekAylar.add("Ocak");
            case 2: gelecekAylar.add("Subat");
            case 3: gelecekAylar.add("Mart");
            case 4: gelecekAylar.add("Nisan");
            case 5: gelecekAylar.add("Mayis");
            case 6: gelecekAylar.add("Haziran");
            case 7: gelecekAylar.add("Temmuz");
            case 8: gelecekAylar.add("Agustos");
            case 9: gelecekAylar.add("Eylul");
            case 10: gelecekAylar.add("Ekim");
            case 11: gelecekAylar.add("Kasim");
            case 12: gelecekAylar.add("Aralik");
                break;
            default: break;
        }
        if (gelecekAylar.isEmpty()) {
            System.out.println("Gecersiz ay numarasi");
        } else {
            for (String ayAdi : gelecekAylar) {
                System.out.print(ayAdi + " ");
            }
        }

        //4. Soru:

//        String cinsiyet = "KADİN";
//
//        switch (cinsiyet.toLowerCase()){
//            case "kadin":
//                System.out.println("Kadin");
//                break;
//            case "erkek":
//                System.out.println("Erkek");
//                break;
//            default:
//                System.out.println("Digerleri");
//        }
//
//
//        //5. SORU:
//
//        int ay = 2;
//        int yil = 2000;
//        int gunSayisi = 0;
//
//        switch (ay){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//            gunSayisi=31;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//            gunSayisi=30;
//                break;
//            case 2:
//                if (((yil % 4 == 0) && !(yil % 100 == 0)) || (yil % 400 == 0)){
//                    gunSayisi = 29;
//
//                }else {
//                    gunSayisi =28;
//                }
//                break;
//            default:
//                System.out.println("Gecersiz Ay");
//                break;
//        }
//
//        System.out.println("gunSayisi = " + gunSayisi);
//
//        //6. Soru :)
//
//        double a = 15.2;
//        double b = 5;
//        String operator = "/";
//
//        switch (operator){
//            case "+":
//                System.out.println(a+b);
//                break;
//            case "-":
//                System.out.println(a-b);
//                break;
//            case "*":
//                System.out.println(a*b);
//                break;
//            case "/":
//                System.out.println(a/b);
//                break;
//            default:
//                System.out.println("gecersiz islem");
//        }
        //8. Soru :)

// bu soruyu sor???

        String browser = Browsers.CHROME.toString();
        switch(browser) {
            case "CHROME":
                System.out.println("'CHROME kullaniyorum");
                break;
            case "SAFARI":
                System.out.println("SAFARI kullaniyorum");
                break;
            case "IE":
                System.out.println("IE kullaniyorum");
                break;
            case "FIREFOX":
                System.out.println("FIREFOX kullaniyorum");
                break;
            case "YANDEX":
                System.out.println("YANDEX kullaniyorum");
                break;
            default:
                System.out.println("Gecersiz tarayici'");

        }
























        }
    public enum Browsers{
        CHROME, SAFARI, IE, FIREFOX, YANDEX
    }
}
