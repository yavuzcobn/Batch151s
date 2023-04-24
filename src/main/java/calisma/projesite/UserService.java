package calisma.projesite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernemes = new ArrayList<>();

    List<String> emails = new ArrayList<>();

    List<String> passwords = new ArrayList<>();


    public void register(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen ad ve soyad giriniz...");
        String name = sc.nextLine();

        String username;
        boolean isExistBefore;

        do {
            System.out.println("Lutfen kullanici adini olusturunuz...");

            username = sc.nextLine();

            isExistBefore= this.usernemes.contains(username);

            if (isExistBefore){
                System.out.println("Daha bu kullanici adi kullanilmistir, lutfen tekrar deneyiniz...");
            }

        }while (isExistBefore);

        String email;
        boolean isExistEmail;

        do{
            isExistEmail = false;
            System.out.println("Lutfen email adresi giriniz...");
            email = sc.nextLine();

            if (!isValidEmail(email)){
                System.out.println("Tekrar Deneyiniz...");
                isExistEmail = true;
            }else {
                isExistEmail=this.emails.contains(email);
            }

        }while (isExistEmail);

             /*
        Password validation     :   bosluk icermemeli
                        :   en az 6 karakter olmali
                        :   en az 1 tane kucuk harf icermeli
                        :   en az 1 tane buyuk harf icermeli
                        :   en az 1 tane rakam icermeli
                        :   en az 1 tane sembol icermeli
         */


    }

        /*
        bosluk icermemeli,
        @ icermeli
        gmail.com hotmail.com veya yahoo.com ile bitmeli
        mailin kullanici adi kisminda (@ den once)  sadece buyuk-kucuk harf, rakam ya da -._ sembolleri olabilir.
         */

    public boolean isValidEmail (String email){

        boolean isExistEmail;

        if (email.contains(" ")){
            System.out.println("Lutfen bosluk kullanamayiniz...");
            isExistEmail = false;
        }if (!email.contains("@")){
            System.out.println("Lutfen '@' kullaniniz...");
            isExistEmail = false;
        }else if (!(email.endsWith("@gmail.com")|| email.endsWith("@hotmail.com")|| email.endsWith("@yahoo.com"))){
            System.out.println("Mail adresiniz : @gmail.com, @hotmail.com ya da @yahoo.com ile bitmelidir...");
            isExistEmail = false;
        } else if (email.startsWith("@")) {
            System.out.println("Email @ isaretinden once : buyuk-kucuk harf, rakam ya da -._ sembollerini kullanmalisiniz");
            isExistEmail = false;

        }else {

            String ilkKisim = email.split("@")[0];

            boolean kontrol = ilkKisim.replaceAll("[A-Za-z0-9-._]", "").length()==0;

            if (!kontrol){
                System.out.println("Email @ isaretinden once : buyuk-kucuk harf, rakam ya da -._ sembollerini kullanabilirsiniz");
            }

            isExistEmail= kontrol;

        }
        return isExistEmail;




    }

}
