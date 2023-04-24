package practice.day_01_practice;

public class C03_Ascii {
    public static void main(String[] args) {
        /*
        CEM isminin icinde bulunan harfleri kullanmadan yazdiriniz
        C=67
        E=69
        M=77
        */

        System.out.println(((char)67) +""+ ((char)69) + ((char)77));

        //2.Yol
        char ilkKarakter = 'B'+1;// boylelikle C harfini elde etmis oluyoruz

        char ikinciKarakter= 'D'+1;//boylelikle E harfini elde etmis oluruz

        char ucuncuKarakter= 'L'+1;//boylelikle M harfini elde etmis oluruzu

        System.out.println(""+ilkKarakter+ikinciKarakter+ucuncuKarakter);//parantez icersinde ki "" ile string bir ifadeye cevirdik

    }
}
