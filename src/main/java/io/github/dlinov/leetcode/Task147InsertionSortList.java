package io.github.dlinov.leetcode;

public class Task147InsertionSortList {
    class Solution {
        public ListNode insertionSortList(ListNode head) {
            ListNode node = head, next = null;
            ListNode fakeHead = new ListNode(0);
            while (node != null) {
                next = node.next;
                ListNode iter = fakeHead;
                while (iter.next != null && iter.next.val < node.val)
                iter = iter.next;
                // insert curr between p and p.next
                node.next = iter.next;
                iter.next = node;
                node = next;
            }
            return fakeHead.next;
        }
    }

    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
