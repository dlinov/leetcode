package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1462CourseScheduleIV {
    class Solution {
        public List<Boolean> checkIfPrerequisite(int n, int[][] prerequisites, int[][] queries) {
            final Map<Integer, Set<Integer>> graph = new HashMap<>();
            for (int i = 0; i < prerequisites.length; ++i) {
                final int[] edge = prerequisites[i];
                final int course = edge[1];
                final int prereq = edge[0];
                final Set<Integer> prereqs = graph.computeIfAbsent(course, k -> new HashSet<>());
                prereqs.add(prereq);
            }
            final List<Boolean> result = new ArrayList<>(queries.length);
            for (int i = 0; i < queries.length; ++i) {
                result.add(search(graph, new HashSet<>(), queries[i][1], queries[i][0]));
            }
            return result;
        }

        private boolean search(Map<Integer, Set<Integer>> graph, Set<Integer> visited, Integer courseKey, Integer prereq) {
            final Set<Integer> directPrereqs = graph.get(courseKey);
            visited.add(courseKey);
            if (directPrereqs == null || directPrereqs.isEmpty()) {
                return false;
            }
            if (directPrereqs.contains(prereq)) {
                return true;
            }
            for (Integer p : directPrereqs) {
                if (!visited.contains(p)) {
                    if (search(graph, visited, p, prereq)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}