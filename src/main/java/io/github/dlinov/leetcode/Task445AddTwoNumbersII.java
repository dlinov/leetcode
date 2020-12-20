package io.github.dlinov.leetcode;

import java.util.Stack;

public class Task445AddTwoNumbersII {
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            final Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
            while (l1 != null) {
                s1.add(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                s2.add(l2.val);
                l2 = l2.next;
            }
            ListNode r = null;
            int rem = 0;
            while (!(s1.empty() || s2.empty())) {
                int sum = s1.pop() + s2.pop() + rem;
                rem = sum / 10;
                final ListNode node = new ListNode(sum % 10);
                node.next = r;
                r = node;
            }
            while (!s1.empty()) {
                int sum = s1.pop() + rem;
                rem = sum / 10;
                final ListNode node = new ListNode(sum % 10);
                node.next = r;
                r = node;
            }
            while (!s2.empty()) {
                int sum = s2.pop() + rem;
                rem = sum / 10;
                final ListNode node = new ListNode(sum % 10);
                node.next = r;
                r = node;
            }
            while (rem != 0) {
                int sum = rem;
                rem = sum / 10;
                final ListNode node = new ListNode(sum % 10);
                node.next = r;
                r = node;
            }
            return r;
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
