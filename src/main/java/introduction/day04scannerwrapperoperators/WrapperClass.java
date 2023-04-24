package introduction.day04scannerwrapperoperators;

public class WrapperClass {

    public static void main(String[] args) {

        //primiteve     : char  -       boolean -   byte    -   short   -   int     -   long     -  float    -  double
        //Wrapper Class : Character -   Boolean -   Byte    -   Short   -   Integer -   Long    -   Float   -   Double


        /*
            Wrapper Class'lar non-primitive'dir. o yuzden memory'de cok yer kaplarlar
            o yuzden sart değilse wrapper class kullanmayi tercih etmeyiz
            boyle bir imkanin varligindan da haberdar olmaliyiz.
        */
        // "n" yazip "nokta" koyarsaniz hic method göremezsiniz, cunku primivive'ler method icermez
        int n = 12;
        //"m" yazip "nokta" koyarsaniz bircok method görebilirsiniz, cunku wrapper class'lar method icerir.
        Integer m =12;

        byte p = 13;
        Byte r = 12;


        //Ornek 1: short data type'inin min ve max degerlerini bulunuz.

        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);//32767

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);//-32768

        //Ornek 2: int data type'inin minimum değeri ve byte data type'inin maximum degerinin toplamini bulunuz

        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;

        System.out.println(intMin+byteMax);//-2147483521

        //Ornek 3: i) Primitive int'i wrapper Integer'a ceviriniz.

        int num = 13;
        Integer wrapperNum = num;//Autoboxing
        /*
            primitive yani method bulunmayan bir kutudaki degeri olarak icinde bazi methodlar
            bulunan wrapper kutuya atama yaparsak bu isleme "autoboxing" denir.
         */

        //ii)Wrapper Byte'i pirimitive byte'a ceviriniz.

        Byte k =33;
        byte primitiveK = k;//Unboxing
        /*
            wrapper bir kutu icinde bazi methodlarla birlikte bulunan degeri olarak
            primitive yani method bulunmayan bir kutuya atama yaparsak bu isleme "Unboxing" denir.
         */

        //Ornek 4: i)Primitive char'i Wrapper Character'e ceviriniz.(Autoboxing)

        char initial = 'T';
        Character initialWrapper = initial;

                //ii) Wrapper Boolean'i primitive boolian'a ceviriniz.

        Boolean isOld = true;
        boolean isOldpr = isOld;















    }
}
