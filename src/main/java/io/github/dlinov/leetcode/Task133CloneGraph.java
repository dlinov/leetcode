package io.github.dlinov.leetcode;

import java.util.*;

public class Task133CloneGraph {
    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> neighbors;
        
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    class Solution {
        public Node cloneGraph(Node node) {
            return inner(node, new HashMap<Node, Node>());
        }

        private Node inner(Node node, Map<Node, Node> visited) {
            if (node == null) return node;
            Node copy = visited.get(node);
            if (copy != null) return copy;
            copy = new Node(node.val);
            visited.put(node, copy);
            for (Node n : node.neighbors) {
                copy.neighbors.add(inner(n, visited));
            }
            return copy;
        }
    }
}