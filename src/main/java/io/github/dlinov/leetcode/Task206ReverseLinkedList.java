package io.github.dlinov.leetcode;

public class Task206ReverseLinkedList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) return head;
            ListNode curr = head, next = curr.next, tmp;
            curr.next = null;
            while (next != null) {
                tmp = next.next;
                next.next = curr;
                curr = next;
                next = tmp;
            }
            return curr;
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
