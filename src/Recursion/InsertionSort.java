package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = in.nextInt();
        int[]arr =new int[n];
        System.out.println("Enter the elements of the array");
        for (int i=0;i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Your entered array is  : " + Arrays.toString(arr));
        insertionSort(arr,0,1);
        System.out.println("After sorting array is " + Arrays.toString(arr));
        System.out.println("The total no of comparisons =  "+comp);
    }
    static int comp =0;//comp is to check for the number of comparisons
    static void insertionSort(int[]arr,int i,int j){
        if (i==arr.length-1){
            //comp++;
            return ;
        }
        if (j>0 && arr[j]<arr[j-1]){
            comp++;
            int temp = arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            insertionSort(arr,i,j-1);
        }else {
            //comp++;
            insertionSort(arr,i+1,i+2);
        }
    }
}
