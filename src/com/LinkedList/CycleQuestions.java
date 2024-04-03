package com.LinkedList;

public class CycleQuestions {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        //if inner is statement doesnot hit it means one of inner while condition becomes null
        //so return false
        return false;

    }
    public int lengthCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                //calculate the length of the cycle
                 ListNode temp = slow;
                int length =0;
                do {
                    temp = temp.next;
                    length++;
                }while (temp != fast);
                return length;
            }
        }
        //if inner if statement doesnot hit it means one of inner while condition becomes null
        //so return false
        return 0;//cycle is not present.

    }
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0){
            return null;// it means no cycle is present.
        }

        //find the start node
        ListNode f = head;
        ListNode s = head;
        while (length > 0){
            s = s.next;
            length--;
        }

        //keep moving both f and s forward and they will meet at cycle start
        while (f != s){
            f = f.next;
            s=s.next;
        }
        return f;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (fast != slow);
        //slow == 1 ,then it will return true else it will return false
        return slow == 1;
    }
    private int findSquare(int num){
        int ans = 0;
        while (num>0){
            int lastDigit = num % 10;
            ans = ans + lastDigit * lastDigit;
            num = num/10;
        }
        return ans;
    }

    public ListNode middleNode(ListNode head) {
      ListNode slow = head;
      ListNode fast = head;

      while (fast!=null && fast.next!=null){
          fast = fast.next.next;
          slow = slow.next;
      }
      return slow;
    }

    public void reorderList(ListNode head) {
       if(head == null || head.next == null){
           return;
       }
       ListNode mid = middleNode(head);

       ListNode hf = head;
       ListNode hs = reverseList(mid);

       //rearrange
        while (hf != null && hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        //setting next of tail is null
        if (hf!=null){
            hf.next = null;
        }
    }
    public boolean isPalindrome(ListNode head) {
      ListNode mid = middleNode(head);
      ListNode headSecond = reverseList(mid);
      ListNode rereverseHead = headSecond;

      //compare both the halves
        while (head !=null && headSecond!=null){
            if (head.val != headSecond.val){
                break;
            }
            head = head.next;
            headSecond =headSecond.next;
        }
        reverseList(rereverseHead);

        return head == null || headSecond == null;
    }

    public ListNode reverseList(ListNode head) {
        //missing an edge case
        //if the head is null that is list is empty then can't do head.next
        if(head == null){
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode Next = pres.next;

        while (pres!=null){
            pres.next = prev;
            prev = pres;
            pres = Next;
            //here next.next can give a null pointer exception
            //put a check
            if (Next !=null) {
                Next = Next.next;
            }
        }
        //after ending the loop
        head = prev;
        return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }//it means it is a single element we cannot reverse

        //skip the first left-1 nodes
        ListNode pres = head;
        ListNode prev = null;
        for (int i = 0; pres!=null && i < left-1; i++) {
            prev = pres;
            pres = pres.next;
        }
        ListNode last = prev;
        ListNode newEnd = pres;

        //reverse between left and right
        ListNode next = pres.next;
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

    //its also reversing the <k end items -> modify it accordingly
    public ListNode reverseKGroup(ListNode head, int k) {
       if (k<=1 || head == null){
           return head;
       }
        //skip the first left-1 nodes
        ListNode pres = head;
        ListNode prev = null;

        while (true){

            ListNode last = prev;
            ListNode newEnd = pres;

            //reverse between left and right
            ListNode next = pres.next;
            for (int i = 0; i < k; i++) {
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
            if (pres == null){
                break;
            }

            prev = newEnd;
        }
        return head;

    }
    class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
  val = x;
  next = null;
       }
    }
}
