package com.Kunal;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner in1 = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the elements of the arraylist");
        //taking the inputs from user using a for loop
        for (int i = 0;i<5;i++){
            arr.add(in.nextInt());
        }
        //Printing the arraylist using for loop
        for (int i = 0;i<5;i++){
            System.out.print(arr.get(i)+" ");
        }
        //Arraylist printing using just arraylist name arr in sout
        System.out.println();
        System.out.println(arr);

        //2D Arraylist
        ArrayList<ArrayList<Integer>>array = new ArrayList<>();
        //Initialization
        for (int i = 0 ;i<3;i++){
            array.add(new ArrayList<>());
        }
        //add elements in 2d arraylist
        for (int i =0 ;i<3;i++){
            for (int j=0;j<3;j++){
                array.get(i).add(in.nextInt());
            }
        }
        //printing the 2d list
        System.out.println(array);

    }

}
