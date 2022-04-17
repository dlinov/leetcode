package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task208Spec extends AnyWordSpec with Matchers {
  private val task = new Task208ImplementTriePrefixTree
  private type Trie = task.Trie

  "Task 208, Implement Trie (Prefix Tree)" should {
    "provide correct implementation of Trie" in {
      val trie = new Trie()
      trie.insert("apple")
      trie.search("apple") should be (true)
      trie.search("app") should be (false)
      trie.startsWith("app") should be (true)
      trie.insert("app")
      trie.search("app") should be (true)
    }
  }
}
