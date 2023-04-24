package calisma.day0103;

import java.util.Scanner;

public class C06 {
    //Kullanicidan baslangic ve bitis harflarini alin ve baslangic harfinden baslayip bitis harfinden biten tum harfleri buyuk harf olarak ekrana yazdirin.
    //Kullanicinin hata yapmadigini farz edin
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Kullanici Lutfen Baslangic harfini giriniz");
        char ilkHarf=sc.next().toUpperCase().charAt(0);
        System.out.println("Kullanici Lutfen Bitis Harfi Girniz");
        char sonHarf=sc.next().toUpperCase().charAt(0);
        printChar(ilkHarf,sonHarf);

    }
    public static void printChar(char a,char b){
        if(a>b){
            char temp=a;
            a=b;
            b=temp;
        }

        for(char i=a;i<=b;i++){
            System.out.print(i+", ");
        }
    }

}

