package SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr ={5,4,3,2,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
    static int count = 0;
    static void mergeSort(int[]arr,int s,int e){
        count++;
        if((e-s)==0){
            return;
        }
        int m = s +(e-s)/2;//dividing the array in two parts;
        //count++;
        mergeSort(arr,s,m);
       // count++;
        mergeSort(arr,m+1,e);
        merge(arr,s,m,e);
    }
    static void merge(int[]arr,int s,int m,int e){

        int[]mix = new int[e-s+1];
        int i=s,j=m+1,k=0;

        while ( i<=m && j<=e){
            count++;
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=m){
            //count++;
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0,t=s;l< mix.length;l++,t++){
           // count++;
            arr[t]=mix[l];//modifying the original array from s to e using mix[]
        }
    }
}
