package BasicMath;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 63;
        System.out.print("The binary form of given num : ");
        System.out.println(Integer.toBinaryString(n));
        System.out.println("The no of set bits is: ");
        System.out.println(setBits(n));
    }

    static int setBits(int n){
        int count =0;
        //first way/process
//        while (n>0){
//            count++;
//            n= n - (n & (-n));
//        }

        while ( n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
