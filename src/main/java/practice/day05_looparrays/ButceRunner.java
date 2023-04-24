package practice.day05_looparrays;

public class ButceRunner {

    public static void main(String[] args) {

        Butce baba = new Butce();
        Butce anne = new Butce();
        Butce cocuk = new Butce();

        System.out.println("Maas oncesi Butce: " + Butce.butce);//Maas oncesi Butce: 0

        baba.maasAl(30000);
        System.out.println("Maas sanrasi Butce: " + Butce.butce);//Maas sanrasi Butce: 30000

        baba.harclikAl(100);
        baba.harckliktanHarca(80);
        System.out.println("Harcliktan sonra Butce: " + Butce.butce);//Harcliktan sonra Butce: 29900
        System.out.println(baba.harclik);//20

        anne.maasAl(50000);
        anne.harclikAl(500);
        anne.harckliktanHarca(500);
        System.out.println("Maas sanrasi Butce: " + Butce.butce);
        System.out.println(anne.harclik);//0

        cocuk.harclikAl(200);
        cocuk.harckliktanHarca(180);
        System.out.println(cocuk.harclik);//20

        System.out.println("Son butce: " +Butce.butce);//Son butce: 79200

    }
}
