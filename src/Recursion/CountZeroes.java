package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(400500));
    }

    static int count(int n){
        return helper(n,0);
    }

    //Special Pattern,how to pass a value to above calls
    static int helper(int n,int count){
        if (n==0){
            return count;
        }
        int rem = n % 10;
        if (rem==0){
           return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
