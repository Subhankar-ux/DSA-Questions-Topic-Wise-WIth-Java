package BasicMath;

public class PowerOfTwoCheck {
    public static void main(String[] args) {
        int n=0;
        System.out.println(isPowerOfTwo(n));
    }

   static boolean isPowerOfTwo(int n){
        boolean ans =(n & (n-1)) == 0;
        if(n==0){
            return false;//it's an exception
        }
        return ans;
    }
}
