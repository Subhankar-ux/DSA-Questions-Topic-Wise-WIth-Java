package com.Strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(padRet("","12"));
        System.out.println(padCount("","12"));
    }
    static void pad(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';//techniques to convert a string of numbers into an integer--> '2' to 2
        for (int i = (digit-1) * 3 ;i < (digit * 3 ); i++){
            char ch = (char)('a' + i);
            pad(p+ch,up.substring(1));
        }

    }

    static ArrayList<String> padRet(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String>list = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        for (int i = (digit-1) * 3;i < digit*3; i++){
            char ch = (char) ('a' + i);//it will give me like char a,b,c,d ..... etc
           list.addAll( padRet(p+ch,up.substring(1)));

        }

        return list;

    }

    static int padCount(String p,String up){
        if (up.isEmpty()){

            return 1;
        }

        ArrayList<String>list = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        int count = 0;
        for (int i = (digit-1) * 3;i < digit*3; i++){
            char ch = (char) ('a' + i);//it will give me like char a,b,c,d ..... etc
            count = count + padCount(p+ch,up.substring(1));

        }

        return count;

    }
}
