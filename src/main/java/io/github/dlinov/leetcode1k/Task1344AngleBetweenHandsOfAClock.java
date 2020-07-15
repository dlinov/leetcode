package io.github.dlinov.leetcode1k;

public class Task1344AngleBetweenHandsOfAClock {
    class Solution {
        public double angleClock(int hour, int minutes) {
            double mAngle = 6 * minutes;
            double hAngle = 30 * hour + 0.5 * minutes;
            final double angle = Math.abs(mAngle - hAngle);
            return angle > 180 ? 360 - angle : angle;
        }
    }
}