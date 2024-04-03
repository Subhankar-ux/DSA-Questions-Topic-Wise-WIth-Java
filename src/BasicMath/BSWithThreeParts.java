package BasicMath;

public class BSWithThreeParts {
    public static void main(String[] args) {
        int[]arr = { 2,3,4,5,6,7,8};
        int target = 8;
        System.out.printf("The index of %d is : %d \n " , target,bs(arr,target));
        //System.out.println(bs(arr,target));
    }
    static int bs(int[]arr,int target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid1 = s + (e-s)/3;
            int mid2 = e - (e-s)/3;
            if (arr[mid1]==target){
                return mid1;
            }else if(arr[mid2]==target){
                return mid2;
            }else if(target<arr[mid1]){
                e = mid1 -1;
            }else if (target>arr[mid2]){
                s=mid2 +1;
            }else{
                s = mid1+1;
                e=mid2 -1;
            }
        }
        return -1;
    }
}
