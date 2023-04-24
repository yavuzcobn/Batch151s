package javaders.day08stringmanipulations;

public class Notlar {

    /*
     STRING METHODLARI

1) toUpperCase() : Tum harfleri buyuk harfe cevirir.
                    Bize string return eder.


2) toLowerCase() : Tum harfleri kucuk harf yapar.
                    Bize string return eder


3) charAt(0) : Bize Data'daki ilk karakteri dondurur.
               İndex ile calisir.


4) lenght() : Bir datadaki karakter sayisini bize verir.
              int bir deger dondurur.


5) substring () :

 İki kullanimi vardir :  *substring(baslangicIndexi,bitisIndexi) 'i verilirse
                        baslangic indexi dahil bitis indexi haric yazdirir
                        Metnin ortasindan data almamizi saglar

                        *(baslangicIndexi) String'in verilen indexten sonuna kadar
                        alinmasini saglar.
                        Bu method bize string dondurur.


6) contains() : Bir data var mi yok mu diye bakar.
                 Bize boolean bir deger dondurur.


7) startsWith() Metnin bas kisminin istenilen dizi(1 veya
                daha fazla karakter) ile eslesip eslesmedigini
                kontrol eder.Sonucu boolean dir.
8) endsWith () : Metnin belirli bir datayla bitip bitmedigini verir

               Bize boolean bir sonuc dondurur
               Tek karakterde, coklu karakterde kullanilabilir


9)  replace () : Metnin içerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir
                  String datayi dondurur
                  Tekli karakterler ile de coklu String karakterler ile de calisir
                  Her iki tarafta da "" ya da her iki tarafta da '' kullanilmalidir


10) replaceAll () : Bir grup datayi degistirmek icin kullanilir.
                    Bir grup data'yi ifade edebilmek icin Regular Expression (Regex) kullanilir.


                           EN COK KULLANILAN REGEXLER:

                            1) Tum Rakamlar ==> [0-9]
                            2) Tum Kucuk Harfler ==> [a-z]
                            3) Tum Buyuk Harfler ==> [A-Z]
                            4) Tum Harfler ==> [a-zA-Z]
                            5) Tum Harfler ve Rakamlar ==> [a-zA-Z0-9]
                            6) Tum Noktalama Isaretleri ==> \\p{Punct}
                            7) Tum Sesli Harfler ==> [aeiouAEIOU]

                            ^ ==> den farkli, haricinde
                             1) Tum Rakamlar Haric ==> [^0-9]
                             2) Tum Kucuk Harfler Haric ==> [^a-z]
                             3) Tum Buyuk Harfler Haric==> [^A-Z]
                             4) Tum Harfler Haric==> [^a-zA-Z]
                             5) Tum Harfler ve Rakamlar Haric ==> [^a-zA-Z0-9]
                             6) Tum Noktalama Isaretleri Haric ==> \\p{Punct}
                             7) Tum Sesli Harfler Haric ==> [^aeiouAEIOU]

11) replaceFirst () : replace () ile ayni isi yapmakkla birlikte ilk gordugu datayi degistirir.

12) trim () : Bir String'de bastaki ve sondaki space karakterlerini siler, ortadaki
              space karakterlerine dokunmaz.

13) isEmpty () : String data'nin iceisinde hicbir sey yoksa True dondurur.
                 Java'da space'de bir karakter oldugu icin space varsa False dondurur.


14) isBlank () : ==>space+hiclik ise True dondurur.
                 String bir data'nin bos mu dolu mu olduguna bakar isEmpty'den farki space varsa
                 yine true dondurur.


15) indexOf () : Verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
                 int deger dondurur.
                 Coklu data icin kullanildiginda ilk ngordugu data'nin ilk karakkterinin
                 index'ini verir.
                 Olmayan bir karakterin index'i sorulursa bize -1 dondurur.


16) lastIndexOf () : Verilen String bir data'da istenilen degerin son gorunumunun indexini verir.
                     Olmayan bir karakter sorgulanirsa -1 dondurur.

17) If Statement () : Bazen kodlarin calismasi belirli kosullara baglidir.
                      Mesela cok calisirsam java ogrenecegim. Java ogrenme eylemi
                      cok calisma eylemine baglanmistir.
                      1. eylem gercekklesmeden ikinci eylem gerceklesmez.
                      if() {}
                      () parantez icine sart yazilir. Eger True dondurulurse {} body arasindaki kod calisir
                      aksi halde if body disina cikar class'ta sonraki kodlari okumaya devam eder.

     */
}
