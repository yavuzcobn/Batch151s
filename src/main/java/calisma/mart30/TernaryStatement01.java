package calisma.mart30;

public class TernaryStatement01 {

    public static void main(String[] args) {

        //soru 1:

        String parola = "abc1283e";

        String gecerliMi = parola.replaceAll("\\s","").length()>7 ? "Gecerili Parola" : "Gecersiz Parola";
        System.out.println(gecerliMi);

        //soru 2:

        int a = 2, b = 3, c = 5;

        String ucgenTipi = a==b && b==c ? "Esit Kenar ucgen" : (a==b||a==c|| b==c ? "Ikiz kenar ucgen" : "Cesit kenar ucgen");

        System.out.println(ucgenTipi);

        //soru 3:

        int d = 131;

        String sonuc = d%10>=5 ? ("son basamagi bir ustte yuvarla: "+ (d/10+1)*10) :("son basamagi bir alta yuvarla: "+ (d/10)*10);
        System.out.println(sonuc);


        //Soru 4:


        int yil = 2004;

        String artikYil = yil%100==0 ? (yil%400==0 ? "artik yil" : "artik yil degil") : (yil%4==0 ? "artik yil" : "artik yil degil");

        System.out.println(artikYil);

        //soru 5 :

        String sifre = "Kamil12";

        String sifreKontrol =  sifre.length()>8 ? sifre.startsWith("i") ? "Gecerli": "Gecersiz": sifre.startsWith("K") ? "Gecerli ":
                "Gecersiz";;
        System.out.println(sifreKontrol);

        //soru 6:

        int i = 15;

        int sonuc1 = i<0 ? i*-1 : i;
        System.out.println(sonuc1);

        //soru 7:

        int k = 41;
        int l = 31;

        int sonuc2 = k<l ? k : l;
        System.out.println(sonuc2);

        //soru 8;

        int m = -1000;
        m = Math.abs(m);

        String ucBasamakli = m<1000&&m>99 ? "uc basamakli" : "maalesef degil 3 basamakli aga";
        System.out.println(ucBasamakli);

        //9

        int n = -121;

        String  tekCift = n%2==0 ? "Cift" : "Tek";
        System.out.println(tekCift);

        //10. Soru :))

        int e = -1500;

        String poz = e>0 ? "Pozitif" : "Pozitif Degil";
        System.out.println(poz);



















    }
}
