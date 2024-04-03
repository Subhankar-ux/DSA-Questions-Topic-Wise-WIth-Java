package com.Kunal;
//Ceiling problem using Binary Search
//Ceiling of a number = the smallest number in the array greater than or equal to the given number
public class Ceiling_Prob {
    public static void main(String[] args) {
        int[]arr={2,3,5,9,14,16,18};
        int target = 12;
        int ans = ceiling_Of_Num(arr,target);
        System.out.println("The ceiling of the given target, " +target+" is: "+ ans);// (i.e. the smallest number in the array ,greater than or equal to the target is
    }
    static int ceiling_Of_Num(int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            //find the middle element of the array
            //     int mid = (start + end)/2;//might be possible that (start + end ) exceeds the range of int in Java
            //So we write mid ,like in this way
            int mid = start + (end - start)/2;
            if (target<arr[mid]){
                end = mid - 1;
            }else if(target>arr[mid]){
                start = mid + 1;
            }else if(target == arr[mid]){
                //target/Ans is found
                return arr[mid];
            }

        }
        return arr[start];
    }
}
