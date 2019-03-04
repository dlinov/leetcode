package io.github.dlinov.leetcode;

public class Task002AddTwoNumbers {
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode first = l1;
            ListNode second = l2;
            ListNode sum = null;
            ListNode last = null;
            int inMind = 0;
            while (first != null || second != null) {
                int val1 = 0;
                int val2 = 0;
                if (first != null) {
                    val1 = first.val;
                    first = first.next;
                }
                if (second != null) {
                    val2 = second.val;
                    second = second.next;
                }
                int s = val1 + val2 + inMind;
                int iSum = s % 10;
                inMind = s / 10;
                ListNode iNode = new ListNode(iSum);
                if (sum == null) {
                    sum = iNode;
                } else {
                    last.next = iNode;
                }
                last = iNode;
            }
            if (inMind != 0) {
                ListNode iNode = new ListNode(inMind);
                last.next = iNode;
            }
            return sum;
        }
    }
}