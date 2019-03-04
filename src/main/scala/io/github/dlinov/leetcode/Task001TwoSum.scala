package io.github.dlinov.leetcode

object Task001TwoSum {
  def main(args: Array[String]): Unit = {
    val nums = new Array[Int](4)
    nums(0) = 2
    nums(1) = 7
    nums(2) = 11
    nums(3) = 15
    println(Solution.twoSum(nums, 9).mkString(" "))
    val nums2 = new Array[Int](3)
    nums2(0) = 3
    nums2(1) = 2
    nums2(2) = 4
    println(Solution.twoSum(nums2, 6).mkString(" "))
  }

  object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
      val sorted = nums.zipWithIndex.sortBy(_._1)
      twoSumInner(sorted, 0, sorted.length - 1, target)
    }

    @scala.annotation.tailrec
    def twoSumInner(sorted: Array[(Int, Int)], i: Int, j: Int, target: Int): Array[Int] = {
      assert(i < j, "No solution found")
      val preSum = sorted(i)._1 + sorted(j)._1
      (preSum - target) match {
        case 0 =>
          val results = new Array[Int](2)
          results(0) = sorted(i)._2
          results(1) = sorted(j)._2
          results
        case neg if neg < 0 => twoSumInner(sorted, i + 1, j, target)
        case pos if pos > 0 => twoSumInner(sorted, i, j - 1, target)
      }
    }
  }
}