package calisma.projesite;

public class deneme {

    public static boolean isValidEmail(String email) {

        boolean isExistEmail;

        if (email.contains(" ")) {
            System.out.println("Lutfen bosluk kullanamayiniz...");
            isExistEmail = false;
        }
        if (!email.contains("@")) {
            System.out.println("Lutfen '@' kullaniniz...");
            isExistEmail = false;
        } else if (!(email.endsWith("@gmail.com") || email.endsWith("@hotmail.com") || email.endsWith("@yahoo.com"))) {
            System.out.println("Mail adresiniz : @gmail.com, @hotmail.com ya da @yahoo.com ile bitmelidir...");
            isExistEmail = false;
        } else if (email.startsWith("@")) {
            System.out.println("Email @ isaretinden once : buyuk-kucuk harf, rakam ya da -._ sembollerinu kullanmalisiniz");
            isExistEmail = false;

        } else {

            String ilkKisim = email.split("@")[0];

            boolean kontrol = ilkKisim.replaceAll("[A-Za-z0-9-._]", "").length() == 0;

            if (!kontrol) {
                System.out.println("Email @ isaretinden once : buyuk-kucuk harf, rakam ya da -._ sembollerinu kullanabilirsiniz");
            }

            isExistEmail = kontrol;

        }
        return isExistEmail;

    }

    public static void main(String[] args) {
        String mail = "yavu?z@gmail.com";

        System.out.println(isValidEmail(mail));


    }
}
