package Recursion;

public class BSWithFourParts {
    public static void main(String[] args) {
        int [] arr = {4,12,25,36,40};
        System.out.println(bs(arr,12,0,arr.length-1));
    }

    static int bs(int[]arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int mid1 = s + (e-s)/4;
        int mid2  = (s+e)/2;
        int mid3 = e - (e-s)/4;
        if (target == arr[mid1]){
            return mid1;
        } else if (target == arr[mid2]) {
            return mid2;
        }else if(target==arr[mid3]){
            return mid3;
        } else if (target < arr[mid1]) {
            return bs(arr,target,s,mid1-1);
        } else if (target > arr[mid3]) {
            return bs(arr,target,mid3+1,e);
        } else if (target > arr[mid1] && target < arr[mid2]) {
            return bs(arr,target,mid1+1,mid2-1);
        }
        return bs(arr,target,mid2+1,mid3-1);
    }
}
