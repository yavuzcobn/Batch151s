package javaders.day27interface;
/*
            Interfece'deki Methodlar
    1)"interface" icine "concrete method" konulamaz.
    2)"interface" icindeki methodlarin abstract oldugunu Java bilir,
      bu yuzden "interface" icindeki abstact method'larda "abstract"
      keyword kullanmaya gerek yoktur.
    3)"interface" icindeki abstract methodlarin tamami "public"dir
      Bu yuzden "interface" icinde abstact method olustururken "access modifier"
      yazmaya gerek yoktur.
    4)Bir "interface"i bir "class"in parent'i yapmak istedigimizde "extends" keyword yerine "implements" keyword kullaniniz.
    5)"Concrete Child Class"' lar "parent interface" daki "abstract method"lari override etmek zorundadirlar.
    6)"interface"ler bir applicationda "Concrete Child Class"larin yapmak zorunda olduklari
      fonksiyonlari barindirirlar. Bu yuzden "interfacee lere "to-do list" de denir.
    7)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabilirsiniz.
      abstract methodlarin body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi
      birini override ederek kullanabilirler.
    8)Birden fazla "parent interfce" icinde ayni isimli abstract methodlar olusturdugumuzda bu method'larin "returnt type"lari ayni olmak zorundadir.
    9)Normalde "interface" icine "concrete method" konulamaz ama bazi ozel durumlarda "concrete method" koymamiz gerekirse
        i)"default" keyword'unu asagidaki gibi kullanarak "interface" icine "concrete method" koyabiliriz.
            default void ece(){System.out.println("Uses gas less...");}

        ii)"static" keyword'unu asagidaki gibi kullanarak "interface" icine "concrete method" koyabiliriz.
            static void stop(){System.out.println("Stop securely....");}
     10)"default" veya "static" keyword'unu kullanarak olusturdugunuz "concrete method"larin
        "concrete child class'lar tarafindan kullanilma zorunlulugu yoktur.
     11)"default" keyword'unu kullanarak olusturdugunuz "conscrete method"lara "object" olusturularak ulasilabilir.
        "static" keyword'unu kullanarak olusturdugunuz "conscrete method"lara "object" olusturmaya gerek yoktur,
        "interface" ismi yeterlidir.
      12)"interface"lerden "object" olusturulamaz. "interface"lerin "constructor"i yoktur.

 */

public interface Engine {

    void start();

    void payment();

    default void eco(){
        System.out.println("Uses gas less...");
    }

    static void stop(){
        System.out.println("Stop securely....");
    }


}
