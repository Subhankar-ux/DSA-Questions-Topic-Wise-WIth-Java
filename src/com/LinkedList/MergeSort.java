package com.LinkedList;

public class MergeSort {

    public ListNode sortList(ListNode head) {
      if (head == null || head.next==null){
          return head;
      }

      ListNode mid = getMid(head);
      ListNode left = sortList(head);
      ListNode right = sortList(mid);

      return merge(left,right);
    }
    public ListNode getMid(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast!=null && fast.next!=null){
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;

        ListNode midPrev = null;
        while (head !=null && head.next!=null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }

        //assert midPrev != null;
        ListNode mid = midPrev.next;
        midPrev.next =null;
        return mid;
    }

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val <list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2= list2.next;
            }
            tail = tail.next;
        }
        tail.next = (list1!=null) ? list1 : list2;
        return dummyHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }
}
