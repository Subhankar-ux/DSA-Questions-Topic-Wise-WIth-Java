package Recursion;
//Rotated Binary Search using recursion
public class RotatedBinarySearch {
    public static void main(String[] args) {
      int[]arr = {5,6,7,8,9,1,2,3 };
        System.out.println(RBS(arr,4,0,arr.length-1));
    }
    //algo
    static int RBS(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if (arr[m]==target){
            return m;//found the ans
        }
        //that means array is sorted from s to m
        if (arr[s]<=arr[m]){
            if (target>=arr[s] && target<=arr[m]){
               return RBS(arr,target,s,m-1);
            }else {
                return RBS(arr,target,m+1,e);
            }
        }
        //that means target lies outside the sorted part
        if (target>=arr[m]&&target<=arr[e]){
            return RBS(arr,target,m+1,e);
        }

        return RBS(arr,target,s,m-1);
    }
}
