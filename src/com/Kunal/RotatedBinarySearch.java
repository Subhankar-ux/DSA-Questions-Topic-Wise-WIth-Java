package com.Kunal;
//Search in Rotated Sorted Array

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[]arr ={4,5,6,7,0,1,2};
        int pivot = findPivot(arr);
        if(pivot == -1){
            System.out.println("pivot is not found as the array is not rotated");
        }else {
            System.out.println("pivot at index " + pivot);
        }
        int target= 1;
        int ans = search(arr,target);
        System.out.println("The given target element is at : " + ans);
    }
    static int search(int[] arr,int target){
        int pivot = findPivot(arr);

        //if you did not find the pivot , it means the array is not rotated apply simple binary search
        if (pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        //if pivot is found , you have found 2 ascending sorted arrays
        //case - 1
        if (arr[pivot] == target){
            return pivot;
        }
        //case -2
        if (target >= arr[0]){
            //it means the target element lies in the first part of ascending order of rotated array i.e. left side of pivot
            return binarySearch(arr,target,0,pivot-1);
        }
        //it means the target element lies in the second part of ascending order
        // of the rotated array i.e. right side of pivot
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarySearch(int[]arr,int target,int start,int end){

        while (start<=end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                //i.e. arr[mid] = target i.e. we have found the target element
                //so don't need to further more check
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[]arr){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            //find the mid-index
            int mid = start + (end - start)/2;
            //4 possible cases over here

            //Because if at some point,if mid=end, and it will try
            // to check the condition mid>mid+1 then it will exceed the array.length,
            // for this reason we are using logical and operator here
            //case-1
            if (mid < end && arr[mid]>arr[mid+1]){
                //then we found the pivot/peak element of the rotated array
                return mid;
            }
            //case -2
            if (mid > start && arr[mid]<arr[mid-1]){
                //then we found the pivot/peak element of the rotated array
                return mid-1;//the array is sorted, and it has two portions that are in ascending
                // order and have the one position sub-array of two elements where next element is less than the previous element
            }
            //case - 3
            if (arr[mid]<=arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        return -1;
    }
}
