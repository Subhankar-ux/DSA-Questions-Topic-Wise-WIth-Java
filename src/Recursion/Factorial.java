package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n =8;
        System.out.println(fact(n));
    }

    static long fact(int n){
        if (n<=1){
            return 1;
        }

        return n * fact(n-1);
    }
}

