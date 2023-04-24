package javaders.day25polymorphism;

public class Student {

    public String stdName = "Tom Hanks";
    public int age = 23;



    //Encapsulation: Data saklamaktir. (Data hiding) "The meaning of Encapsulation, is to make sure that
    // sensitive" data is hidden from users. To achieve this, you must."
    //Data'yi nasil saklariz? Access Modifier'ini "private" yaparak.

    //Note: Ozel datalarin butun class'lara acik olmasini engellememiz gerekir.
    //Cunku bir data tum classlara aciksa hacklenebilir


    private String stdId ="AC2023102T";

    private double gpa = 3.87;

    private boolean successfull = false;

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz.
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.


    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    //Encapsulation yapilan variable'in data type'i "boolean" ise
    //get method ismi "is" ile baslar
    // i)get method'lari hep "public" olur ii)get method'un "return type"i okudugu variable'in return type'i ile ayni olur
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar
    public boolean isSuccessfull() {
        return successfull;
    }

    //Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz.
    //Nasil degistirebiliriz? "set method" olusturarak Encapsulation edilmis data'nin degerini degistirebiliriz.
    //i)set method'lar hep "public" olur.ii)set method'un "return type"i hep void olur.
    //iii)set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.
    //iv)set method kullanarak var olan object uzerinde degisiklikler yaparak o objecet'i sanki yeni bir object'mis gibi kullanabilir
    //Note: getmethod'larin diger adi "getter", setmethod'larin diger adi "setter"dir.
    


    // class kalip obje'ler o kaliptan uretilen nesnelerdir.
    // "set method"u ise objeyi degistirmek icin kullanilir. Class'a dokunmaz
    //"get"ve "set" methodlari class'a dokunmaz objeleri degistirir


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setSuccessfull(boolean successfull) {
        this.successfull = successfull;
    }
}
