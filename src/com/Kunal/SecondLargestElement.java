package com.Kunal;

public class SecondLargestElement {
    public static void main(String[] args) {
        int []arr ={5,4,3,2,1};
        System.out.println(secondMax(arr));
    }
    static int secondMax(int[]arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i =0 ;i<arr.length;i++){
            if (arr[i]>max){
                secMax = max;
                max = arr[i];
            } else if (arr[i]<max && secMax<arr[i]) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}
