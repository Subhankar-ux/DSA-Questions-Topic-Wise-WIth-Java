package SortingAlgo;

import java.util.ArrayList;
import java.util.List;

public class AllNumDisappearedInArray {
    public static void main(String[] args) {
        int[]arr ={2,3,4,3,2,6,5};

        System.out.println(disappearedNums(arr));
    }
    static List<Integer> disappearedNums(int[]arr){
        List<Integer>nums = new ArrayList<>();
        int i=0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if ( arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }
        }

        for (int index =0;index<arr.length;index++){
            if (arr[index]!=index+1){
                nums.add(index+1);
            }
        }
        return nums;
    }

    static void swap(int[]arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
