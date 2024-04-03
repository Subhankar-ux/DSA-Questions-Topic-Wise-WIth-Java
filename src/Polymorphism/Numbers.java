package Polymorphism;
//Method overloading: Implementation of Compile time polymorphism or static polymorphism
public class Numbers {
    double sum(double a,int b){
        return a + b;
    }
    int sum(int a,int b,int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers ob = new Numbers();
        ob.sum(1,2);
        ob.sum(1,3,7);
    }
}
