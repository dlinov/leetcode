package io.github.dlinov.leetcode;

class Task019RemoveNthNodeFromEndOfList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fakeHead = new ListNode(0);
            fakeHead.next = head;
            ListNode p1 = fakeHead;
            ListNode p2 = fakeHead;
            for (int i = n; i > 0 && p1 != null; --i) {
                p1 = p1.next;
            }
            while (p1.next != null) {
                p1 = p1.next;
                p2 = p2.next;
            }
            if (p2.next == head) {
                return head.next;
            } else {
                p2.next = p2.next.next;
                return head;
            }
            
            /*if (head.next == null && n == 1) {
                return null;
            } else {
                final int cacheSize = n + 1;
                ListNode[] cache = new ListNode[cacheSize];
                int i = 0;
                ListNode curr = head;
                while (curr != null) {
                    cache[i++ % cacheSize] = curr;
                    curr = curr.next;
                }
                final int removeIndex = (i - n) % cacheSize;
                if (cache[removeIndex] == head) {
                    return head.next;
                } else {
                    final int beforeIndex = (i - n - 1) % cacheSize;
                    cache[beforeIndex].next = cache[removeIndex].next;
                    return head;
                }
            }*/
        }
    }
}