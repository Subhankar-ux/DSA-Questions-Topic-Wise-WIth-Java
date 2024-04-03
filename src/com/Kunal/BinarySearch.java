package com.Kunal;
//Here we assume that the given Array is sorted  in ascending order
public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 45;
        int ans = binarySearch(arr,target);
        if (ans == -1){
            System.out.println("The target element is not found!");
        }else {
            System.out.println("The target element is found at the index, "+ ans);
        }
    }
    //Return the index
    //return -1 if the target element is not found
    static int binarySearch(int[]arr,int target){
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
                return mid;
            }

        }
        return -1;
    }
}
