package Recursion;

//count the no of steps to make a number to zero (#leetcode question)
public class CountSteps {
    public static void main(String[] args) {
        int n=15;
        System.out.println(count(n));
    }

    static int count(int n){
        return helper(n,0);
    }

    static int helper(int n,int steps){
        if (n==0){
            return steps;
        }

        if (n%2==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
