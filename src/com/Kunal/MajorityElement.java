package com.Kunal;

public class MajorityElement {
    public static void main(String[] args) {
        int[]arr ={2,2,1,1,1,2,2};
        System.out.println(majorElement(arr));
    }
    public static int majorElement(int[]arr){
        int count =0;
        int candidate = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0){
                candidate = arr[i];
                count++;
            }
           else if (candidate == arr[i]){
               count++;
            }
           else {
               count--;
            }
        }
        return candidate;
    }
}
