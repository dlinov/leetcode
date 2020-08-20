package io.github.dlinov.leetcode;

public class Task143ReorderList {
    class Solution {
        public void reorderList(ListNode head) {
            ListNode p0 = head;
            int n = 0;
            while (p0 != null) {
                p0 = p0.next;
                n++;
            }
            if (n <= 2) return;
            p0 = head;
            ListNode p1 = head;
            for (int i = 0; i < n / 2; ++i) {
                p1 = p1.next;
            }
            ListNode tmp;
            p0 = p1 == null ? null : p1.next;
            if (p1 != null) p1.next = null;
            while (p0 != null) {
                tmp = p1;
                p1 = p0;
                p0 = p0.next;
                p1.next = tmp;
            }
            p0 = head;
            while (p0 != p1) {
                if (p1 == null) {
                    p0.next = p1;
                    break;
                }
                tmp = p0.next;
                p0.next = p1;
                p0 = tmp;
                tmp = p1.next;
                p1.next = p0;
                p1 = tmp;
            }
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