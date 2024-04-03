package Recursion;

public class productOfDigits {
    public static void main(String[] args) {
        int n =505;
        System.out.println(product(n));
    }

    static long product(int n){
//        if (n==0){
//            return 1;
//        }
        if (n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * product(n/10);
    }
}
