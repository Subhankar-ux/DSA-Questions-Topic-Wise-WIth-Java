package SortingAlgo;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[]arr = {9,8,7,6,5,4};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countSort(int[]arr){
        if (arr == null || arr.length<1){
            return;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        int [] frequency = new int[max+1];
        for (int j : arr) {
            frequency[j]++;
        }
        for (int i = 0,k=0; i < frequency.length ; i++) {
          while (frequency[i]>0){
              arr[k]=i;
              k++;
              frequency[i]--;
          }
        }
    }
}
