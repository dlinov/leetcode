package io.github.dlinov.leetcode;

import java.util.*;

public class Task406QueueReconstructionByHeight {
    class Solution {
        public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            final int byHeight = Integer.compare(o2[0], o1[0]);
            return byHeight != 0 ? byHeight : Integer.compare(o1[1], o2[1]);
        });
        final List<int[]> q = new ArrayList<>();
        for (int i = 0; i < people.length; ++i) {
            q.add(people[i][1], people[i]);
        }
        int[][] result = new int[people.length][];
        q.toArray(result);
        return result;
        }
    }
}