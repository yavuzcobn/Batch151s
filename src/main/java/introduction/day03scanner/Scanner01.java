package introduction.day03scanner;

//Java'nın util kutuphanesinden Scanner Class import edildi.
import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //1.Adim: Scanner class'tan bir obje olustur.
        Scanner input = new Scanner(System.in);
        //obje ismini input yaptik cunku bu object kullanicidan alinan datayi benim kodlarimin icine koyacak

        //2.Adim: Kullaniciya ne istediğinize dair mesaj veriniz.
        System.out.println("Lutfen yasinizi giriniz...");

        //3.Adim: Uygun method'u kullanarak kullanicinin verdigi data'yi memory'e yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);




    }

}
