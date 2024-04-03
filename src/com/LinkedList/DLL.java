package com.LinkedList;

public class DLL {

   private Node head;
    public void insertFirst(int val){
        Node node = new Node(val);//new node has been created first
        node.next = head;
        node.prev = null;
        if (head!=null) {
            head.prev = node;//head may be null if you are inserting for the very first time
        }
        head = node;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val +" -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public void displayRev(){
        Node temp = head;
        Node last = null;
        while (temp!=null){
            System.out.print(temp.val +" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("end");

        System.out.println("Print in reverse.");
        while (last!=null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("start");
    }
   public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;
        if (head == null){
            //node.next = null;
            node.prev = null;
            head = node;
            return;
        }
        while (last.next!=null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
   }
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.val == value) {
                return node;
            }
            node=node.next;
        }
        //if inner 'if' statement not hit i.e. the element is not found in the list.
        //so it should return null
        return null;
    }
   public void insert(int after,int val){
        Node p = find(after);
        if (p==null){
            System.out.println("P element does not exists.");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null){
            node.next.prev=node;
        }
       // node.next.prev=node;
   }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
