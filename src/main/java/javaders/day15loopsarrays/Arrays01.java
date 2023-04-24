package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {

        /*
        1. Array, Java'nin "ayni data tipi"nde "coklu data" depolamak icin olusturdugu bir yapidir
        2. Array'ler "Premitive data type" leri veya "referance" lar ile calisir
        3. Arrayler "super fast" dir ve "memory're cok az" yer kaplar

         */

        public static void main(String[] args) {

            //Array nasil olusturulur?
            String stdNames[] = new String[5];

            //Array nasil yazdirilir?
            System.out.println(stdNames);//@19dfb72a
            System.out.println(Arrays.toString(stdNames));//[null, null, null, null, null]
            //null'lar stringin default degerleridir.

            //Array'e nasil eleman eklenir?
            stdNames[0]= "Ajda";
            System.out.println(Arrays.toString(stdNames));//[ajda, null, null, null, null]
            stdNames[3]= "Cuneyt";
            System.out.println(Arrays.toString(stdNames));//[Ajda, null, null, Cuneyt, null]
            stdNames[2]= "Kemal";
            System.out.println(Arrays.toString(stdNames));//[Ajda, null, Kemal, Cuneyt, null]
            stdNames[4]= "Filiz";
            System.out.println(Arrays.toString(stdNames));//[Ajda, null, Kemal, Cuneyt, Filiz]
            stdNames[1]= "Ayhan";
            System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Kemal, Cuneyt, Filiz]

            //Array'deki specific bir elemani nasil alabiliriz?
            System.out.println(stdNames[3]);//Cuneyt

            //Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

            //1. Way:
            for (int i =0; i<stdNames.length; i++){// length String'lerde parantezli(Method), Arrays'lerde
                //parantezsiz(Method degil) kullanilir


                System.out.println(stdNames[i] + "*");
            }

            //2. Way: for-each loop ==>Enhanced(Zenginlestirilmis) Loop- Mumkunse hep for-each loop kullanin

           for (String w : stdNames){//[Ajda, Ayhan, Kemal, Cuneyt, Filiz]
                //w variable ismidir farkli birsey de kullanilabilir fakat genelde w kullanilir

               System.out.println(w + "*");
           }


           //Example 2: Bir integer Arrays olusturunu, 5 eleman ekleyiniz, elemanlarin taplamini bulup console yazdiriniz

            int ages[] = new int[5];
            ages[0]= 12;
            ages[1]= 23;
            ages[2]= 9;
            ages[3]= 38;
            ages[4]= 27;
            System.out.println(Arrays.toString(ages));//[12, 23, 9, 38, 27]

            int sum = 0;

            for (int w : ages ) {

                sum = sum + w;
            }

            System.out.println(sum);//109

            //Example 3: Bir char Arrays olusturunu, 3 eleman ekleyiniz, elemanlarin carpimini bulup console yazdiriniz

            char initials[] = new char[3];
            initials [0] = 'J';//74
            initials [1] = 'P';//80
            initials [2] = 'A';//65

            int carpim=1;
                                //[J, P, A]
            for (char w : initials){
                carpim=carpim*w;
            }
            System.out.println(carpim);//384800





        }
}
