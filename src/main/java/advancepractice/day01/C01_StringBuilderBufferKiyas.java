package advancepractice.day01;

public class C01_StringBuilderBufferKiyas {
            /*
                        2023 Nisan QA Tester

         * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
         * kontrol edip, String Buffer ve String class'larinin performanslarini
         * karsilastiralim.
         * Ipucu: long TimeSb = System.nanoTime(); kullanalim
         */

    public static void main(String[] args) {
        String str = "Merhaba";
        System.out.println("*********************************** String ***************************");
        long time1 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            str += " "; //str= str + " ";
        }
        long time2 = System.nanoTime();
        long stringSure = time2 - time1;
        System.out.println(stringSure);
        System.out.println("String Sure = " + stringSure / 1000 + " nano saniye");
        System.out.println("************************************ StringBuffer *********************");
        long time3 = System.nanoTime();
        StringBuffer buffer = new StringBuffer("Merhaba");
        for (int i = 0; i < 1000; i++) {
            buffer = buffer.append(" ");
        }
        long time4 = System.nanoTime();
        long bufferSure = time4 - time3;
        System.out.println(bufferSure);
        System.out.println("Buffer Sure = " + bufferSure / 1000 + " nano saniye");
        System.out.println("************************************ StringBuilder *********************");
        long time5 = System.nanoTime();
        StringBuilder builder = new StringBuilder("Merhaba");
        for (int i = 0; i < 1000; i++) {
            builder = builder.append(" ");
        }
        long time6 = System.nanoTime();
        long builderSure = time6 - time5;
        System.out.println(builderSure);
        System.out.println("Builder Sure = " + builderSure / 1000 + " nano saniye");
        System.out.println("************************** Uclu Kiyas **********************");
        if (stringSure > bufferSure && stringSure > builderSure) {
            System.out.println("En yavas String Classi");
            if (bufferSure > builderSure) {
                System.out.println("Ikinci yavas Buffer Classidir");
                System.out.println("En hizlisi Builder Classidir");
            } else {
                System.out.println("Ikinci yavas Builder Classidir");
                System.out.println("En hizlisi Buffer Classidir");
            }
        } else if (bufferSure > stringSure && bufferSure > builderSure) {
            System.out.println("En yavas Buffer Classidir");
            if (stringSure > builderSure) {
                System.out.println("Ikinci yavas String Classidir");
                System.out.println("En hizlisi Builder Classidir");
            } else {
                System.out.println("Ikinci yavas Builder Class'idir");
                System.out.println("En hizlisi String Class'idir");
            }
        } else {
            System.out.println("En yavas Builder Class'idir ");
            if (builderSure > stringSure) {
                System.out.println("Ikinci yavas Buffer Class'idir");
                System.out.println("En hizlisi String Class'idir");
            } else {
                System.out.println("Ikinci yavas String Class'idir");
                System.out.println("En hizlisi Buffer Class'idir");
            }
        }
    }
}
