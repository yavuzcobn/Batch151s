package calisma.mart22;

public class WrapperClass {
    public static void main(String[] args) {

        //1: soru:
        byte min = Byte.MIN_VALUE;//-128
        short max = Short.MAX_VALUE;//32767
        System.out.println(min+ max);

        //2: soru:
        byte sayi1 = Byte.valueOf("103");
        short sayi2 = Short.valueOf("2351");
        System.out.println(Math.abs(sayi1-sayi2));//2248









    }
}
