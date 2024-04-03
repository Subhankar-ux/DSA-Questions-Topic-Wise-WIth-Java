package com.Kunal;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
//        rightRotate(arr,2);
//        System.out.println(Arrays.toString(arr));
        //leftRotate(arr,2);
        leftRotate2(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static void rightRotate(int[]arr,int d){
        int k = d % arr.length;//if d greater than arr.length ,then we need to rotate exact
        //d times ,as after arr.length rotation ,the array will be same as first/initial
        for (int j=1;j<=d;j++){
            int rightMost = arr[arr.length-1];
            for (int i=arr.length-2;i>=0;i--){
                arr[i+1]=arr[i];
                if (i==0){
                    arr[i]=rightMost;
                }
            }
        }
    }
    public static void leftRotate(int[]arr,int d){
        int k = d % arr.length;
        for (int j = 1;j<=k;j++){
            int leftMost = arr[0];
            for (int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
                if (i == arr.length-1){
                    arr[i]=leftMost;
                }
            }
        }
    }

    //Time complexity in both the methods is O(N^2)in worst case.But it can be optimizely done in O(N).
    //Here we have done it in O(N) below.

    public static void leftRotate2(int[]arr,int d){
        int k = d % arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-1-k);
        reverse(arr,arr.length-k,arr.length-1);

    }
    public static void reverse(int[]arr,int s,int e){
        while (s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[]arr,int s,int e){
        int temp = arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}

