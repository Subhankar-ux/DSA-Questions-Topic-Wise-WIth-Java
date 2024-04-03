package BasicMath;
//counting the no of digits present of any number in any number system
public class NoOfDigits {
    public static void main(String[] args) {
        int n =1000;
        int b =10;
        System.out.println(digit(n,b));
    }

    static int digit(int num,int base){
        int digits = (int)(Math.log(num)/Math.log(base))+1;//no digits of num in base
        return digits;
    }
}
