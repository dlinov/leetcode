package io.github.dlinov.leetcode

import org.scalatest._

class Task033Spec extends WordSpec with Matchers {
    "Task 33, Search in Rotated Sorted Array" must {
        val task = new Task033SearchInRotatedSortedArray()
        val s = new task.Solution();
        
        "not find 0 in [1, 3]" in {
            val nums = Array(1, 3)
            s.search(nums, 0) should be (-1)
        }
        
        "not find 2 in [3,4,5,6,1,2]" in {
            val nums = Array(3, 4, 5, 6, 1, 2)
            s.search(nums, 2) should be (5)
        }
        
        "find 4 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 4) should be (0)
        }
        
        "find 5 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 5) should be (1)
        }
        
        "find 6 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 6) should be (2)
        }
        
        "find 7 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 7) should be (3)
        }
        
        "find 0 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 0) should be (4)
        }
        
        "find 1 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 1) should be (5)
        }
        
        "find 2 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 2) should be (6)
        }
        
        "not find 3 in [4,5,6,7,0,1,2]" in {
            val nums = Array(4, 5, 6, 7, 0, 1, 2)
            s.search(nums, 3) should be (-1)
        }
    }
}
