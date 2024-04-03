package com.Kunal;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayBasic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;

        int [][]arr = {    //Creating a 2d array like this way
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        float pos =0f;
       // or create the 2d array like this
        int[][]array = new int [3][3];
        //Traversing the 2d array
       for (int row=0;row<arr.length;row++){  //arr.length will give the no of rows in the 2D array
           for (int col = 0;col<arr[row].length;col++){
               System.out.print(arr[row][col]+" ");
           }
           System.out.println();
       }
        for (int row=0;row<arr.length;row++){  //arr.length will give the no of rows in the 2D array

                System.out.println(Arrays.toString(arr[row]));
            //System.out.println();
        }

        //Taking the inputs in 2d array
        System.out.println("Enter inputs in the 2d array");
        for (int row=0;row< array.length;row++){
            //Traversing the row by updating each col
            for (int col = 0;col<array[row].length;col++){
                array[row][col] = in.nextInt();
            }
        }
        //After taking the inputs ,Printing the elements in the 2d Array
        System.out.println("Printing the elements in the 2d array");
        for (int row=0;row< array.length;row++){
            //Traversing the row by updating each col
            for (int col = 0;col<array[row].length;col++){
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
        //Printing can be done using a for each or an enhanced for loop
        for (int[]a:array){
            System.out.println(Arrays.toString(a));
        }
    }
}

