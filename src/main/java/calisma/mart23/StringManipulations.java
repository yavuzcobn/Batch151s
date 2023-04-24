package calisma.mart23;

public class StringManipulations {

    public static void main(String[] args) {

        //1.Soru:
        String city = "miami";
        String city1 = String.valueOf(city.toUpperCase().charAt(0));
        String city2 = city.substring(1).toLowerCase();
        System.out.println(city1+city2);

        //2.Soru:
        String isim1 = "Ali Can";
        String isim2 = "Aliye Canan";
        String isim3 = "Aliyev Can Cananov";
        Integer c1 = isim1.replaceAll("\\s","").length();
        Integer c2 = isim2.replaceAll("\\s","").length();
        Integer c3 = isim2.replaceAll("\\s","").length();
        System.out.println(c1+c2+c3);

        //3.Soru:
        String s = " Miami 33018!!! ";
        Integer karakterSayisi = s.replaceAll("\\s","").replaceAll("[^a-zA-Z0-9]","").length();
        System.out.println(karakterSayisi);//10

        //4.Soru:
        String s1 = "2a3B4?-!5";
        Integer rakamOlmayan = s1.replaceAll("[0-9]","").length();
        System.out.println(rakamOlmayan);//5

        //5.Soru:
        String s2 = "Ali Can";
        int boslukOlmayanSonKrkIndex= s2.trim().length()-1;
        String boslukOlmayanSonKrk = s2.substring(boslukOlmayanSonKrkIndex,
                boslukOlmayanSonKrkIndex +1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);

        //6.Soru:
        String s3 = "Mahmut";
        int son = s3.length()-1;
        int sonASCII = s3.charAt(son);
        int ilk = s3.charAt(0);
        System.out.println(sonASCII+ilk);//193

        String sonKrkDis = s3.substring(0, s3.length()-1).toUpperCase();
        System.out.println(sonKrkDis);

        //9. Soru:
        String orta = s3.substring(1, s3.length()-1).toUpperCase();
        System.out.println(orta);

        //13.Soru
        /*
            Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
            Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
            sembol olmalıdır.

            Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
                  'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
                  '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
                  '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
                  '! a b 3 k' kodunuz konsolda false yazdırmalıdır.
         */

        String sifre = "!1a23b4?es";
        Boolean krktSayisi = sifre.replaceAll("\\s", "").length()>=8;
        Boolean syblVarmi = sifre.replaceAll("\\s", "").replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println("sifre gecerli mi? "+(krktSayisi && syblVarmi));

















    }
}
