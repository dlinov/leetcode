package io.github.dlinov.leetcode1k

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task1422Spec extends AnyWordSpec with Matchers {
  private val t = new Task1422MaximumScoreAfterSplittingAString
  private val s = new t.Solution

  "Task 1422, Maximum Score After Splitting a String" must {
    "return 5 for '011101'" in {
      s.maxScore("011101") should be(5)
    }
    
    "return 5 for '00111'" in {
      s.maxScore("00111") should be(5)
    }
    
    "return 3 for '1111'" in {
      s.maxScore("1111") should be(3)
    }
    
    "return 2 for '1010'" in {
      s.maxScore("1010") should be(2)
    }
    
    "return 3 for '0101'" in {
      s.maxScore("0101") should be(3)
    }
    
    "return 1 for '00'" in {
      s.maxScore("00") should be(1)
    }
  }
}
