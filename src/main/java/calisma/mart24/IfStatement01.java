package calisma.mart24;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
         Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"
         */

        String ay = "haziran";
        ay = ay.toLowerCase();

        if (ay.equals("aralik")|| ay.equals("ocak") || ay.equals("subat")){
            System.out.println("Kis");

        } else if (ay.equals("mart")|| ay.equals("nisan") || ay.equals("mayis")) {
            System.out.println("ilkbahar");
        }else if (ay.equals("haziran")|| ay.equals("temmuz") || ay.equals("agustos")) {
            System.out.println("yaz");
        }else if (ay.equals("eylul")|| ay.equals("ekim") || ay.equals("kasım")) {
            System.out.println("sonbahar");
        }else {
            System.out.println("Geçersiz ay adı");
        }
        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
                a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
                b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
                c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
                Not: Çözümdeki koşulların sıralarına dikkat ediniz.
        */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen olusturmak istediginiz sifreyi giriniz");
//        String sifre = input.nextLine();
//
//        if (sifre.contains(" ")){
//            System.out.println("sifrede bosluk kullanmayınız");
//        } else if (sifre.length()>=8) {
//            System.out.println("gecerli sifre");
//        }else {
//            System.out.println("gecersiz sifre, lutfen 8 karakterden fazla sifre giriniz");
//        }

      int aySirasi = 6;

        if (aySirasi==1){
            System.out.println("Ocak");
        }else if (aySirasi==2) {
            System.out.println("Subat");
        }else if (aySirasi==3) {
            System.out.println("Mart");
        }else if (aySirasi==4) {
            System.out.println("Nisan");
        }else if (aySirasi==5) {
            System.out.println("Mayis");
        }else if (aySirasi==6) {
            System.out.println("Haziran");
        }else if (aySirasi==7) {
            System.out.println("Temmuz");
        }else if (aySirasi==8) {
            System.out.println("Agustos");
        }else if (aySirasi==9) {
            System.out.println("Eylul");
        }else if (aySirasi==10) {
            System.out.println("Ekim");
        }else if (aySirasi==11) {
            System.out.println("Kasim");
        }else if (aySirasi==12) {
            System.out.println("Aralik");
        }else {
            System.out.println("Gecersiz ay numarasi");
        }

        //Soru:4
        int i = 125;
        if(i%10>=5){
            System.out.println("ust ondaliga yuvarla : " + ((i/10+1)*10));
        }else{
            System.out.println("alt ondaliga yuvarla : " +((i/10)*10));
        }
        //Soru:5
        int a = 3;
        int b = 4;
        int c = 3;

        if (a==b && b==c){
            System.out.println("eskenar ucgen");
        } else if (a==b && b!=c||b==c && b!=a || a == c && b != a) {
            System.out.println("ikizkenar ucgen");
        }else {
            System.out.println("cesitkenar ucgen");
        }


    }

}
