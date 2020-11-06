package de.shhn.Algorithm.hard;

import de.shhn.models.ListNode;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class MergeKSortedLists {


    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode();
        ListNode head = result;
        ListNode current ;

        // Creating a PriorityQueue as MinHeap
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the first elements of all sorted lists to the MinHeap
        for(int i=0; i<lists.length;i++){
            if(lists[i] != null)
                pq.offer(lists[i]);
            //lists[i] = lists[i].next;
        }

        // if the input was empty, the result should be null
        if(pq.size() == 0)
            return null;

        while(pq.size() > 0){
            // get the min elements among current k elements in MeanHeap
//            current = pq.poll();
//            result.next = new ListNode() ;
//            result = result.next ;
//            result.val = current.val;
            current = pq.poll();
            result.next = current;
            result = result.next;

            // put the next element of the corresponding list to MeanHeap
            if(current.next != null)
                pq.offer(current.next);
        }
        return head.next;
    }

}
