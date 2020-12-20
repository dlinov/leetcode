package io.github.dlinov.leetcode;

import java.util.Random;

public class Task382LinkedListRandomNode {
    class Solution {
    
        private int length = 0;
        private final ListNode head;
        private ListNode node = null;
        private int i = 0;
        private final Random rnd = new Random();
    
        /** @param head The linked list's head.
            Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            this.head = head;
            this.node = head;
            while (node != null) {
                node = node.next;
                length++;
            }
            this.node = this.head;
        }
        
        /** Returns a random node's value. */
        public int getRandom() {
            int next = Math.abs(rnd.nextInt() % length);
            if (next >= i) {
                next -= i;
                i += next;
            }
            else {
                node = head;
                i = next;
            }
            while (next-- > 0) node = node.next;
            return node.val;
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
