package io.github.dlinov.leetcode;

import java.util.*;

class Task021MergeTwoSortedLists {
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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            final ListNode fakeHead = new ListNode(0);
            ListNode p = fakeHead;
            ListNode p1 = l1;
            ListNode p2 = l2;
            while (p1 != null && p2 != null) {
                if (p1.val < p2.val) {
                    p.next = p1;
                    p1 = p1.next;
                } else {
                    p.next = p2;
                    p2 = p2.next;
                }
                p = p.next;
            }
            while (p1 != null) {
                p.next = p1;
                p1 = p1.next;
                p = p.next;
            }
            while (p2 != null) {
                p.next = p2;
                p2 = p2.next;
                p = p.next;
            }
            return fakeHead.next;
        }
    }
}