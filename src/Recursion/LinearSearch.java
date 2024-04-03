package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = {1,4,8,8,6,8};
        ArrayList<Integer>list1 = new ArrayList<>();
//        System.out.println(LS(arr,8,0));
//        System.out.println(isPresent(arr,18,0));
//        System.out.println(LSFromLast(arr,8,arr.length-1));
//        findAllIndex(arr,8,0);
//        //System.out.println(list);
//        System.out.println(findAllIndex(arr,8,0,list1));
//        System.out.println(list1);
        System.out.println(findAllIndex2(arr,8,0));
    }

    static int LS(int[]arr,int target,int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return LS(arr,target,index+1);
    }

    static boolean isPresent(int[]arr,int target,int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target || isPresent(arr,target,index+1);
    }

    static int LSFromLast(int[]arr,int target,int index){
        if (index==-1){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return LSFromLast(arr,target,index-1);
    }

    static ArrayList<Integer>list = new ArrayList<>();
    static void findAllIndex(int[]arr,int target,int index){
        if (index == arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    //Return type is arraylist<>
    static ArrayList<Integer> findAllIndex(int[]arr,int target,int index,ArrayList<Integer>list){
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }

    //returning an arraylist using recursion without taking any arraylist in the argument
    static ArrayList<Integer> findAllIndex2(int[]arr,int target,int index){
        ArrayList<Integer>list = new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>ansFormBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(ansFormBelowCalls);
        return list;

    }
}
