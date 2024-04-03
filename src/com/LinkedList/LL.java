package com.LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;

    }
    public void insertFirst(int val){
        Node node = new Node(val);//Node means creating a box in the memory.
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;//tail == null means it was containing only one element or box.so head & tail will be pointing to the same now.
        }

        size+=1;
    }

    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
            insertLast(val);
            return;
        }
        Node temp = head;//temp is already at 0th index. this is why we are not starting from 0.
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail =null;
        }
        size--;
        return val;
    }
    public void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node find(int value){
        Node node = head;
       while (node != null){
           if (node.value == value) {
               return node;
           }
           node=node.next;
       }
       //if inner if statement not hit i.e. the element is not found in the list.
        //so it should return null
        return null;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public int deleteLast(){
        if (size<= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;//prev.next = the item we want to delete.and
        // (prev.next).next=the next item of deleted item should be connected with previous.

        return val;

    }
    //insert using recursion
    public void insertRec(int val,int index){
         head = insertRec(val,index,head);
    }

    private Node insertRec(int val,int index,Node node){
        //base condition
        if (index == 0){
            //create a new node
            Node temp = new Node(val,node);//new temp node value will be the value passed as argument
            // and next will be the current node in the present function call
            size++;
            return temp;//returning the node that is currently added.
        }
        //if base condition not hits then move forward.
      node.next = insertRec(val,index-1,node.next);
        return node;
    }
    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    //questions
    public void duplicates(){
        Node node = head;

        while (node.next!=null){
            if (node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //merge
    public static LL merge(LL first,LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();

        while (f!=null && s!=null){
            if (f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else {
                ans.insertLast(s.value);
                s=s.next;
            }
        }

        while (f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while (s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }

        return ans;
    }

    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row,int col){
        if (row == 0){
            return;
        }

        if (col<row){
            Node first = get(col);
            Node second = get(col+1);
            if (first.value>second.value){
                //swap
                if (first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) {
                    Node prev = get(col - 1);//col is current value you at
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }else {
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row,col+1);
        }
        bubbleSort(row-1,0);
    }
    //recursion reverse a linked list
    private void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverse(){
        if (size<2){
            return;
        }//it means size is either 0 or 1

        Node prev = null;
        Node pres = head;
        Node next = pres.next;

        while (pres!=null){
            pres.next = prev;
            prev = pres;
            pres = next;
            //here next.next can give a null pointer exception
            //put a check
            if (next !=null) {
                next = next.next;
            }
        }
        //after ending the loop
        head = prev;
    }

    public Node reverseBetween(Node head, int left, int right) {
        if(left == right){
            return head;
        }//it means it is a single element we cannot reverse

        //skip the first left-1 nodes
        Node pres = head;
        Node prev = null;
        for (int i = 0; pres!=null && i < left; i++) {
            prev = pres;
            pres = pres.next;
        }
        Node last = prev;
        Node newEnd = pres;

        //reverse between left and right
        Node next = pres.next;
        for (int i = 0; i < right-left+1; i++) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next!=null){
                next = next.next;
            }
        }
        if (last != null){
            last.next = prev;
        }else {
            head = prev;
        }
        newEnd.next = pres;
        return head;
    }

    public Node removeKth(Node head,int k){
        if(head == null){
            return head;
        }
        Node temp = head;
        Node prev = null;
        int count =0;
        if(temp!=null && k==1){
            return null;
        }
        while (temp.next!=null){
            count++;
            if (count == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public Node add1(Node head){
        //Node temp = head;
        int carry = helper(head);//it will give the final carry
        if (carry == 1){
           Node newNode = new Node(1);
           newNode.next = head;
           head = newNode;
           return head;//newNode is the updated head
        }
        return head;//it means carry =0, we can return the original head
    }
    public int helper(Node temp){
        //base condition
        if (temp == null){
            return 1;//first time we should return 1 as carry as we want to add 1
        }
        int carry = helper(temp.next);
        temp.value = temp.value + carry;
        if (temp.value<10){
            return 0;//as temp.val<10 it means after adding there is no carry
        }
        else{
            temp.value = 0;//as we are adding 1 so after adding it can be at most 10.
            return 1;//return carry 1
        }
    }
    public static void main(String[] args) {
   //     LL list = new LL();
//        list.insertLast(1);
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(3);
//        list.insertLast(3);
//
//        list.display();
//        list.duplicates();
//        list.display();

//        LL first = new LL();
//        LL second = new LL();
//
//        first.insertLast(1);
//        first.insertLast(3);
//        first.insertLast(5);
//        first.display();
//        second.insertLast(1);
//        second.insertLast(2);
//        second.insertLast(9);
//        second.insertLast(14);
//        second.display();
//        LL ans = LL.merge(first,second);
//        ans.display();

        LL list = new LL();
        for (int i = 5; i >0 ; i--) {
            list.insertLast(9);
        }
   //     list.display();
//        list.bubbleSort();
//       list.display();
       // list.removeKth(list.head, 5);
        list.display(list.head);
       Node newHead = list.add1(list.head);
        list.display(newHead);
    }
}
