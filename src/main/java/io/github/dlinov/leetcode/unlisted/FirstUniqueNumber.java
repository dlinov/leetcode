package io.github.dlinov.leetcode.unlisted;

import java.util.*;

public class FirstUniqueNumber {
    class FirstUnique {

    private final Set<Integer> uSet;
    private final Set<Integer> nSet;
    private final Queue<Integer> uQueue = new LinkedList<>();

    public FirstUnique(int[] nums) {
        uSet = new HashSet<>();
        nSet = new HashSet<>();
        for (int i = 0; i < nums.length; ++i) {
            add(nums[i]);
        }
    }
    
    public int showFirstUnique() {
        while (!uQueue.isEmpty() && !uSet.contains(uQueue.peek())) {
            uQueue.poll();
        }
        return uQueue.isEmpty() ? -1 : uQueue.peek();
    }
    
    public void add(int value) {
        if (uSet.contains(value)) {
            uSet.remove(value);
            nSet.add(value);
        } else if (!nSet.contains(value)) {
            uSet.add(value);
            uQueue.add(value);
        }
    }
    }
    
    /**
     * Your FirstUnique object will be instantiated and called as such:
     * FirstUnique obj = new FirstUnique(nums);
     * int param_1 = obj.showFirstUnique();
     * obj.add(value);
     */
}