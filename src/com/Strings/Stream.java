package com.Strings;

public class Stream {
    public static void main(String[] args) {
        String s = "abbccaabb";
        //skip("",s);
        //System.out.println(skip(s));
        String s1 = "bappcapplecdah";
        System.out.println(skipAString(s1));
        System.out.println(skipAppNotApple(s1));
    }

    //SKip a particular character
    static void skip(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p+ch,up.substring(1));
        }
    }

    static String skip(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if (ch=='a'){
            return skip(up.substring(1));
        }
        return ch + skip(up.substring(1));
    }

    //skip a string
    static String skipAString(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipAString(up.substring(5));
        }
        return up.charAt(0)+skipAString(up.substring(1));
    }

    static String skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return  skipAppNotApple(up.substring(3));
        }
        return up.charAt(0)+ skipAppNotApple(up.substring(1));
    }
}
