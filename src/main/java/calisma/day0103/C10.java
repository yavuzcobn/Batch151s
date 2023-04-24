package calisma.day0103;

public class C10 {
    public static void main(String[] args) {

       // 'm' harfinden baslayarak 'c' harfine kadar tum harfleri yazdiriniz.

        char harf = 'm';

        do {
            System.out.print(" " + harf);
            harf--;
        } while (harf>='c');
    }
}
