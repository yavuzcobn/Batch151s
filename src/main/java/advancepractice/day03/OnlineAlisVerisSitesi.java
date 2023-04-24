package advancepractice.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisVerisSitesi {
    static Scanner input = new Scanner(System.in);
    static List<String > urunListesi =new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double odenecekMiktar;

    public static void main(String[] args) {
        urunListesi.add("Saat Urun Kodu 0");
        urunListesi.add("Monitor Urun Kodu 1");
        urunListesi.add("Canta Urun Kodu 2");
        urunListesi.add("TV Urun Kodu 3");
        urunListesi.add("Kitap Urun Kodu 4");


        urunFiyatlari.add(150.0);
        urunFiyatlari.add(3000.0);
        urunFiyatlari.add(5000.0);
        urunFiyatlari.add(6000.0);
        urunFiyatlari.add(100.0);

        List<String>yeniUrunler = new ArrayList<>();
        yeniUrunler.add("Taki Urun Kodu 5");
        yeniUrunler.add("Tencere Urun Kodu 6");
        yeniUrunler.add("Kiyafet Urun Kodu 7");
        urunListesi.addAll(yeniUrunler);

        List<Double> yeniUrunFiyatlari = new ArrayList<>();
        yeniUrunFiyatlari.add(9000.0);
        yeniUrunFiyatlari.add(200.0);
        yeniUrunFiyatlari.add(400.0);
        urunFiyatlari.addAll(yeniUrunFiyatlari);

        musteriSecim();



    }//main

    public static void musteriSecim() {
        urunListesiniGoster();
        System.out.println("Lutfen urun kodunu giriniz");
        int urunKodu = input.nextInt();
        if(urunKodu >=0 && urunKodu<= urunListesi.size()){
            System.out.println("Kac adet istediginizi giriniz");
            int adet = input.nextInt();
            double toplamUrunFiyati =urunFiyatlari.get(urunKodu)*adet;
            odenecekMiktar += toplamUrunFiyati;
            devamMi();
        }else{
            System.out.println("Lutfen gecerli bir urun kodu giriniz");
            musteriSecim();//Recursive Method
        }

    }//musteriSecim()

    private static void devamMi() {
    }

    public static void urunListesiniGoster() {


    }

}
