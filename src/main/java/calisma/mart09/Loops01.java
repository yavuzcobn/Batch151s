package calisma.mart09;

public class Loops01 {
    public static void main(String[] args) {
        /*
        1) 120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız.

        2) 2) Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız. Örneğin; accessories ´ ces
         */

        int a = 121;
        int b = 9;

        for (int i = a; i > b; i--) {

            if (i%6==0 && i%4==0){

                System.out.print(i + " ");//120 108 96 84 72 60 48 36 24 12
            }

        }
        System.out.println();


        String str ="accessories";

        String bos ="";
        for(Integer i=0; i<str.length(); i++){
            String harf = str.substring(i,i+1);

            if(str.indexOf(harf)!=str.lastIndexOf(harf)){

                if(!bos.contains(harf)){
                    bos= bos + harf;
                }
            }
        }
        System.out.println(bos);//ces


    }
}
