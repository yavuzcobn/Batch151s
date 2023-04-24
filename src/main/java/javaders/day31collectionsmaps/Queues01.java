package javaders.day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    //Queue ==> Ilk giren urun ilk cikmalidir.  First In First Out .
    // Bankalardaki numaralandirma sistemi bu sekildedir.

    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");

        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek());//Meat ==> peek() ilk elemani copy-paste yapar. Bos Queue'lar icin null verir

        System.out.println(wareHouse.element());//Meat ==> element() ilk elemani copy-paste yapar. Bos Queue'lar icin hata verir

        System.out.println(wareHouse.poll());//Meat ==> element() ilk elemani cut-paste yapar. Bos Queue'lar icin null verir
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();
        System.out.println(wareHouse.poll());//null
        System.out.println(wareHouse.remove());//==> remove() ilk elemani cut-paste yapar. Bos Queue'lar icin hata verir(Exception)


    }
}
