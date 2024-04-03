package BasicMath;

public class Power {
    public static void main(String[] args) {
        int pow = 5;
        int base = 3;
        System.out.println(power(base,pow));
    }
    static int power(int base,int pow){
        int ans= 1;
        while(pow>0){
            if ((pow & 1) == 1){
                ans = ans * base;

            }
            base*=base;
            pow=pow>>1;
        }
        return ans;
    }
}
