package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task211Spec extends AnyWordSpec with Matchers {
  "Task 211, Add and Search Word - Data structure design" must {
    val task = new Task211AddAndSearchWordDataStructureDesign()

    "comply with example flow" in {
      val dict = new task.WordDictionary();
      dict.addWord("bad")
      dict.addWord("dad")
      dict.addWord("mad")
      dict.search("pad") should be(false)
      dict.search("bad") should be(true)
      dict.search(".ad") should be(true)
      dict.search("b..") should be(true)
      dict.search("hahaha") should be(false)
    }
  }

}
