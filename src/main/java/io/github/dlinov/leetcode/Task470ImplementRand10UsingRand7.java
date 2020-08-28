package io.github.dlinov.leetcode;

import java.util.Random;

public class Task470ImplementRand10UsingRand7 {
    /**
     * The rand7() API is already defined in the parent class SolBase.
     * public int rand7();
     * @return a random integer in the range 1 to 7
     */
    class Solution extends SolBase {
        public int rand10() {
            int i = 50;
            while (i > 40) {
                int x = rand7() - 1;
                int y = rand7();
                i = x * 7 + y;
            }
            return i % 10 + 1;
        }
    }

    abstract class SolBase {
        private Random rnd = new Random();
        public int rand7() {
            return rnd.nextInt(7) + 1;
        }
    }
}