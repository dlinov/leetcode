package io.github.dlinov.leetcode1k

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task1419Spec extends AnyWordSpec with Matchers {
  private val t = new Task1419MinimumNumberOfFrogsCroaking();
  private val s = new t.Solution();

  "Task 1419, Minimum Number of Frogs Croaking" must {
    "return 1 for \"croakcroak\"" in {
      s.minNumberOfFrogs("croakcroak") should be(1)
    }

    "return 2 for \"crcoakroak\"" in {
      s.minNumberOfFrogs("crcoakroak") should be(2)
    }

    "return -1 for \"croakcrook\"" in {
      s.minNumberOfFrogs("croakcrook") should be(-1)
    }

    "return -1 for \"croakcroa\"" in {
      s.minNumberOfFrogs("croakcroa") should be(-1)
    }

    "return 3 for \"croacrocarkoakk\"" in {
      s.minNumberOfFrogs("croacrocarkoakk") should be(3)
    }
  }

}
