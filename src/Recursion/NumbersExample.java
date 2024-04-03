package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);//print calling print itself ,one type of recursion
    }
}
