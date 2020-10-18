package io.github.dlinov.leetcode1k;

public class Task1041RobotBoundedInCircle {
    class Solution {
        public boolean isRobotBounded(String instructions) {
            int degree = 0, dx = 0, dy = 0;
            int x = 0, y = 0, direction = 0;
            for (int i = 0; i < instructions.length(); ++i) {
                switch (instructions.charAt(i)) {
                    case 'G':
                        switch (degree) {
                            case 0:
                                ++dy; break;
                            case 90:
                                ++dx; break;
                            case 180:
                                --dy; break;
                            case 270:
                                --dx; break;
                        }
                        break;
                    case 'L':
                        degree = (degree + 270) % 360;
                        break;
                    case 'R':
                        degree = (degree + 90) % 360;
                        break;
                }
            }
            x += dx;
            y += dy;
            direction = (direction + degree) % 360;
            if (x == 0 && y == 0) return true;
            int tmp = 0;
            for (int i = 0; i < 4; ++i) {
                switch (direction) {
                    case 0:
                        break;
                    case 90:
                        tmp = dx;
                        dx = dy;
                        dy = -tmp;
                        break;
                    case 180:
                        dx = -dx;
                        dy = -dy;
                        break;
                    case 270:
                        tmp = dx;
                        dx = -dy;
                        dy = tmp;
                        break;
                }
                direction = (direction + degree) % 360;
                x += dx;
                y += dy;
                if (x == 0 && y == 0) return true;
            }
            return false;
        }
    }
}
