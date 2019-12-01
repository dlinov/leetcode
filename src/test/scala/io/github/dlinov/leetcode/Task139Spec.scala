package io.github.dlinov.leetcode

import java.util.Arrays;

import  org.scalatest.Assertion
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task139Spec extends AnyWordSpec with Matchers {
    private val task = new Task139WordBreak()

    "Task 139, Word Break" must {
        "segment leetcode with [leet, code]" in {
            test("leetcode", Arrays.asList("leet", "code"), true)
        }

        "segment applepenapple with [apple, pen]" in {
            test("applepenapple", Arrays.asList("apple", "pen"), true)
        }

        "don't segment catsandog with [cats, dog, sand, and, cat]" in {
            test("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"), false)
        }

        "segment long list of a's with different words consisting of a only" in {
            val s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
            val words = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")
            test(s, words, false)
        }
    }

    private def test(s: String, dict: java.util.List[String], expectedOutput: Boolean): Assertion = {
        val solver = new task.Solution()
        solver.wordBreak(s, dict) should be (expectedOutput)
    }
}