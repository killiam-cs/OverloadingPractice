import javax.swing.*;

// here is a comment that we will see in Git I hope

public class Overloading {

    public String color;

    public static void main(String[] args) {
        Overloading b = new Overloading("blue");
        Overloading r = new Overloading("red");

        Overloading o = new Overloading();
        o.test(5);
    }

    public Overloading(){
        System.out.println("Default constructor, Overloading with no parameters");
    }

    public Overloading(String color){
        this.color = color;
        System.out.println("constructor");
        System.out.println("character color is " + this.color);
    }

    public void test (){
        System.out.println("empty test");
    }
    public void test (int x){
        System.out.println("number is " + x);
    }
    public void test (double x){
        System.out.println("number is " + x);
    }
    public void test (double x, double potato){
        double meal = x + potato;
        System.out.println(x + " + " + potato + " = " + meal);
    }


}
