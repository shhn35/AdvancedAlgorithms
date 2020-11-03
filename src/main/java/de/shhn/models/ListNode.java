package de.shhn.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static Object[] convertListNodeToArray(ListNode list){
        List<Integer> result =new ArrayList<Integer>();
        while(list!=null){
            result.add(list.val);
            list = list.next;
        }

        return result.toArray();
    }
}
