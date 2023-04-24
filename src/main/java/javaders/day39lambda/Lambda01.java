package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;

public class Lambda01 {

    public static void main(String[] args) {


    //Example 1: Bir List'teki elemanlari console'a yazdiran methodu olusturunuz.

    //1.yol
    List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");




        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printExceptStartWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniiqueLowerCaseSortWithLength(myList);

}
    public static void printElements(List<String>myList){

        for (String w : myList){
            System.out.print(w + " ");
        }

    }

    //2.yol:
    public static void printEl(List<String>myList){

        myList.stream().forEach(t-> System.out.print(t + " "));
    }

    //Example 2: Bir List'deki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printExceptStartWithT(List<String>myList){

        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t + " "));

    }

    //Example 3: Bir List'te character sayisi 4'den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String>myList){

        myList.stream().filter(t->t.length()<4).forEach(t-> System.out.print(t + " "));

    }

    //Example 4: Bir List'te character sayisi 4'den fazla olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.

    public static void printElLengthMoreThanFourWithUpper(List<String>myList){

        myList.stream().filter(t-> t.length()>4).map(t->t.toUpperCase()).forEach(t-> System.out.print(t + " "));
        // map() var olan elemani degistirir

    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz
    //           olarak kucuk harflerle console'a yazdiran method'u olusturunuz.

    public static void printElLengthMoreThanFourUniqueLowerCase(List<String>myList){
        //lambda'da elemanlari azaltan methodlar once kullanilir
        myList.
                stream().
                distinct().//distinct()tekrarli elemanleri bir kere gosterir.
                filter(t->t.length()>4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t + " "));

    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.

    public static void printElUniqueToUpperCaseSorted(List<String>myList){

        myList.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted().//Alfabetik siraya gore dizer
                forEach(t-> System.out.print(t +" "));

    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina
                // gore kucukten buyuge siralayarak yazdiran method'u olusturunuz.

    public static void printElUniiqueLowerCaseSortWithLength(List<String>myList){

        myList.
                stream().
                distinct().
                map(t->t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).//kucukten buyuge siraya gore dizer
                forEach(t-> System.out.print(t +" "));
        //Note: Siralamayi bir sarta baglayacaksak sorted(Comparator.comparing()) kullanmaliyiz

    }








}

//Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz
/*
Main method disinda bir listteki elemanlari console'a yazdiran kodumuzu olusturalim.

public static printElements(List<String> myList) olarak methodumuzu olusturduk. Listimizi import ettik.
for each loop kullandik. sadece listimizi for each icinde String w'ya assign ettik. Sout icinde w+ " " yazdik.
Bu methoda bir List vermeliyiz.  Main method icine myList isimli String List olusturduk. Listimize add methodu ile elemanlar ekledik. methodu parantezi icine myList ekleyerek cagirdik.
Calistirinca ekrana elemanlar yazildi. Bu birinci yoldu.

Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
degisti. Tom
         Jim
         Clara

  stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
  Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu sekilde yazdiriyor. Her yazdirmada bir bosluk birakiyor.
 */
/*
Ilk yolumuzda uc katli bir yapi olusturuyoruz. Buna yapisal kod denir. Mimari bir yapi olusturduk.
Ikinci yolda ise sadece for each dedik. Burada bir yapi olusturmak yerine javaya direct methodun ismini veriyoruz. Bu proglama tarzina functional programming denir
 */
/*
Example 5: Bir Listteki charcter sayisi 4 den cok olan tum elamanlari tekrarsiz olarak kucuk harflerle
consol'a yazdiran methodu olusturun.
Bu soruda cok sey isteniyor. Lambda ile kisa surede yapabiliriz.

Yukaridaki listimize daha sonra bir tane daha Tom, bir tane daha Clara ve bir Angelina ekledik.

public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myLIst)
Listimizde tam 6 eleman vardi. Sirasiyla 4'ten kucuk olanlari daha sonra birden fazla olanlarin tekrarli olanlarini
iptal ettik. Once listi stream'e cevirdik ve filtreleme isini yaptirdik. Bu kismda elemanlardan Tom ve Jim'i iptal etti.
Neyi eleyecek? length'i 4'ten kucuk olanlar elendi devaminda distinct methodunu kullandik. Cunku tekrarli olanlari bir kez yazmasini istedik. Clara iki kez vardi.
Clara'yi bire dusurdu. map'i yazarak toLowerCase methodunu
alabildik, aldigi elemanlarin karakterlerini kucuk harfle yazdik. forEach methodu icine sout, onun da icine t'yi yazdik. Main method icine gidip methodu yazinca
ekranda clara angelina'yi gorduk. Diger elemanlardan birer tane daha vardi.

Elemanlari azaltan methodlar genellikle once kullanilir. Yazdigimiz kod buyudukce okumak zorlasir. Functional programming sayesinde kodumuzu daha okunur hale getirmis oluruz.
 */
