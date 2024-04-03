package Recursion;

public class BSWithThreeParts {
    public static void main(String[] args) {
        int[]arr = {4,5,6,8,9,10,11,12};
        int target = 12;
        System.out.println(bs(arr,target,0,arr.length-1));
    }
    static int bs(int[]arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
       int mid1 = s + (e-s)/3;//dividing in 3 parts here
        int mid2 = e- (e-s)/3;
        if (target==arr[mid1]){
            return mid1;
        } else if (target==arr[mid2]) {
            return mid2;
        } else if (target<arr[mid1]) {
            return bs(arr,target,s,mid1-1);
        } else if (target>arr[mid2]) {
            return bs(arr,target,mid2+1,e);
        }
        return bs(arr,target,mid1+1,mid2-1);

    }
}
