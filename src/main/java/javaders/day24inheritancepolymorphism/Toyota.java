package javaders.day24inheritancepolymorphism;

public class Toyota extends Car {

    public void hybrid(){
        System.out.println("Toyata uses hybrid engine...");

    }
    public Toyota(){
        this("Prius");

        System.out.println("Toyata constructor 1");


    }

    public Toyota(String s){
        super(7);

        System.out.println("Toyata constructor 2");
    }
}
