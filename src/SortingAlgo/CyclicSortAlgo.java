package SortingAlgo;

import java.util.Arrays;

public class CyclicSortAlgo {
    public static void main(String[] args) {
    int[]arr ={3,5,4,2,1};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[]arr){
        int i =0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            //Check whether the element at the right index or not i.e. basically at value - 1
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                //if it is at right index then need to swap,move ahead
                i++;
            }
        }
    }

    //swap method for swapping two elements in the array
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
