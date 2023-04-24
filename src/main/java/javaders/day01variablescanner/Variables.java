package javaders.day01variablescanner;

public class Variables {

    public static void main(String[] args) {

        //byte, short, integer, long, double, float
        //veri tiplerinin max ve min degerlerini yazdiran kodu yazdiralim

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);
        System.out.println("shortMax = " + shortMax);

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;

        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);



    }//main
}//class body
