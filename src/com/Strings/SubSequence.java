package com.Strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
       String s = "abc";
       subSequence("",s);
        System.out.println(subseqRet("",s));
    }

    static void subSequence(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subSequence(p+up.charAt(0),up.substring(1));
        subSequence(p,up.substring(1));
    }

    static ArrayList<String> subseqRet(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>left = subseqRet(p+ch,up.substring(1));
        ArrayList<String>right = subseqRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }

}
