package javaders.day04memorykullanimiwrapperclass;

public class C02_WrapperClass {
    /*
    Javada sonucta bir urundur. Oracle firmasinin bir urunudur. Developperlar sadece data
    barindiran pirimitive data typelarinin non primitive ler gibi method da barindirmasini istemislerdir.
    Bunun uzerine Java primitive data type'larina method ekleyerek Ozel bir class olusturmustur
    Buna da Wrapper(sarmalama,durum) Class denir.


        Primitive                   Non-Primitive

        byte            ==>         Byte
        short           ==>         Short
        int             ==>         Integer ***
        long            ==>         Long
        float           ==>         Float
        double          ==>         Double
        boolean         ==>         Boolean
        char            ==>         Character   ***
     */

    public static void main(String[] args) {

        byte primitiveByte = 12;
        Byte wrapperByte = 12;

        //byte data type'inin en buyuk ve en kucuk degerlerini ekrana yazdirin

        byte maxDeger = Byte.MAX_VALUE;
        byte minDeger = Byte.MIN_VALUE;

        System.out.println(maxDeger);//127
        System.out.println(minDeger);//-128

        //Ex: int data type'i max degeri ile byte data type'inin  minimum degerini toplamini hesaplatan methodu olusturunuz

        int maxInt = Integer.MAX_VALUE;

        System.out.println(maxInt+minDeger);//2147483519

        //*** Primitive Data Type'larini Wrapper Classlara nasil ceviririz****

        float primitiveFloat = 12.33F;
        Float wrapperFloat =  primitiveFloat;//buna Autoboxing denir :
        //Otomatik Kutulama Java bunu otomatik olarak yapar kucuk kutuyu buyuk kutuya yerlestirir

        //******Wrapper Classlari Primitive Data type'larina Nasil Ceviririz***

        Character wrapperChar = 'a';
        char primitiveChar = wrapperChar;// Unboxing kucuk kutuyu buyuk kutudan cikarma Jave bunu da otomatik yapar.

        //EX: verilen iki String datanin toplamini veren kodu yaziniz

        String str1 = "12345";
        String  str2 = "678";

        System.out.println(str1+str2);//12345678

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));//13023
        //valuof methodu Sting bir datayi Integer'a donusturur

        /*
        Java'da + sembolu iki int datayı mat. gibi toplama yapar
        Iki String ya da bir String bir int arasında ise yanyana yazdırır
        buna "Concatination" denir
        Java Matematik bilir

            i) Uslu Sayilar
            ii) Parantez ici
            iii) Carpma/Bolme
            iv) toplama/cikartma

         */

        String harf ="A";
        int sayi =7;
        System.out.println(harf+sayi);//A7
        System.out.println("K"+3*5/2);//K7

        /*
        8+3+"K"
        sout ==> 11K

        "K"+3*5/2
        sout==>K7
         */


    }//main
}//class
