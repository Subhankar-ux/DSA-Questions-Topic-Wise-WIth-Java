package Recursion;

public class IsPalindrome {
    public static void main(String[] args) {
//        int n = 101;
//        System.out.println(isPalindrome(n));
        int[]arr ={1,2,1,1,1};
        System.out.println(isPalindrome(arr));
    }
    static int rev2(int n){

        int digits = (int)(Math.log10(n))+1;

        return helper(n,digits);

    }
    static int helper(int n,int digits){
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
    static boolean isPalindrome(int n){
        return n==rev2(n);
    }

    //recursive palindrome function for checking an array isPalindrome or not
    static boolean isPalindrome(int[] n){
        int s=0;
        int e=n.length-1;
        return helper(n,s,e);
    }
    static boolean helper(int[]n,int s,int e){
        if (s>e){
            return true;
        }
        if (n[s]!=n[e]){
            return false;
        }
        return helper(n,++s,--e);
    }

}
