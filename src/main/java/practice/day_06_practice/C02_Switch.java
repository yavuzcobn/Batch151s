package practice.day_06_practice;

import java.util.Scanner;

public class C02_Switch {
    /*
        Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

        işlem 1: Bakiye Sorgulama
        işlem 2: Para Cekme
        işlem 3: Para Yatırma
        işlem 4: İşlemi Sonlandırın

        Ve bu islemleri Switch case kullanarak yaptırınız.
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1-4 arasinda islem numaranizi giriniz" + "\n"+
                           "Islem 1: Bakiye Sorgulama\n" +
                           "Islem 2: Para Cekme\n" +
                           "Islem 3: Para Yatirma\n" +
                           "Islem 4: Islemi Sonlandirin\n");

        int islemNo = scan.nextInt();

        int bakiye = 1000;

        switch (islemNo){

            case 1: //bakiye sorgulama
                System.out.println("Bakiyeniz: "+bakiye+ " TL'dir");
                break;
            case 2: //para cekme
                System.out.println("Lutfen cekmek istediginiz tutari giriniz");
                int cekilecekPara = scan.nextInt();

                if (cekilecekPara<=bakiye){
                    bakiye = bakiye-cekilecekPara;
                    System.out.println("Para cekme isleminizden sonraki bakiyeniz: " + bakiye + " TL'dir.");
                }else {
                    System.out.println("Bakiyeniz yetersiz.");
                }
                break;
            case 3://para yatirma
                System.out.println("Lutfen yatirmak istediginiz tutari giriniz");
                int yatirilacakPara = scan.nextInt();

                if (yatirilacakPara<=2000){
                    bakiye= bakiye+yatirilacakPara;
                    System.out.println("Para yatirma isleminizden sonraki bakiyeniz: " + bakiye + " TL'dir.");
                }else {
                    System.out.println("ATM'de gunluk para yatirma limitiniz 2000 Tl'dir.");
                }
                break;

            case 4://Islemi Sonlandirin
                System.out.println("Isleminiz basari ile sonlandirilmistir");
                break;

            default:
                System.out.println("Gecerli bir numara giriniz!...");

        }




    }
}
