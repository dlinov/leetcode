package io.github.dlinov.leetcode1k

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import java.{util => ju}

class Task1423Spec extends AnyWordSpec with Matchers {
  private val t = new Task1423MaximumPointsYouCanObtainFromCards
  private val s = new t.Solution

  "Task 2, Maximum Points You Can Obtain from Cards" must {
    "return 12 for [1,2,3,4,5,6,1] and k = 3" in {
      s.maxScore(Array(1,2,3,4,5,6,1), 3) should be(12)
    }
    
    "return 4 for [2,2,2] and k = 2" in {
      s.maxScore(Array(2,2,2), 2) should be(4)
    }
    
    "return 55 for [9,7,7,9,7,7,9] and k = 7" in {
      s.maxScore(Array(9,7,7,9,7,7,9), 7) should be(55)
    }
    
    "return 1 for [1,1000,1] and k = 1" in {
      s.maxScore(Array(1,1000,1), 1) should be(1)
    }
    
    "return 202 for [1,79,80,1,1,1,200,1] and k = 3" in {
      s.maxScore(Array(1,79,80,1,1,1,200,1), 3) should be(202)
    }
    
    "return 9999 for [1,..,1] (1000 of 1) and k = 9999" in {
      val arr = new Array[Int](10000)
      ju.Arrays.fill(arr, 1)
      s.maxScore(arr, 9999) should be(9999)
    }
  }
}
