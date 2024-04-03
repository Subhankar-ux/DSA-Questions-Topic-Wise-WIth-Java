package SortingAlgo;

public class MissingPositive {
    public static void main(String[] args) {
        int[]num={3,4,-1,1};
                //{1,2,3,4};
                //{1,2,0};
        System.out.println(missingPositiveFirst(num));
    }
    static int missingPositiveFirst(int[]arr){
        //fist we are applying cyclic sort to sort the array as the given time complexity is O(N)
        int i =0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]>0 && arr[i]<=arr.length && arr[i]!= arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }

        }

        //search for first positive missing number
        for (int index=0;index<arr.length;index++){
            if (arr[index]!=index+1){
                return index+1;
            }
        }
        //if the given array traversed but the first missing number still cannot find then we have to return arr.length+1
        return arr.length+1;
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
