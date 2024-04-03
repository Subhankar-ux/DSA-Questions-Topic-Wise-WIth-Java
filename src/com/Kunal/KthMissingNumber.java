package com.Kunal;

public class KthMissingNumber {
    public static void main(String[] args) {
        int[]arr = {5,7,11};
        System.out.println(kthMissingBs(arr,5));
    }
    static int kthMissing(int[]arr,int k){
        for (int i=0;i<=arr.length;i++){
            if (arr[i]<=k){
                k++;
            }else {
                return k;
            }
        }
        return k;//here Time complexity is O(N)
    }
    static int kthMissingBs(int[]arr,int k){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if ((arr[mid]-(mid+1))<k){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return end+1+k;
    }
}
