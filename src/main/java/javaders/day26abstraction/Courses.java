package javaders.day26abstraction;

public abstract class Courses {
    /*
        1)Bazen parent class'daki method'un body'si hicbir child class
          tarafindan kullanilmaz.
          Bu durumda parent'daki method'a body yazmak hic kullanilmadigi
          icin mantikli degildir
          Biz de o method'a body yazmayiz.
        2)Body'si olmayan method'a "Abstract Method' denir.
          Abstract ingilizcede "vucutsuz" veya "soyut" anlamindadir.
        3)Method'un body'sini yazmayince Java hata verir, biz de "abstract"
          keyword'unu kullanarak Java'ya bu method'unn body'si olmayacak deriz.
        4)"abstract" keyword'unu kulalninca elde ettigimiz asbstracat method
          mormal class'lara konulamaz, o yuzden class'i da "abstract" yapariz.
        5)Parent'taki method abstract ise butun child class'lar o method'u
          override etmek zorundadir.
          Bu yuzden tum child'lar icin mecburi olmasini istediginiz fonksiyonlari
          abstract yapmak mantikli bir secimdir.
        6)Body'si olan method'lar(Concrete Method) abstract class'larin icine yazilabilir.
          abstract method'lar concrete class'larin icine yazilamazlar.
        7)"abstract" keyword ile "method body" bir method'da ayni anda kulanilamaz.
        8)"abstract class"larin icinde "abstract method"lar olur, "abstract method"lar
          body'si olmadigindan "eksik method"lar gibi dusunulebilir.
          Yani abstract class icinde eksek bir yapi barindirir, siz abstract class'dan
          object uretirseniz aabstract class icindeki eksiklik object'e yansir ve objecet
          eksigi olan bir object olmus olur
          Java bunu istemez cunku eksik object eksik is yapar, bu da application'in yanlis calismasina sebep olur.
          Java application'i korumak icin "abstract class" lardan objecet uretilmesini engellemistir.
        9)"abstract class"larin constructor'i vardir ama object olusturamazlar.
        10)"final method"lar "abstract" olamazlar.
        11)"privite method"lar "abstract" olamazlar.
        12)"abstract class"larin "abstract child'i veya concrete child'i olabilir.
     */

    /*
        "final" keyword'u aciklar misiniz?
        "final" keyword i) Variable'larda ii)method'larda iii)class'larda kullanilabilir.

        i)variable'larda kullanildiginde a)O variable'a kesinlikle deger atamasi yapilmalidir.
                                         b)Ilk atanan deger degistirilemez.

        ii)method'larda kullanildiginda  a)O method'un body'si degistirilemez.
                                         b)O method override edilemez.

        iii)class'larda kullanildiginda  a)O class'in child class'i olamaz ama final class'in kendisi child olabilir.

     */

    public abstract void math();

    public void art(){
        System.out.println("Learn art");
    }






}
