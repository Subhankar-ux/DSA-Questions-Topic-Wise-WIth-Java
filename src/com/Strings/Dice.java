package com.Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.printf("All possible combinataions to make %d\n",3);
        dice("",3);
        System.out.println(padRet("",3));
    }

    static void dice(String p,int target){
        if (target == 0){
            System.out.println(p);
            return;
        }

        for (int i=1;i<=6 && i <= target;i++){
            dice(p+i,target- i);
        }
    }

    static ArrayList<String> padRet(String p, int target){
        if (target == 0){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String>list = new ArrayList<>();

        for (int i = 1;i<=6 && i<=target ;i++){
            list.addAll( padRet(p+i,target-i));
        }

        return list;

    }
}
