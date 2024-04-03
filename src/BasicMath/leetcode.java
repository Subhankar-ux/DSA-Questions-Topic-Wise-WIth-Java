package BasicMath;

public class leetcode {
    public static void main(String[] args) {
        int n = 000000000000000000000010000000000;
    }
    public static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            int lastd = n & 1;
            if (lastd == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

}

