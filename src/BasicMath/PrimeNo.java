package BasicMath;

public class PrimeNo {
    public static void main(String[] args) {
        int n = 3200001;
        System.out.println(isPrime1(n));
    }

    //it is a brute force solution,the time complexity here is O(N)
    static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if (n<=0){
            return false;
        }

        for (int i =2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    //now it is the most efficient solution
    static boolean isPrime1(int n){
        if(n==1){
            return false;
        }
        if(n<=0){
            return false;
        }
        for (int i=2;i*i<=n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
