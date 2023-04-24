package javaders.day18constructorsstatickeyword;

/*
    1)Constuctor nasil olusturulur?
        Access Modifier + Class Ismi + () +{ }
    2) "Method" ile "Constructor" arasindaki farklar nelerdir?
        i) "Method"larda "return type" olur, "Constructor"larda olmaz
        ii) "Method"lar yaptiklari ise gore isimlendirilirler, "Constructor"lar ise her zaman "Class ismi" ile isimlendirilirler.
        iii) "Method"lar bir aksiyon yapmak icin olusturulur, "Constructor"lar ise object olusturmak icindir.
        iv) "Method" isimleri kucuk harfle baslar, "Constructor" isimleri class ismi ile ayni oldugu icin buyuk harfle baslar
    3) Parametreli Constuctor'lar olusturarak ayni class'dan farkli ozelliklere sahip object'ler olusturabiliriz.
 */

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;
    int price = 18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmaz
    //Default Constructor'larin body'si bostur
    //Java kiskanc'tir Siz "default constuctor'i elle yazdiginizda
    //Java Object Class icindeki default constructor'i kullandirmaz.

    public Car(){

    }

    //Custom Constructor


    public Car(String make, String model, int year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Custom Constructor
    public Car(String make) {
        this.make = make;
    }

    //Custom Constructor

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }
}
