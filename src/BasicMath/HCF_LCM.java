package BasicMath;

public class HCF_LCM {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    //using Euclid's Algorithm
    static int gcd(int a,int b){
        //base/terminating condition
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }

    static int lcm(int a,int b){
        int d = gcd(a,b);
        int f=a/d,g=b/d;
        return d*f*g;//f,g are the distinct factors of a,b respectively remaining after taking gcd d
    }
}
