package SortingAlgo;

import java.util.Arrays;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[]arr ={3,1,5,4,2};
                //{-37,-45,0,89,7};
                //{5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[]arr){
        //run the steps n-1 times
        boolean swapped ;//for checking if the swapping is happening or not
        for (int i =0 ;i<arr.length;i++){
            //for each step max item will come at the last respective index
            swapped = false;
            for (int j=1;j<arr.length-i;j++){
                //swap if the item at index j is smaller than the item at previous index j-1
                if (arr[j]<arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i,it means the array is sorted hence stop the program
            if (!swapped){//!false = true it is when the swapped is false
                break;
            }

        }
    }

}
