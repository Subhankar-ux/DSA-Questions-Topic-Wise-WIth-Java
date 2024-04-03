package SortingAlgo;

public class DuplicateNumberInArray {
    public static void main(String[] args) {
        int[]arr ={1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[]arr){
        int i =0;
        while (i<arr.length){
            int correctIndex = arr[i]-1;
            if (arr[i]!=i+1){
                if (arr[i]!=arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }else {
                    return arr[i];
                }
            }else{
                i++;
            }
        }
        //if there is no duplicate in the array return -1
        return -1;
    }

    static void swap(int[]arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
