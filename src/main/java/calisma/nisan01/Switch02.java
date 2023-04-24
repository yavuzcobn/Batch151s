package calisma.nisan01;

import java.util.Scanner;

public class Switch02 {

    /*
            Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
        koyunuz. Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
        'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
        YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
        tarayıcılar için 'Geçersiz tarayıcı' yazınız.
        Not: Geliştirici konsolunda enum oluşturmalısınız
     */


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen kullandiginiz internet tarayicisini giriniz");
        String browser = input.next();


        switch (browser){
            case "CHROME":
                System.out.println("CHROME kullaniyorum");
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
                System.out.println("Geçersiz tarayıcı");

        }




    }
}
