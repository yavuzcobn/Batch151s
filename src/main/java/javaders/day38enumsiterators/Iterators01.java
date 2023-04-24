package javaders.day38enumsiterators;

import java.util.*;

/*
Itereatorlar bir collectiondan eleman silme ve collectiondaki elemani degistirme konusunda looplara nazaran
daha basarilidir.
Iki tip iterator vardir. Birincisi sadece iterator olup bu sadece eleman silmede kullanilir.
Eleman eklemek veya elemani degistirmek mumkun degildir.
Ikincisi ise ListIterator olup, elaman silebilir, ekleyebilir ve degistirebilir.
Iterator sadece soldan saga dogru for each loop gibi ilk elemandan son elemana kadar calisir.
ListIterator ise iki yonlu calisabilir. Bastan sona, sondan bas elemana gidebilir.
 */
public class Iterators01 {
    /*
        1)Iterator'lar loop'larin yaptigi ayni isi yapar.
        2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
        3)Iterator'lar ile loop'lar arasinda performans farkı yoktur.
        4)Iterator'lar bir coolection'dan eleman silme ve bir collection'daki elimani degistirme konusunda daha basarilidir.
        5)Iki tip iterator var; i) Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya degistirmek mumkun degildir.
                                ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degitirebilir
                                Note:Iterator sadece soldan saga(ilk elemandan son elemana) calisir.
                                    "ListIterator" ise iki yonlu calisabilir.
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);//[Tom, Jim, Clara, Angie, Mark]

        //"Iterator" kullanalim
        Iterator<String> myItr= myList.iterator();//[ Tom, Jim, Clara, Angie, Mark]


        while (myItr.hasNext()){//hasNext() Iterator'da bir sonraki eleman var mi yok mu onu sorar. Eleman varsa True yoksa false return eder.

            myItr.next();//next()pointer'i bir sonraki elemanin onune tasır ve ustunden atladığı elemani return eder.

            myItr.remove();//next() methodunun return ettigi elemani siler

        }
        System.out.println(myList);//[]

        //"ListIterator" kullanalim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");

        System.out.println(yourList);//[Tom, Jim, Clara]

        ListIterator<String> yourListItr =  yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el + "!");//set() methodu list'i update etmeye yarar.

        }
        System.out.println(yourList);//[Tom!, Jim!, Clara!]

        //hasPrevious() ve previous() nasil kullanilir?
        while (yourListItr.hasPrevious()){//hasPrevious(); pointer'a "Senden once eleman var mi?" diye sorar.
                                          //Eleman varsa "true" yoksa "false" return eder. Bu method sagdan sola dogru calisir
                                          //previous() pointer'i bir onceki elemanin onune tasir ve ustunden atladigi elemani return eder.

            String el = yourListItr.previous();
            System.out.println(el);
            yourListItr.set("?" + el);

        }
        System.out.println(yourList);


        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr =ourList.descendingIterator();

        while (ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }


















    }

}
