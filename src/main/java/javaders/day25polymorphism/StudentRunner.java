package javaders.day25polymorphism;

public class StudentRunner {

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println(s1.getStdId());//AC2023102T

        System.out.println(s1.getGpa());//3.87

        System.out.println(s1.isSuccessfull());//false

        s1.setGpa(3.99);
        System.out.println(s1.getGpa());//3.99

    }

}
