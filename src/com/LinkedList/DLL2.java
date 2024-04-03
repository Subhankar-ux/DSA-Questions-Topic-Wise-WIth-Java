package com.LinkedList;

public class DLL2 {
    class Node{
        int val;
        Node prev;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }
        Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

    }
    public Node arrToDLL(int[]arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }
    public void print(Node head){
        Node temp = head;
        System.out.print("null");
        while (temp!=null){
            System.out.print(" <- " + temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public Node deleteHead(Node head){
        if (head==null || head.next == null){
            return null;
        }
        Node back = head;
        head = head.next;
        head.prev = null;
        back.next = null;
        return head;
    }
    public Node deleteTail(Node head){
        if (head==null || head.next == null){
            return null;
        }
        Node tail = head;
        while (tail.next !=null){
            tail = tail.next;
        }
        Node back = tail.prev;
        back.next = null;
        tail.prev = null;
        return head;
    }

    public Node deleteKthNode(Node head,int k){
        if (head==null){
            return null;
        }
        Node temp = head;
        int count =0;
        while (temp!=null){
            count++;
            if (count==k){
                break;
            }
            temp = temp.next;
        }

        if (count==k) {
            Node front = temp.next;
            Node back = temp.prev;
            if (front == null && back == null) {
                return null;
            } else if (back == null) {
                return deleteHead(head);
            } else if (front == null) {
                return deleteTail(head);
            }
            temp.next = null;
            temp.prev = null;
            back.next = front;
            front.prev = back;
        }
        return head;
    }

    public void deleteNode(Node temp){
        //given temp is not the head of the ll
        if (temp==null){
            return;
        }
        Node back = temp.prev;
        Node front = temp.next;
        if (front == null){
            back.next = null;
            temp.prev = null;
            return;
        }
        temp.next = null;
        temp.prev = null;
        back.next = front;
        front.prev = back;
    }
    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node last = null;
        Node curr = head;
        while (curr!=null){
            last = curr.prev;
            curr.prev = curr.next;
            curr.next = last;
            curr = curr.prev;
        }
        Node newHead = last.prev;
        return newHead;
    }
    public static void main(String[] args) {
        int[]arr = {1,3,4,5};
        DLL2 list = new DLL2();
       Node head = list.arrToDLL(arr);
        //list.print(head);
       // System.out.println(head.val);
       // Node newHead = list.deleteHead(head);
       //Node newHead = list.deleteTail(head);
       //Node newHead = list.deleteKthNode(head,4);
         //list.deleteNode(head.next.next.next);
        list.print(head);
       Node newHead = list.reverse(head);
       list.print(newHead);

    }

}
