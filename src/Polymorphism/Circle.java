package Polymorphism;

public class Circle extends Shapes{
    @Override//if you want to check whether a method is overridden or not
    //you can check using override annotation .it is used to check purposes
    void area(){
        System.out.println("Circle area is pie * r * r");
    }
}
