package com.Kunal;

import java.util.Arrays;

public class PracticeGFG {
    public static void main(String[] args) {
        int []arr = {4,7,7,7,7,8,8,9};
        int x = 7;
        System.out.println(Arrays.toString(ans(arr,arr.length,x)));
    }
        static int[] ans(int []arr, int n, int x)
        {
            // code here
            int []ans = {-1,-1};
            int start = Search(arr,n,x,true);
            int end = Search(arr,n,x,false);

            ans[0]=start;
            ans[1]=end;
            return ans;

        }
        static int Search(int[]arr,int n,int x,boolean isStartIndex){
            int start = 0;
            int end = n-1;
            int ans = -1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(x<arr[mid]){
                    end = mid - 1;
                }
                else if(x>arr[mid]){
                    start = mid +1;
                }else{
                    //arr[mid] may be the possible solution
                    ans = mid;
                    if(isStartIndex){
                        end = mid -1;
                    }else{
                        start = mid +1;
                    }

                }
            }
            return ans;
        }
}


