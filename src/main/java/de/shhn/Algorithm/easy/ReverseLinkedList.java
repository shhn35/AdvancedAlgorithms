package de.shhn.Algorithm.easy;


// * Definition for singly-linked list.
class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;

        ListNode    c,n,t;

        c = head;
        n = c.next;
        while(n != null){
            t = n.next;
            n.next = c;
            c = n;
            n = t;
        }
        head.next = null;
        return c;
    }
}
