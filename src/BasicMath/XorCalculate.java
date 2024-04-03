package BasicMath;
//calculating the xor from 0 to a (where 'a' is a given number)
public class XorCalculate {
    public static void main(String[] args) {
      int b = 10;
        System.out.printf("The xor from 0 to %d is: ",b);
        System.out.println(xor(b));
        int a = 3;
        System.out.printf("Xor for range %d to %d is:  ",a,b);
        int ans = xor(a-1)^xor(b);
        System.out.println(ans);
    }
    static int xor(int a){
        if(a%4==0){
            return a;
        }
        else if(a%4==1){
            return 1;
        } else if (a % 4 == 2) {
            return a+1;
        }
            return 0;

    }
}
