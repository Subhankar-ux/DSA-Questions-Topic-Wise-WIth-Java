package SortingAlgo;

import java.util.Arrays;

public class SetMismatchInArray {
    public static void main(String[] args) {
        int[]nums={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[]findErrorNums(int[]arr){
        //Applying cyclic sort
        int i =0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                return new int[]{arr[index],index+1};//missing number = index+1 if array is from 1 to n,and
                                   //duplicate number = arr[index],the element present in missing index
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
