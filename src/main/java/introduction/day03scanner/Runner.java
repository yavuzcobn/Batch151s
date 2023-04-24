package introduction.day03scanner;

public class Runner {

    public static void main(String[] args) {

        //Object nasil olusturulur?
        //Class ismi + objecet ismi + Atama operatoru + "new" + Constructor
              Car          myCar             =           new        Car();

        //"new" keyword'u sifirdan yeni bir object olusturmak icin kullanilir.
        // Constructor Java'da nesneleri olusturmak icin kullanilan ozel bir methoddur.


        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student tomHanks = new Student();

        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();

    }
}
