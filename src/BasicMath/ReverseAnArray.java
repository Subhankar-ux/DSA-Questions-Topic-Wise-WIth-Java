package BasicMath;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4};
        reverse(arr);
    }
    static void reverse(int[]arr){
        for (int i= 0;i<(arr.length+1)/2;i++){
            int temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
