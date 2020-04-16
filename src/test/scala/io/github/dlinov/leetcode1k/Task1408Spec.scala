package io.github.dlinov.leetcode1k

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task1408Spec extends AnyWordSpec with Matchers {
  val x = """Given an array of string words. Return all strings in words which is substring of another word in any order. 

    String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].

    Example 1:

    Input: words = ["mass","as","hero","superhero"]
    Output: ["as","hero"]
    Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
    ["hero","as"] is also a valid answer.
    Example 2:

    Input: words = ["leetcode","et","code"]
    Output: ["et","code"]
    Explanation: "et", "code" are substring of "leetcode".
    Example 3:

    Input: words = ["blue","green","bu"]
    Output: []

    Constraints:

    1 <= words.length <= 100
    1 <= words[i].length <= 30
    words[i] contains only lowercase English letters.
    It's guaranteed that words[i] will be unique.

    """

  "Task 1408, String Matching in an Array" must {
    val task = new Task1408StringMatchingInAnArray()
    val solution = new task.Solution()

    def test(words: Array[String], expectedOutput: java.util.List[String]) = {
      val actual = solution.stringMatching(words)
      actual should be (expectedOutput)
    }
    
    """return ["as","hero"] for ["mass","as","hero","superhero"]""" in {
      test(Array("mass","as","hero","superhero"), java.util.Arrays.asList("as","hero"))
    }
    
    """return ["et","code"] for ["leetcode","et","code"]""" in {
      test(Array("leetcode","et","code"), java.util.Arrays.asList("et","code"))
    }
    
    """return [] for ["blue","green","bu"]""" in {
      test(Array("blue","green","bu"), java.util.Arrays.asList[String]())
    }
  }
}
