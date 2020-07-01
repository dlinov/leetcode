package io.github.dlinov.leetcode1k;

public class Task1491AverageSalaryExcludingTheMinimumAndMaximumSalary {
    class Solution {
        public double average(int[] salary) {
        int min = 0, max = 0;
        double sum = 0;
        for (int i = 0; i < salary.length; ++i) {
            sum += salary[i];
            if (salary[i] < salary[min]) min = i;
            if (salary[i] > salary[max]) max = i;
        }
        sum -= (salary[min] + salary[max]);
        return sum / (salary.length - 2);
        }
    }
}