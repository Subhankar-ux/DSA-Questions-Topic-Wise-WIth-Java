package com.Kunal;
//Floor problem using binary search
//Like greatest lower bound i.e. Greatest number present in the array which is smaller or equal to the target number
//is called Floor of a number
public class Floor_Prob {
    public static void main(String[] args) {
        int[]arr={2,3,5,9,14,16,18};
        int target = 4;
        int ans = floor_Of_Num(arr,target);
        System.out.println("The floor of the given target number , "+target+" is: "+ans);
    }
    static int floor_Of_Num(int[]arr,int target){
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
        return arr[end];
    }

}
