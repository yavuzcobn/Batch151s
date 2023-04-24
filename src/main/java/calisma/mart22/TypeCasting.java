package calisma.mart22;

public class TypeCasting {
    public static void main(String[] args) {

        //1. Soru:
        short num = 127;
        int numInt = num;

        //2. Soru:
        long l1 = 123L;
        int l1Int = (int) l1;

        //3: Soru:
        double fiyat = 2.34;
        float yeniFiyat = (float) fiyat;

        //4.Soru:
        double fiyat1 = 12.99;
        short yeniFiyat1 = (short)fiyat1;
        System.out.println(yeniFiyat1);//12

        //5.Soru:
        byte age = 23;
        double newAge = age;
        System.out.println(newAge);//23.0







    }
}
