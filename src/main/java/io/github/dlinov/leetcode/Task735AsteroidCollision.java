package io.github.dlinov.leetcode;

import java.util.*;

public class Task735AsteroidCollision {
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
            if (asteroids.length == 0) return asteroids;
            final Stack<Integer> result = new Stack<>();
            for (int i = 0; i < asteroids.length; ++i) {
                final int a = asteroids[i];
                if (a > 0) result.add(a);
                else {
                    boolean collided = false;
                    while (!result.isEmpty()) {
                        final int top = result.peek();
                        if (top < 0) break;
                        else {
                            final int diff = top + a;
                            if (diff < 0) result.pop();
                            else {
                                if (diff == 0) result.pop();
                                collided = true;
                                break;
                            }
                        }
                    }
                    if (!collided) result.add(a);
                }
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
