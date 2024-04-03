package com.Strings;

import java.util.ArrayList;

public class AsciiSequence {
    public static void main(String[] args) {
      String st = "abc";
        System.out.println(subSeqAscii("",st));
    }
    static ArrayList<String> subSeqAscii(String p,String up){
        if (up.isEmpty()){
            ArrayList<String >list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>left = subSeqAscii(p+ch,up.substring(1));
        ArrayList<String>right = subSeqAscii(p,up.substring(1));
        ArrayList<String>ascii = subSeqAscii(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(ascii);

        return left;
    }
}
