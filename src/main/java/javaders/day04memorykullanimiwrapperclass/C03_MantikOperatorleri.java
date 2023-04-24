package javaders.day04memorykullanimiwrapperclass;

public class C03_MantikOperatorleri {

    public static void main(String[] args) {

        /*
                             Javada islem yaptiran

                              == Esittir
                              != Esitt degildir
                              <  Kucuktur
                              >  Buyuktur
                              =  atama operatoru

           1<4<5      ==> matematik uclu karsilastirma yapar ancak java uclu kiyas yapamaz
           1<4 && 4<5 ==> Java bu sekilde ikili kiyas yapip Mantik Operatorleriyle birlestirme yapar

           && ===> "ve, hem" operatoru mukkemmeliyetci yapidadir. True donmasi icin her iki sartın da saglanmasi gerekir

          & ile && arasindaki fark

          (3<5 && 6<9 && 11<2 && 4<8 && 2<3) ilik False dan sanrasini kontrol etmez False dondurur (DAHA HIZLIDIR)
          (3<5 & 6<9 & 11<2 & 4<8 & 2<3) ilk False dan sanrasindaki tum kondlari kontrol eder sonra False dondurur

           Cay ve Limon
            +  &&   +  ==> True;
            +  &&   -  ==> False;
            -  &&   +  ==> False;
            -  &&   -  ==> False;

           || ===> veya operatoru Polyanaci yapidadir. En ufak bir pozitif durumda true dondurur

           Cay veya Limon
            +   ||   +  ==> True;
            +   ||   -  ==> True;
            -   ||   +  ==> True;
            -   ||   -  ==> False;


         */

        System.out.println(5+2==8);//false

        boolean sonuc1 =5>4 && 7<9 && 6+3== 9 && 5+2!=8;
        System.out.println(sonuc1);//true

        boolean sonuc2 =5>4 && 7>9 && 6+3== 9 && 5+2!=7;
        System.out.println(sonuc2);//false

        int sayi1=15;
        System.out.println(10< sayi1 || sayi1<20);//true

        int sayi2=5 ;
        System.out.println(10< sayi2 || sayi2>10);//false


    }//main
}//class
