package io.github.dlinov.leetcode;

public class Task430FlattenAMultilevelDoublyLinkedList {
    // Definition for a Node.
    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public String toString() {
            return String.format("%d->%s", val, next == null ? "null" : next.toString());
        }
    }

    class Solution {
        public Node flatten(Node head) {
            if (head == null) return null;
            f(head);
            return head;
        }
        
        private Node f(Node node) {
            final Node child = node.child;
            if (child != null) {
                node.child = null;
                Node lastChild = f(child);
                Node next = node.next;
                node.next = child;
                child.prev = node;
                lastChild.next = next;
                if (next != null) {
                    next.prev = lastChild;
                }
                node = lastChild;
            }
            if (node.next != null) {
                node = f(node.next);
            }
            return node;
        }
    }
}