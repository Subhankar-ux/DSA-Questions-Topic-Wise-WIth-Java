package com.Kunal;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[]arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int []arr = {99,80,75,22,11,10,5,2,-3};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        if (ans == -1){
            System.out.println("The target element is not found!");
        }else {
            System.out.println("The target element is found at the index, "+ ans);
        }
    }
    static int orderAgnosticBS(int[]arr,int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start]<arr[end];
        /* this can be done by writing  just only condition in isAsc variable
        if (arr[start]<arr[end]){
            isAsc = true;
        }else {
            isAsc=false;
        }
         */

        while (start<=end){
            //find the middle element of the array
            //     int mid = (start + end)/2;//might be possible that (start + end ) exceeds the range of int in Java
            //So we write mid ,like in this way
            int mid = start + (end - start)/2;
            //common condition for both ascending and descending order
            if (arr[mid] == target){
                return mid;
            }
            //for ascending order sorted array
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
                //for descending order sorted array
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
