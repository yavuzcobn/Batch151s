package javaders.day35exceptions;

public class E01 {

    public static void main(String[] args) {

        System.out.println(convertStringToInt("123")+2);

        System.out.println(convertStringToInt("12ab")+2);//"NumberFormatException" sayi formati hatasidir.
                                                         // Girilen String sayi formatinda degilse bu hatayi aliriz
        //valueOf(str) methodu String'i integer'a cevirir. "123" olan String'i java sayi gibi gordu ve istedigimiz
        //sekilde toplama islemi yapti. ValueOf nethodunu sayi formatinda olmayan bir String ile kullanirsak exception
        //aliriz. NumberFormatException aliriz.

    }

    //Bir string'i Integer'a ceviren method olusturunuz.
    public static int convertStringToInt (String str){


    try {
        return Integer.valueOf(str);

    }catch (NumberFormatException e){//valueOf() method'u non-digit character iceren bir String ile kullanildiginda NumberFormatException atilir.

       str =  str.replaceAll("[^0-9]","");
        return Integer.valueOf(str);
        }

    }

}
