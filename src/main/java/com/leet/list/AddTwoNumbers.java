package com.leet.list;


public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode a = l1;
        ListNode b = l2;

        ListNode c = new ListNode(0);
        ListNode result = c;

        int temp = 0;
        while (a != null && b != null) {
            c.next = new ListNode(0);
            c = c.next;

            c.val = (a.val + b.val + temp) % 10;
            temp = (a.val + b.val + temp) / 10;

            a = a.next;
            b = b.next;

        }

        while (a != null) {

            c.next = new ListNode(0);
            c = c.next;
            c.val = (a.val + temp) % 10;
            temp = (a.val + temp) / 10;

            a = a.next;


        }

        while (b != null) {
            c.next = new ListNode(0);
            c = c.next;

            c.val = (b.val + temp) % 10;
            temp = (b.val + temp) / 10;

            b = b.next;


        }

        if(temp > 0){
            c.next = new ListNode(0);
            c = c.next;
            c.val = temp;
        }

        return result.next;

    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
