package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[]arr = {8,3,2,7,6,10,9,5,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
   public static void quickSort(int[]arr,int s,int e){
        if (s<e){
            int pidx = partition(arr,s,e);//after this partition the initial pivot will be at correct index
            // and we need sort the left part and the right part of the pivot
            quickSort(arr,s,pidx-1);
            quickSort(arr,pidx+1,e);
        }
   }
   static int partition(int[]arr,int s,int e){
        int pivot = arr[e];
        int i = s -1;
        for (int j =s;j<e;j++){   //here j is checking the smaller elements those are lesser than pivot.So j will go, start to end -1
                                  //as the end index is the pivot
            if (arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //after this loop complete all the smaller elements of pivot will on the left hand side of the pivot.
       //so,the pivot position should be just after the last smaller element,at i+1
       i++;
        int temp = arr[i];
        arr[i]=pivot;
        arr[e]=temp;
        return i;
   }
}
