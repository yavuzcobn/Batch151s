package calisma.day0103;

import java.util.Scanner;

public class C02_Soru {

        //Kullanicidan bir String isteyin ve Stringi ters ceviren methodu yazdirin


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Lutfen String giriniz");
        String m=sc.nextLine();
        System.out.println(terstenYazdir(m));
    }

    public static String terstenYazdir(String k){
        String tersHali="";
        for(int i =k.length()-1;i>=0;i--){
            tersHali+=k.charAt(i);
        }
        return tersHali;
    }

}
