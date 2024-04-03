package SortingAlgo;

import java.util.Arrays;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[]arr ={4,5,1,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[]arr){
        for (int i= 0;i<arr.length;i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);

        }

    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[]arr,int start,int end){
        int max = start;
        for (int i =start;i<=end;i++){
            if (arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
