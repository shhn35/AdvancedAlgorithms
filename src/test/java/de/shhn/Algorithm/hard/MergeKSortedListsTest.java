package de.shhn.Algorithm.hard;

import de.shhn.models.ListNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class MergeKSortedListsTest {
    @Test
    public void trivial(){
        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();

        // First Test:
        //[[1,4,5],[1,3,4],[2,6]]

        ListNode[] inputLists = new ListNode[3];
        ListNode l = new ListNode();
        l.val = 1;
        l.next = new ListNode(4, new ListNode(5));
        inputLists[0] = l;

        l= new ListNode();
        l.val = 1;
        l.next = new ListNode(3, new ListNode(4));
        inputLists[1] = l;

        l= new ListNode();
        l.val = 2;
        l.next = new ListNode(6);
        inputLists[2] = l;

        // Expected:
        // [1,1,2,3,4,4,5,6]
        ListNode expected = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(4,new ListNode(5,new ListNode(6))))))));

        Object[] arr_expected = ListNode.convertListNodeToArray(expected);
        Object[] arr_actual =ListNode.convertListNodeToArray(mergeKSortedLists.mergeKLists(inputLists));

        assertArrayEquals(arr_expected,arr_actual);
    }
}
