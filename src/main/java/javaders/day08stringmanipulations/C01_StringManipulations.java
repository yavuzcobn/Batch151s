package javaders.day08stringmanipulations;

public class C01_StringManipulations {

    //****************** repalceFist()******************\\

    /*
    repaceFirst () : repalace () ile ayni isi yapmakla birlikte ilk gordugu datayi degistirir
     */

    public static void main(String[] args) {

        //Ex : str String'indeki ilk gordugu "i" harfinin yerine "e" harfi yerlestiriniz
        String str ="Bizimle Java Ogrenmek Cok Kolay";

        String str1 = str.replaceFirst("i", "e");
        System.out.println("str1 = " + str1);//str1 = Bezimle Java Ogrenmek Cok Kolay

        String str2 = str.replace("i", "e");
        System.out.println("str2 = " + str2);//str2 = Bezemle Java Ogrenmek Cok Kolay

        //***************** trim()***************\\
         /*

        trim ()  Bir String'de bastaki ve
        sondaki space karakterlerini siler .
        Ortadaki space karakterlerine dokunmaz
         */


        String isim = "   Mehmet Fatih Yildirim  ";
        // EX : isim String'indeki varsa bas ve sondaki space'leri siliniz

        System.out.print("********************");
        System.out.print(isim);
        System.out.print("********************");
        String trimIsim = isim.trim();
        System.out.print(trimIsim);
        System.out.println("********************");


        // Ex : Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz

        String tv = "599.99$", laptop = "299.99$";

        String tv2= tv.replace("$", "");
        System.out.println("tv2 = " + tv2);//tv2 = 599.99
        String laptop2= laptop.replace("$", "");
        System.out.println("laptop2 = " + laptop2);//laptop2 = 299.99

        Double totalPrice = Double.valueOf(tv2)+ Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);//totalPrice = 899.98

        /*
            vaueOf()  bize String olan bir datayi sayisal bir
            degere yani islem yapabilecegimiz
            bir degere ceviriyor
         */
        String tamIsim = "  mehmet fatih  ";
        // Verilen tam Isim String'inin icindeki ilk ismin
        // ilk harfiyle son ismin ilk harfini buyuk harf
        // olarak yan yana yazdiriniz    ==>MF
        char first = tamIsim.trim().toUpperCase().charAt(0);

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("first+ second = " + first+second);//first+ second = MF
        System.out.println(first+second);//147





    }
}
