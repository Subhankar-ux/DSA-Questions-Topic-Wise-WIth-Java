package com.LinkedList;

public class Main {
    public static void main(String[] args) {
         LL list = new LL();
         list.insertFirst(3);
       list.insertFirst(2);
       list.insertFirst(8);
       list.insertFirst(17);

//        list.insertLast(99);
//        list.insert(100,3);
         list.display(list.get(0));
         list.insertRec(88,2);
         list.display(list.get(0));
//        //System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println( list.delete(2));
//        list.display();
//
//        DLL list = new DLL();
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(8);
//        list.insertFirst(17);
//        list.insertLast(99);
//       list.display();
//        list.insert(8,65);
//        list.displayRev();

//        CLL list = new CLL();
////        list.insert(23);
////        list.insert(13);
////        list.insert(19);
////        list.insert(75);
////        list.display();
////        list.delete(19);
////        list.display();
        System.out.println(sqrt(20148714));
        System.out.println((int)Math.sqrt(10));
    }
    static long sqrt(int N){
        long start = 1;
        long end = N;
        //int ans = 0;
        while(start<=end){
            long mid = start  +  (end - start)/2;
            //ans = mid;
            if(mid * mid == N){
                return mid;
            }else if(mid * mid > N){
                end = mid - 1;
            }else if(mid * mid < N){
                start = mid + 1;
            }
        }
        return start;
    }
}
