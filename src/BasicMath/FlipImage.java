package BasicMath;
import java.util.Arrays;
public class FlipImage {
    public static void main(String[] args) {
        int[][]arr ={{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        //System.out.println();
        int [][]flip = flipImage(arr);
        for (int[] ints : flip) {
            System.out.println(Arrays.toString(ints));
        }
    }

    static int[][] flipImage(int[][]arr){
        //the job is first, reverse every row(we know that every row itself an array ) then make the complement / invert
        //of each element in the row: we can do it simultaneously  also
        for(int []ints:arr){
            //reversing each row; row =ints here
            for (int i = 0;i<ints.length/2;i++){
                //swap
                int temp = (ints[i]);//by xor with 1, the num present in the particular index will be changed to its complement
                ints[i]=(ints[ints.length-1-i]);
                ints[ints.length-1-i]=temp;
            }
        }

        for(int[]r:arr){
            for(int j = 0 ;j<r.length;j++){
                r[j]=r[j]^1;
            }
        }

        return arr;
    }
}
