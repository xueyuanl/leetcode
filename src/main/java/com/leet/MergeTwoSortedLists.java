package com.emc.mystic.manager.operation.core.factory.leet;

public class MergeTwoSortedLists {


    public static void main(String[] args) {

        MergeTwoSortedLists m = new MergeTwoSortedLists();

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(0);
        ListNode index = head;


        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                index.next = l1;
                index = index.next;
                l1 = l1.next;
            } else {
                index.next = l2;
                index = index.next;
                l2 = l2.next;
            }

        }

        if (l1 == null) {
            index.next = l2;
        }
        if (l2 == null) {
            index.next = l1;
        }

        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}