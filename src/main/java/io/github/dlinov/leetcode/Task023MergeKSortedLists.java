package io.github.dlinov.leetcode;

import java.util.*;

class Task023MergeKSortedLists {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            // O(kN)
            /*ListNode result = null;
            for (int i = 0; i < lists.length; ++i) {
                result = mergeListK(result, lists[i]);
            }
            return result;*/
            // O(Nlogk)
            return divide(lists, 0, lists.length - 1);
        }

        ListNode divide(ListNode[] lists, int left, int right) {
            if (left > right) {
                return null;
            } else if (left == right) {
                return lists[left];
            } else if (left + 1 == right) {
                return mergeListK(lists[left], lists[right]);
            } else {
                final int mid = (right + left) / 2;
                return mergeListK(divide(lists, left, mid) , divide(lists, mid + 1, right));
            }
        }

        ListNode mergeListK(ListNode acc, ListNode listK) {
            ListNode p = new ListNode(0);
            ListNode fakeHead = p;
            while (acc != null && listK != null) {
                if (acc.val <= listK.val) {
                    p.next = acc;
                    acc = acc.next;
                } else {
                    p.next = listK;
                    listK = listK.next;
                }
                p = p.next;
            }
            while (acc != null) {
                p.next = acc;
                acc = acc.next;
                p = p.next;
            }
            while (listK != null) {
                p.next = listK;
                listK = listK.next;
                p = p.next;
            }
            return fakeHead.next;
        }
    }
}