package javaders.day22stringbuilder;

public class Student {

    //stdName "public" oldugu icin diger class'lardan ulasilabilir

    public String stdName = "Ali Can";

    //Access Modifer'i "default" olan ile "public" olan class member'larr ayni package icinde
    //kullandiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli package'a gectiginizde, "public" olanlara ulasabilir "default" olanlara
    //ulasilamaz.
    int age = 23;

    //Access Modifier'i "private" olan Class Member'lar sadece olusturduklari class
    //icinden gorulebilirler
    //Olusturulduklari class'in disina ciktiginizda gorunmez, ulasilmaz olurlar.
    private  String healthCondition = "Cancer";

    //Access Modifier'i "protecter" olan Class Member'lar ayni package icinde iken "public" gibi
    //davranirlar.
    //Farkli package'a gectiginizde "protected" olanlar sadece child class'lardan gorulebilir.
    protected int salary = 3000;

    //Note: Class'lar public ve default olabilir. Ama, private ve protected olamazlar.


}
