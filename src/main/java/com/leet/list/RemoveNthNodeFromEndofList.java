package com.leet.list;

public class RemoveNthNodeFromEndofList {

    public static void main(String[] args){



        RemoveNthNodeFromEndofList r = new RemoveNthNodeFromEndofList();

        ListNode l = new ListNode(1);
        r.removeNthFromEnd(l, 1);
    }



    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode newHead = new ListNode(0); // the way of adding a new head is very critical!
        newHead.next = head;
        ListNode slow = newHead;
        ListNode fast = newHead;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {

            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return newHead.next;

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}