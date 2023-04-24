package calisma.day0103;

import java.awt.*;
import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunler = input.next();


        if (gunler.equalsIgnoreCase("pazartesi")) {
            System.out.println("Paz");
        } else if (gunler.equalsIgnoreCase("sali")) {
            System.out.println((gunler.substring(0, 1).toUpperCase())+(gunler.substring(1, 2).toLowerCase())+(gunler.substring(2, 3).toLowerCase()));
        } else if (gunler.equalsIgnoreCase("carsamba")) {
            System.out.println((gunler.substring(0, 1).toUpperCase())+(gunler.substring(1, 2).toLowerCase())+(gunler.substring(2, 3).toLowerCase()));
        } else if (gunler.equalsIgnoreCase("persembe")) {
            System.out.println((gunler.substring(0, 1).toUpperCase())+(gunler.substring(1, 2).toLowerCase())+(gunler.substring(2, 3).toLowerCase()));
        } else if (gunler.equalsIgnoreCase("cuma")) {
            System.out.println((gunler.substring(0, 1).toUpperCase())+(gunler.substring(1, 2).toLowerCase())+(gunler.substring(2, 3).toLowerCase()));
        } else if (gunler.equalsIgnoreCase("cumartesi")) {
            System.out.println((gunler.substring(0, 1).toUpperCase())+(gunler.substring(1, 2).toLowerCase())+(gunler.substring(2, 3).toLowerCase()));
        } else if (gunler.equalsIgnoreCase("pazar")) {
            System.out.println((gunler.substring(0, 1).toUpperCase())+(gunler.substring(1, 2).toLowerCase())+(gunler.substring(2, 3).toLowerCase()));
        } else {
            System.out.println("Gecerli gun ismi giriniz");
        }
    }
}

