package SortingAlgo;

import java.util.ArrayList;
import java.util.List;

public class AllDuplicatesInArray {
    public static void main(String[] args) {
        int[]num = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(num));
    }
    static List<Integer> findAllDuplicates(int[]arr){
        List<Integer>Ans = new ArrayList<>();

        int i =0;
        //Using cyclic sort first to sort the array first
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }

        //checking if the elements in the correct index or not ,if for some index --> element/value!=index+1,then it will be a duplicate
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                Ans.add(arr[index]);
            }
        }
        return Ans;
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
