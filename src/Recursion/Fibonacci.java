package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n_th_fibo = fibo(3);
        System.out.println(n_th_fibo);
    }
    //printing the n-th fibonacci number
    static int fibo(int n){
        //Base/terminating condition for a fibonacci sequence
        if (n<2)
        {
         return n;
        }
        //recurrence relation for a fibonacci number
        return fibo(n-1)+fibo(n-2);
    }
}
