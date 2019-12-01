package io.github.dlinov.leetcode1k

import org.scalatest.Assertion
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task1143Spec extends AnyWordSpec with Matchers {
    private val task = new Task1143LongestCommonSubsequence()
    private val longText1 = "abcdefghij" * 100
    private val longText2 = "abcdefghij" * 100

    "Task 1143, Longest Common Subsequence" must {
        "return 3 for text1 = \"abcde\", text2 = \"ace\"" in {
            test("abcde", "ace", 3)
        }

        "return 3 for text1 = \"abc\", text2 = \"abc\"" in {
            test("abc", "abc", 3)
        }

        "return 0 for text1 = \"abc\", text2 = \"def\"" in {
            test("abc", "def", 0)
        }

        "return 1000 for two same long strings" in {
            test(longText1, longText2, 1000)
        }

        "return 0 for two empty strings" in {
            test("", "", 0)
        }

        "return 0 for \"abc\" and \"\"" in {
            test("abc", "", 0)
        }
    }

    private def test(text1: String, text2: String, expected: Int): Assertion = {
        val solver = new task.Solution()
        solver.longestCommonSubsequence(text1, text2) should be(expected)
    }
}