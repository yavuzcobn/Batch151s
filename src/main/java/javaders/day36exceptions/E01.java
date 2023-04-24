package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*
        1)Run Button'una bastıktan sonra alınan exception'lara"Runtıme Exceptions"  denir.
          AritmaticException, NullPointerExcetpion, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
          "Runtime Exception"a ornektir.
          "Runtime Exception" lara "Unchecked Exception" da denir.

        2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'larda vardir, bunlara "Compile Time Exception denir.
          "FileNotFoundExceptioon, IOException "Compile Time Exception" a ornektir.
          "Compile Time Exception"lara "Chacked Exception" da denir.

        3)FileNotFountException: Java'ya bir dosyayi bul dedigimizde, Java "dosyanin adresi" ve "dosyanin varligi" konusunda
                                 hata olusursa ne yapmasi gerektigini soylememizi ister.

        4)IOException: "IO" Input Output demektir.
                        Note IOException, FileNotFountException'in parent'idir.

        5)Java da hata'lar temelde ikiye ayrilir. Exception' lar hendle edilebilir hatalardir.Lakin Error'lar asla handle edilemezler
          i)Exception'lar ii)Error lar. a)StackOverflow Error(Stack Memory'nin dolmasi halinde olusur)   b)Out Of Memory Error(Heap Memory"nin dolmasi halinde olusur)
                                        c)Virtual Machine Error( JVM (Java Sanal Makinesi) nin arizalanmasi halinde olusur)
     */

    public static void main(String[] args) throws IOException {

        //1.Way: Exception'i mathod signature satirina ekledik
        FileInputStream fis = new FileInputStream("javaders/day36exceptions/TextFile");

        int i =0;

        while ((i=fis.read())!=-1){//read() methodu character'lerin ascii degerini verir

            System.out.print((char)i);

        }





    }
}
