package calisma.day0103;

import java.util.Scanner;

public class C03_palindrome {

    public static void main(String[] args) {
        //Kullanicidan bir String alip palindrome olup olmadigini konrol eden bir program yaziniz

        Scanner sc = new Scanner(System.in);
        System.out.println("Kullanici Lutfen Bir String Giriniz");
        String a= sc.nextLine();
        isPalindrome(a);

    }
    public static void isPalindrome(String a){
        String tersHali="";
        for(int i=a.length()-1;i>=0;i--){
            tersHali+=a.charAt(i);
        }
        if(a.equalsIgnoreCase(tersHali)){
            System.out.println("It s Palindrome");
        }else{ System.out.println("It is not Palindrome");}
    }
}


