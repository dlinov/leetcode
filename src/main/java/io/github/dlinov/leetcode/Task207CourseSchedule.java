package io.github.dlinov.leetcode;

import java.util.*;

public class Task207CourseSchedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            final Map<Integer, Set<Integer>> graph = new HashMap<>();
            for (int i = 0; i < prerequisites.length; ++i) {
                final int[] v = prerequisites[i];
                final int target = v[0];
                final int prereq = v[1];
                graph.computeIfAbsent(target, x -> new HashSet<Integer>());
                graph.get(target).add(prereq);
            }
            final Stack<Integer> stack = new Stack<>();
            int count = 0;
            for (int i = 0; i < numCourses; ++i) {
                Set<Integer> prereqs = graph.get(i);
                if (prereqs == null || prereqs.isEmpty()) {
                    stack.push(i);
                }
            }
            while (!stack.empty()) {
                Integer course = stack.pop();
                count++;
                for (Map.Entry<Integer, Set<Integer>> kv : graph.entrySet()) {
                    final Set<Integer> prereqs = kv.getValue();
                    if (prereqs.contains(course)) {
                        prereqs.remove(course);
                        if (prereqs.isEmpty()) {
                            stack.push(kv.getKey());
                        }
                    }
                }
            }
            return count == numCourses;
        }
    }
}