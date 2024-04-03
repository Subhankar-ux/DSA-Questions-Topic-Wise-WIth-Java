package com.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LLQues {
    public Node arrToLL(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }
    public void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public Node mergeKLists(List<Node>list){
        List<Integer>arr = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Node temp = list.get(i);
            while (temp != null){
                arr.add(temp.value);
                temp = temp.next;
            }
        }
        Collections.sort(arr);
        int[]result = new int[arr.size()];
       for (int i =0;i<arr.size();i++){
           result[i]=arr.get(i);
       }
        return arrToLL(result);
    }
    public Node merge(Node head1,Node head2){
        Node t1 = head1;
        Node t2 = head2;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        while (t1 != null && t2 != null){
            if (t1.value<t2.value){
                curr.next = t1;
                curr = curr.next;
                t1 = t1.next;
            } else {
                curr.next = t2;
                curr =curr.next;
                t2 = t2.next;
            }
        }
        //
        if (t1 != null){
            curr.next = t1;
        }else if (t2 != null){
            curr.next = t2;
        }

        return dummyNode.next;
    }
    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LLQues ans = new LLQues();
        int []arr ={1,2,3,4,5};
        int[]arr1 = {0,3,5,8,9};
        int[]arr2 ={7,8,10,3,2,1};
        int[]arr3 ={20,2,3,4,25};
        Node node1 = ans.arrToLL(arr);
        ans.display(node1);
        Node node2 = ans.arrToLL(arr1);
        ans.display(node2);
       ans.display( ans.merge(node1,node2));
//        Node node3 = ans.arrToLL(arr2);
//        Node node4 = ans.arrToLL(arr3);
//        List<Node>list = new ArrayList<>();
//        list.add(node1);
//        list.add(node2);
//        list.add(node3);
//        list.add(node4);
//        Node head = ans.mergeKLists(list);
//        ans.display(node1);
//        ans.display(node2);
//        ans.display(node3);
//        ans.display(node4);
//
//        ans.display(head);
    }
}
