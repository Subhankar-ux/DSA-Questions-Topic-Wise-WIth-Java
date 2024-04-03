package com.Kunal;

import java.util.Locale;

public class IsPalindromeCheck {
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPalindrome1(str));
    }
    static boolean isPalindrome(String str){
        if (str==null||str.length() == 0){
            return true;
        }
        str = str.toLowerCase();
        for (int i =0 ;i<str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start!=end){
                return false;
            }
        }
         return true;
    }
    static boolean isPalindrome1(String str){
        if(str==null||str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while (start<=end){
            if (str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
