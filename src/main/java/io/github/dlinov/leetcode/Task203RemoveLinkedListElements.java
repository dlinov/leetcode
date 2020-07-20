package io.github.dlinov.leetcode;

public class Task203RemoveLinkedListElements {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode first = head;
            while (first != null && first.val == val) {
                first = first.next;
            }
            ListNode curr = first, next = curr == null ? null : curr.next;
            while (curr != null) {
                if ((next = curr.next) != null && next.val == val) {
                    next = next.next;
                    curr.next = next;
                } else curr = curr.next;
            }
            return first;
        }
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}