package Recursion;

public class SmallLargeInArray {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ans1 = large(arr,0,arr.length-1,max);
        System.out.println("The largest in the array  " + ans1);
        System.out.println("The number of comaprisons for the largest " + com);
        int ans2 = small(arr,0,arr.length-1,min);
        System.out.println("The smallest in the array " + ans2);
    }
    static int com = 0;
    static int large(int[]arr,int s,int e,int max){
        if (s>e){
            //com++;
            return max;
        }
        if (arr[s]>max){
            com++;
            return large(arr,s+1,e,arr[s]);
        }
        com++;
        return large(arr,s+1,e,max);
    }

    static int small(int[]arr,int s,int e,int min){
        if (s>e){
            return min;
        }
        if (arr[s]<min){
            return small(arr,s+1,e,arr[s]);
        }
        return small(arr,s+1,e,min);
    }
}
