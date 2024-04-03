package com.Kunal;

import java.util.Arrays;

public class MaxValueOfArray {
    public static void main(String[] args) {
        int[]arr ={1,3,23,9,18};
        int ans1 = max(arr);
        System.out.println(ans1);
        int ans2 =max(arr,3,4);
        System.out.println(ans2);
         reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int max(int[]arr){
        int max =0;
        for (int i =0;i<arr.length;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int max(int[]arr,int start,int end){
        int max = Integer.MIN_VALUE;
        if (end<start){
            return -1;
        }
        if (arr.length == 0){
            return -1;
        }
        for (int i= start;i<=end;i++){
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //One technique to reverse an array
//    static void reverseArray(int[]arr){
//        int temp =0;
//        for (int i =0;i<arr.length/2;i++){
//           temp = arr[i];
//           arr[i] = arr[arr.length-1-i];
//           arr[arr.length-1-i]= temp;
//        }
//    }

    //Another technique to reverse an array it is also called two pointers method
    static void reverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        int temp  =0;
        while (start<end){
             temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start ++;
             end--;
        }
    }
}
