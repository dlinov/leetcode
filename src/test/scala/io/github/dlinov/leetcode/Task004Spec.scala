package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task004Spec extends AnyWordSpec with Matchers {
    "Task 4, Median of Two Sorted Arrays" must {
        "find median for [1,2,3] and [4,5,6]" in {
            val actual = calculate(Array(1,2,3), Array(4,5,6))
            val expected = 3.5
            actual should be(expected)
        }

        "find median for [1,2,3,4] and [5,6,7,8]" in {
            val actual = calculate(Array(1,2,3,4), Array(5,6,7,8))
            val expected = 4.5
            actual should be(expected)
        }

        "find median for [4,5,6] and [1,2,3]" in {
            val actual = calculate(Array(4,5,6), Array(1,2,3))
            val expected = 3.5
            actual should be(expected)
        }

        "find median for [5,6,7,8] and [1,2,3,4]" in {
            val actual = calculate(Array(5,6,7,8), Array(1,2,3,4))
            val expected = 4.5
            actual should be(expected)
        }

        "find median for [1,2,3] and [4,5,6,7]" in {
            val actual = calculate(Array(1,2,3), Array(4,5,6,7))
            val expected = 4.0
            actual should be(expected)
        }

        "find median for [1,2,3,4] and [5,6,7]" in {
            val actual = calculate(Array(1,2,3,4), Array(5,6,7))
            val expected = 4.0
            actual should be(expected)
        }

        "find median for [4,5,6,7] and [1,2,3]" in {
            val actual = calculate(Array(4,5,6,7), Array(1,2,3))
            val expected = 4.0
            actual should be(expected)
        }

        "find median for [5,6,7] and [1,2,3,4]" in {
            val actual = calculate(Array(5,6,7), Array(1,2,3,4))
            val expected = 4.0
            actual should be(expected)
        }

        "find median for [1,2,3,4,5] and [3,5,6,10]" in {
            val actual = calculate(Array(1,2,3,4,5), Array(3,5,6,10))
            val expected = 4.0
            actual should be(expected)
        }

        "find median for [1] and [2,3,42,55]" in {
            val actual = calculate(Array(1), Array(2,3,42,55))
            val expected = 3.0
            actual should be(expected)
        }

        "find median for [2,3,42,55] and [1]" in {
            val actual = calculate(Array(2,3,42,55), Array(1))
            val expected = 3.0
            actual should be(expected)
        }

        "find median for [100] and [1]" in {
            val actual = calculate(Array(100), Array(1))
            val expected = 50.5
            actual should be(expected)
        }

        "find median for [] and [1]" in {
            val actual = calculate(Array.emptyIntArray, Array(1))
            val expected = 1.0
            actual should be(expected)
        }

        "find median for [1, 5, 25, 26] and []" in {
            val actual = calculate(Array(1,5,25,26), Array.emptyIntArray)
            val expected = 15.0
            actual should be(expected)
        }

        "find median for [1, 2] and [-1, 3]" in {
            val actual = calculate(Array(1,2), Array(-1,3))
            val expected = 1.5
            actual should be(expected)
        }

        "find median for [-1, 3] and [1, 2]" in {
            val actual = calculate(Array(-1,3), Array(1,2))
            val expected = 1.5
            actual should be(expected)
        }

        "find median for [4] and [1, 2, 3]" in {
            val actual = calculate(Array(4), Array(1,2,3))
            val expected = 2.5
            actual should be(expected)
        }
    }

    def calculate(arr1: Array[Int], arr2: Array[Int]): Double = {
        val t = new Task004MedianOfTwoSortedArrays();
        val s = new t.Solution();
        s.findMedianSortedArrays(arr1, arr2)
    }
}