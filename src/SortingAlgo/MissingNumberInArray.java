package SortingAlgo;

public class MissingNumberInArray{
    public static void main(String[] args) {
     int[]arr ={1,3,0,4};
     int missAns = missingNumber(arr);
        System.out.println(missAns);
    }
    static int missingNumber(int[]arr){
        int i = 0;
        while (i<arr.length){
            int correctIndex = arr[i];//here array start from 0 to n,so the correct index =value
            if (arr[i]<arr.length && arr[i]!=arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else {
                i++;
            }

        }
        //after cyclic sorting we are running this loop
        for (int index=0;index<arr.length;index++){
            //case1:if the n is present in the array like 0 to n
            if (arr[index]!=index){
                return index;
            }
        }
        //case2:if n is not present in the array then n is the ans
        return arr.length;
    }

    static void swap(int[]arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
