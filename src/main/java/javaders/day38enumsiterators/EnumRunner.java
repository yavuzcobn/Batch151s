package javaders.day38enumsiterators;

public class EnumRunner {
    /*
    Ya da state ismi verip baskentini alacagimiz bir method da olusturabiliriz.
Enum'i olusturduk ve onu kullanmak icin ayni package icinde Enum Runner Class'i olusturduk.
Bir statetin baskentine ihtiyac duydugumuzda, UsStatesEnum yanina nokta koyunca statesleri sirali halde
gorebildik. Ornegin ILLINOIS'i sectik UsStatesEnum.ILLINOIS.getCapital() yazdik ve bunu bir Stringconteynerina assign ettik.
Sonra assign ettigimiz String'in ismini sout icine yazinca baskenti alabildik.
     */

    public static void main(String[] args) {

        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);//Springfield

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);//FL

        UsStatesEnum state = UsStatesEnum.ALASKA;//emum'in data tipi enum'in ismidir.
        System.out.println(state);//ALASKA


        String stateNeme = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateNeme);//Alaska

        String abbreviationOfAlaska = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationOfAlaska);


    }


}
