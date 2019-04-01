package io.github.dlinov.leetcode;

import java.util.*;

class Task024SwapNodesInPairs {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode swapPairs(ListNode head) {
            ListNode p1, p2, p3, result;
            result = head != null && head.next != null ? head.next : head;
            p1 = head;
            while (p1 != null && p1.next != null) {
                p2 = p1.next; // ii
                p3 = p2.next; // iii
                p1.next = (p3 == null || p3.next == null) ? p3 : p3.next; // i -> iii (null) / iv
                p2.next = p1; // ii -> i
                p1 = p3;
            }
            return result;
        }
    }
}