package SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
     int[]arr = {6,5,2,1,0};
     quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
  static int count = 0;
    static void quickSort(int[]arr,int low,int high){
        if (low<high){
            int pidx = partition(arr,low,high);
            //it will return the correct index of pivot ,that is main work is doing partition()
            count++;
            quickSort(arr,low,pidx-1);
            count++;
            quickSort(arr,pidx+1,high);

        }

    }
    static int partition(int[]arr,int low,int high){
        int pivot = arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            count++;
            if (arr[j]<pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //after this loop all the elements of less than pivot, will be in the left hand side of the pivot,last less element's index will be i
        //so the correct index for pivot is i+1
        i++;

        count++;
        int temp = arr[i];
        arr[i]=arr[high];//arr[high] = pivot
        arr[high] = temp;
        return i;

    }
}
