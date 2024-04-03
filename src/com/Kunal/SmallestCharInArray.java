package com.Kunal;

public class SmallestCharInArray {
    public static void main(String[] args) {
        char []arr ={'c','d','e','f','j'};
        char target = 'e';
        char ans = nextGreatestLetter(arr,target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[]letters,char target){
        int start = 0;
        int end = letters.length-1;

        while (start<=end){
            //find the middle element
            int mid = start + (end-start)/2;
            if (target<letters[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }

        }
        if (start == letters.length) {
            return letters[0];
        }
        return letters[start];
    }

}
