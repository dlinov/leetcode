package io.github.dlinov.leetcode;

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Task019RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        final Solution s = new Solution();
        for (int i = 1; i <= 9; ++i) {
            ListNode n9 = new ListNode(9);
            n9.next = null;
            ListNode n8 = new ListNode(8);
            n8.next = n9;
            ListNode n7 = new ListNode(7);
            n7.next = n8;
            ListNode n6 = new ListNode(6);
            n6.next = n7;
            ListNode n5 = new ListNode(5);
            n5.next = n6;
            ListNode n4 = new ListNode(4);
            n4.next = n5;
            ListNode n3 = new ListNode(3);
            n3.next = n4;
            ListNode n2 = new ListNode(2);
            n2.next = n3;
            ListNode n1 = new ListNode(1);
            n1.next = n2;
            ListNode list = s.removeNthFromEnd(n1, i);
            System.out.println(String.format("Solution for %d:", i));
            int j = 0;
            while (list != null && j++ < 20) {
                System.out.print(list.val);
                list = list.next;
            }
            System.out.println("\n====================");
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    static class Solution {
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