package io.github.dlinov.leetcode1k;

import java.util.*;

public class Task1094CarPooling {
    class Solution {
        public boolean carPooling(int[][] trips, int capacity) {
            int count = 0;
            TreeMap<Integer,Integer> map = new TreeMap<>();
            // Sort the Arrays based on the start point
            Arrays.sort(trips, new Comparator<int[]>(){
                public int compare(int[] o1 ,int[] o2) {
                    return Integer.compare(o1[1],o2[1]);
                }
            });
            for (int i = 0 ; i < trips.length ; i++) {
                
                // Check whether the treemap contains the endpoint and add it.
                // Add the end point and the count of people at each stop
                if (!map.containsKey(trips[i][2])) {
                    count += trips[i][0];
                    map.put(trips[i][2],trips[i][0]);
                } else {
                // if the treeMap already contains the endpoint add the existing value and store it.
                    map.put(trips[i][2],map.getOrDefault(trips[i][2],0)+trips[i][0]);
                    count += trips[i][0];
                }
                
                // At every iteration check whether there are end points lesser than or equal to the current array's start point .
                //If you find them ,delete them and subtract the count of people.
                while (map.floorKey(trips[i][1]) != null) {
                       count -= map.get(map.floorKey(trips[i][1]));
                        map.remove(map.floorKey(trips[i][1]));
                    }
                    // return if the count exceeds the capacity
                 if (count > capacity)
                    return false;
            }
            return true;
        }
    }
}
