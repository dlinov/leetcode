package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task031Spec extends AnyWordSpec with Matchers {
    "Task 31, Next Permutation" must {
        val task = new Task031NextPermutation()
        val s = new task.Solution();
        
        "permute [1,2,3] -> [1,3,2]" in {
            val nums = Array(1, 2, 3)
            s.nextPermutation(nums)
            nums should be (Array(1, 3, 2))
        }
        
        "permute [3,2,1] -> [1,2,3]" in {
            val nums = Array(3, 2, 1)
            s.nextPermutation(nums)
            nums should be (Array(1, 2, 3))
        }
        
        "permute [1,1,5] -> [1,5,1]" in {
            val nums = Array(1, 1, 5)
            s.nextPermutation(nums)
            nums should be (Array(1, 5, 1))
        }
        
        "permute [1,5,1] -> [5,1,1]" in {
            val nums = Array(1, 5, 1)
            s.nextPermutation(nums)
            nums should be (Array(5, 1, 1))
        }
        
        "permute [9,5,4,3,1] -> [1,3,4,5,9]" in {
            val nums = Array(9, 5, 4, 3, 1)
            s.nextPermutation(nums)
            nums should be (Array(1, 3, 4, 5, 9))
        }
        
        "permute [1,5,8,4,7,6,5,3,1] -> [1,5,8,5,1,3,4,6,7]" in {
            val nums = Array(1, 5, 8, 4, 7, 6, 5, 3, 1)
            s.nextPermutation(nums)
            nums should be (Array(1, 5, 8, 5, 1, 3, 4, 6, 7))
        }
    }
}
