package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task468Spec extends AnyWordSpec with Matchers {
  "Task 468, Validate IP Address" must {
    val task = new Task468ValidateIPAddress()
    val s = new task.Solution()
    
    "return 'IPv4' for '172.16.254.1'" in {
      test("172.16.254.1", "IPv4")
    }

    "return 'Neither' for '172.16.254.01'" in {
      test("172.16.254.01", "Neither")
    }

    "return 'IPv4' for '192.0.0.1'" in {
      test("192.0.0.1", "IPv4")
    }

    "return 'IPv6' for '2001:0db8:85a3:0:0:8A2E:0370:7334'" in {
      test("2001:0db8:85a3:0:0:8A2E:0370:7334", "IPv6")
    }

    "return 'Neither' for '256.256.256.256'" in {
      test("256.256.256.256", "Neither")
    }

    "return 'Neither' for '02001:0db8:85a3:0000:0000:8a2e:0370:733'" in {
      test("02001:0db8:85a3:0000:0000:8a2e:0370:733", "Neither")
    }

    "return 'Neither' for '2001:0db8:85a3::8A2E:0370:7334'" in {
      test("2001:0db8:85a3::8A2E:0370:7334", "Neither")
    }

    "return 'Neither' for '2001:0db8:85a3:0:0:8A2E:0370:7334:'" in {
      test("2001:0db8:85a3:0:0:8A2E:0370:7334:", "Neither")
    }

    "return 'Neither' for '1081:db8:85a3:01:-0:8A2E:0370:7334'" in {
      test("1081:db8:85a3:01:-0:8A2E:0370:7334", "Neither")
    }

    def test(input: String, expectedOutput: String) = {
      val actual = s.validIPAddress(input)
      actual should be (expectedOutput)
    }
  }
}
