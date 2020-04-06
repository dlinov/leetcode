package io.github.dlinov.leetcode

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class Task091Spec extends AnyWordSpec with Matchers {
    "Task 91, Decode Ways" must {
        val task = new Task091DecodeWays()
        val s = new task.Solution();
        
        "return 0 for 0" in {
            s.numDecodings("0") should be (0)
        }
        
        "return 2 for 12" in {
            s.numDecodings("12") should be (2)
        }

        "return 0 for 01" in {
            s.numDecodings("01") should be (0)
        }

        "return 0 for 012" in {
            s.numDecodings("012") should be (0)
        }

        "return 1 for 10" in {
            s.numDecodings("10") should be (1)
        }

         "return 3 for 226" in {
            s.numDecodings("226") should be (3)
        }

         "return 3 for 1234" in {
            s.numDecodings("1234") should be (3)
        }

         "return 3 for 12341" in {
            s.numDecodings("12341") should be (3)
        }

         "return 6 for 123412" in {
            s.numDecodings("123412") should be (6)
        }

         "return 9 for 1234123" in {
            s.numDecodings("1234123") should be (9)
        }

         "return 9 for 12341234" in {
            s.numDecodings("12341234") should be (9)
        }
    }
}