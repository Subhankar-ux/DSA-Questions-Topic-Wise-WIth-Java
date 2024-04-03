package com.Kunal;

public class RotationCount {
    public static void main(String[] args) {
        int[]arr ={4,5,6,7,0,1,2};
        System.out.println("the No of Rotations of the given Array "+countRotation(arr));
    }

    //method for find the rotations count of the given array
    static int countRotation(int[]arr){
        int pivot = findPivot(arr);
        return (pivot + 1);//because the no of rotation = pivot index + 1;
    }
    //Method for find Pivot/peak in non duplicates array
    static int findPivot(int[]arr){
        int start = 0;
        int end = arr.length -1;
        while (start<=end){
            int mid = start + (end - start)/2;
            //4 cases over here
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;//then it is the pivot
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;//it is the pivot
            }
            if (arr[start]>arr[mid]) {
                    end = mid -1;
            }
            if (arr[start]<arr[mid]){
                start = mid +1;//because we are looking for the pivot/the greatest element in the array
                //if mid was pivot then it will be caught above the case checks
            }
        }
        return -1;//that means the given array is not rotated for this we are unable to find pivot
    }

}
