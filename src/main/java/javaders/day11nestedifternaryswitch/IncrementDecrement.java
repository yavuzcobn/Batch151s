package javaders.day11nestedifternaryswitch;

public class IncrementDecrement {

    /*
    1)"Increment" aratırmak demektir, "Decrement" azaltmak demektir.
    2)"Increment" toplama ve carpma ile, "Decrement" cikarma ve bolme ile yapilabilir.
    3)"Increment" ve Decrement" 3 yolla yapilabilir.

        i) int i =12, ==> i = i + 5;
        ii) int i =12, ==> i += 5;
        iii) int i =12, ==> i++;Note: 3. yol sadece 1 artırmak icin kullanilabilir.

        i) int i =12, ==> i = i - 5;
        ii) int i =12, ==> i -= 5;
        iii) int i =12, ==> i--;Note: 3. yol sadece 1 azaltmak icin kullanilabilir.

     */

    public static void main(String[] args) {

        int age = 12;
        System.out.println(age);//12

        age = age++;// post increment

        System.out.println(age);//12

        age = ++age;// pre increment

        System.out.println(age);//13

        int salary = 40;

        salary= salary--;//Post Decrement

        System.out.println(salary);//40

        salary= --salary;//Pre Decrement

        System.out.println(salary);//39









    }
}
