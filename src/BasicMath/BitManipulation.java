package BasicMath;

public class BitManipulation {
    public static void main(String[] args) {
        int n = 8;
        int pos = 2;
        System.out.printf("The bit at position %d is %d\n",pos,getBit(n,pos));
        System.out.printf("After setting the bit at position %d,the updated num is = %d \n",pos,setBit(n,pos));
        System.out.printf("After resetting the bit at position %d,the updated num is = %d \n",pos,reset(n,pos));
    }
    //operations in Bit Manipulation
    static int getBit(int num,int pos){
        int bitMask = 1<<pos;
        int newNum = num & bitMask;//it will give the bit/number at the position pos
        if (newNum != 0){
            return 1;
        }
        return 0;
    }
    static int setBit(int num,int pos){  //set means ,changing a particular position by 1, if it has already 1 then fine
        //otherwise it will change it into 1
        int bitMask = 1<<pos;
        int newNum = num | bitMask;
        return newNum;
    }
    //reset is the opposite of the set ,i.e. if it is 1 ,it will make it 0,or if 0 then it will remain
    static int reset(int num,int pos){
        int bitMask = 1<<pos;
        int newBitMask = ~(bitMask);
        int newNUM = num & newBitMask;
        return newNUM;
    }
}
