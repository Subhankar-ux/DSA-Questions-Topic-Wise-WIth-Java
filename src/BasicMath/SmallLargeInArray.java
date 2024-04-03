package BasicMath;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLargeInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the elements of the array.");
        for (int i =0 ;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Your given array is : "+ Arrays.toString(arr));
        maxMin(arr);
    }
    static void maxMin(int[]arr){
        int count =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            //count++;
            if(arr[i]>max){
                count++;
                max = arr[i];

            }
            else if (arr[i]<min){
                count++;
                min = arr[i];

            }
        }
        System.out.println("The maximum in the array is : " + max);
        System.out.println("The minimum in the array is : " + min);
        System.out.println("The total number of comparisons is : " + count);
    }
}
