package io.github.dlinov.leetcode

import org.scalatest._

class Task153Spec extends WordSpec with Matchers {
    "Task 153, Find Minimum in Rotated Sorted Array" must {
        val task = new Task153FindMinimumInRotatedSortedArray()
        val s = new task.Solution()
        
        "find minimum in [3,4,5,0,1,2]" in {
            val nums = Array(3, 4, 5, 0, 1, 2)
            s.findMin(nums) should be (0)
        }
        
        "find minimum in [4,5,0,1,2,3]" in {
            val nums = Array(4, 5, 0, 1, 2, 3)
            s.findMin(nums) should be (0)
        }
        
        "find minimum in [5,0,1,2,34,]" in {
            val nums = Array(5, 0, 1, 2, 3, 4)
            s.findMin(nums) should be (0)
        }
        
        "find minimum in [0,1,2,3,4,5]" in {
            val nums = Array(0, 1, 2, 3, 4, 5)
            s.findMin(nums) should be (0)
        }
        
        "find minimum in [1,2,3,4,5,0]" in {
            val nums = Array(1, 2, 3, 4, 5, 0)
            s.findMin(nums) should be (0)
        }
        
        "find minimum in [2,3,4,5,0,1]" in {
            val nums = Array(2, 3, 4, 5, 0, 1)
            s.findMin(nums) should be (0)
        }

        "find minimum in [3,4,5,1,2]" in {
            val nums = Array(3, 4, 5, 1, 2)
            s.findMin(nums) should be (1)
        }

        "find minimum in [1,2,3,4,5]" in {
            val nums = Array(1, 2, 3, 4, 5)
            s.findMin(nums) should be (1)
        }

        "find minimum in [2,3,4,5,1]" in {
            val nums = Array(2, 3, 4, 5, 1)
            s.findMin(nums) should be (1)
        }

        "find minimum in [4,5,1,2,3]" in {
            val nums = Array(4, 5, 1, 2, 3)
            s.findMin(nums) should be (1)
        }

        "find minimum in [5,1,2,3,4]" in {
            val nums = Array(5, 1, 2, 3, 4)
            s.findMin(nums) should be (1)
        }

    }
}
