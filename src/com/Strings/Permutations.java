package com.Strings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String up = "abcd";
        String p ="";
        permutations(p,up);
        ArrayList<String>ans = permutationsList(p,up);
        System.out.println(ans);
        System.out.println("The no of permutations is " + permutationsCount(p,up));
    }
    static void permutations(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            permutations(first + ch + second,up.substring(1));
        }
    }

    static ArrayList<String >permutationsList(String p,String up){
        if (up.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String>ans = new ArrayList<>();
        for (int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            ans.addAll(permutationsList(first+ch+second,up.substring(1)));
        }
        return ans;
    }

    static int permutationsCount(String p,String up){
        if (up.isEmpty()){
            return 1;
        }
        int count =0;
        char ch = up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
           count = count + permutationsCount(first + ch + second,up.substring(1));
        }
        return count;
    }
}
