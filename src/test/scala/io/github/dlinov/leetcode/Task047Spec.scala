package io.github.dlinov.leetcode

import org.scalatest._

import scala.jdk.CollectionConverters.ListHasAsScala

class Task047Spec extends WordSpec with Matchers {
    "Task 47, Permutations II" must {
        val task = new Task047PermutationsII()
        val s = new task.Solution();
        
        "permute [1,2,1]" in {
            val nums = Array(1, 2, 1)
            s.permuteUnique(nums).asScala.toSet.size should be (3)
        }
        
        "permute [1,5,8,5,4,7,6,2,3,9]" in {
            val nums = Array(1, 5, 8, 5, 4, 7, 6, 2, 3, 9)
            s.permuteUnique(nums).asScala.toSet.size should be (1814400)
        }
    }
}
