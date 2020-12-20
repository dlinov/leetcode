package io.github.dlinov.leetcode1k;

public class Task1290ConvertBinaryNumberInALinkedListToInteger {
    class Solution {
        public int getDecimalValue(ListNode head) {
            int result = 0;
            while (head != null) {
                result <<= 1;
                result |= head.val;
                head = head.next;
            }
            return result;
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
