package io.github.dlinov.leetcode

import org.scalatest._

import scala.jdk.CollectionConverters.ListHasAsScala

class Task046Spec extends WordSpec with Matchers {
    "Task 46, Permutations" must {
        val task = new Task046Permutations()
        val s = new task.Solution();
        
        "permute [1,2,3]" in {
            val nums = Array(1, 2, 3)
            s.permute(nums).asScala.toSet.size should be (6)
        }
        
        "permute [1,5,8,10,4,7,6,2,3,9]" in {
            val nums = Array(1, 5, 8, 10, 4, 7, 6, 2, 3, 9)
            s.permute(nums).asScala.toSet.size should be (3628800)
        }
    }
}
