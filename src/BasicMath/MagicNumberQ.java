package BasicMath;

public class MagicNumberQ {
    public static void main(String[] args) {
     int n = 4;
     System.out.println(nthMagicNum(n));
    }
    static int nthMagicNum(int n){
        int ans = 0;
        int base =5;
       while(n>0){
           int last = n & 1;
           n=n >> 1;
           ans =ans + last * base;
           base = base * 5;
       }
       return ans;
    }
}
