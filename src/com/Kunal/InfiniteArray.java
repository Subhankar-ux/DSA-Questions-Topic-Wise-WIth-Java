package com.Kunal;

public class InfiniteArray {
    public static void main(String[] args) {
       int []arr = {3,5,7,9,10,30,
       100,130,140,160,170};
       int target = 160;
        System.out.println(ans(arr,target));
    }
    static int ans(int []arr,int target){
        //first find the range
        //first start with a box of size 2
        int start=0;
        int end = 1;

        //condition for the target to lie in the range
        //here actually we are finding the range of array in which our target element lies
        while (target>arr[end]){
            int temp = end + 1;
            //double the box size
            //end = prevEnd + size_of_box * 2
            end = end + (end+1-start) * 2;//size of the box = end + 1 - start
            start = temp;

        }
        return binarySearch(arr,target,start,end);

    }
    //here actually doing the binary search for the given target element
    static int binarySearch(int[]arr,int target,int start,int end){
        while (start<=end){
            //creating the mid - index variable
            int mid = start + (end-start)/2;//due to int range we write (start+end)/2 in terms of mid like this

            if(target<arr[mid]){
                end = mid -1;
            }else if(target>arr[mid]){
                start = mid +1;
            }else {
                //answer found
                return mid;
            }
        }
        return -1;//i.e. the target element is not found in the given array
    }
}
