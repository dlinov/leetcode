package io.github.dlinov.leetcode;

public class Task876MiddleOfTheLinkedList {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
     
    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode p0 = head, p1 = head;
            while (p1.next != null) {
                p0 = p0.next;
                p1 = p1.next;
                if (p1.next != null) {
                    p1 = p1.next;
                }
            }
            return p0;
        }
    }
}