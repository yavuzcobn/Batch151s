package javaders.day11nestedifternaryswitch;

public class Loops01 {

    public static void main(String[] args) {

        /*
        Code yazarken   i) Tekrarli code yazmamaya dikkat ediniz
                        ii) Yazdiginiz code'un gerektiginde tamir edilebilmesinin kolay olmasina
                        iii) Yazdiginiz code'un gerektiginde gelistirilebilmesinin kolay olmasina
                        iv) Yazdiginiz code'un farkli senaryolar icin de calisabilmesine dikkat ediniz.
         */

        // Ekrana 5 kere "Hi" yazdiriniz.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println();

        // kod yazarken tekrardan hoslanilmaz tavsiye edilmez,
        // bu yontem(coklu tekrar kodlari) her senaryo icin calismaz,hatalarda riski coktur
        // yazdigimiz kodu surekli gelistiririz

        //Yukaridaki gibi tekrar eden isleri yapmak icin "Loop" yapilarini kullaniriz
        //4 tane loop yapisi vardir i) for-loop ii) while-loop iii)do-while-loop iv)for-each-loop

        //for-loop
            //Starting Value    Loop Condition     Increment/Decrement
        for (   int i=1          ;  i<6             ;     i++        ){
            System.out.println("Hi");
        }

        //4'Ten 24'e kadar tum tam sayilari ayni satirda aralarında bosluk birakarak console'a yazdiriniz.

        for(int i = 4; i<25; i++ ){
            System.out.print(i+ " ");//4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24

        }
        System.out.println();

        //33'den 11'e kadar tum cift tamsayilari ayni satirda, aralarinda bosluk birakarak conscole'a yazdiriniz

        for (int i=33; i>10; i--){

            if(i%2==0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        //20'den 74'e kadar tum tek tamsayilari ayni satirda, aralarinda bosluk birakarak conscole'a yazdiriniz

        for (int i =20; i<75; i++){
            if(i%2 !=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //"Massachusetts" kelimesindeki tum sesli harfleri console'a yazdiriniz

        String s = "Massachusetts";

        for(int i=0;i<s.length() ; i++ ){

           char c =  s.charAt(i);

           if (c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='U'){

               System.out.print(c+ " ");

           }

        }

    }
}
