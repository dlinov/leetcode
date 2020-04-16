package io.github.dlinov.leetcode1k

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task1410Spec extends AnyWordSpec with Matchers {
  val x = """
  HTML entity parser is the parser that takes HTML code as input and replace all the entities of the special characters by the characters itself.

  The special characters and their entities for HTML are:

  Quotation Mark: the entity is &quot; and symbol character is ".
  Single Quote Mark: the entity is &apos; and symbol character is '.
  Ampersand: the entity is &amp; and symbol character is &.
  Greater Than Sign: the entity is &gt; and symbol character is >.
  Less Than Sign: the entity is &lt; and symbol character is <.
  Slash: the entity is &frasl; and symbol character is /.
  Given the input text string to the HTML parser, you have to implement the entity parser.

  Return the text after replacing the entities by the special characters.

  

  Example 1:

  Input: text = "&amp; is an HTML entity but &ambassador; is not."
  Output: "& is an HTML entity but &ambassador; is not."
  Explanation: The parser will replace the &amp; entity by &
  Example 2:

  Input: text = "and I quote: &quot;...&quot;"
  Output: "and I quote: \"...\""
  Example 3:

  Input: text = "Stay home! Practice on Leetcode :)"
  Output: "Stay home! Practice on Leetcode :)"
  Example 4:

  Input: text = "x &gt; y &amp;&amp; x &lt; y is always false"
  Output: "x > y && x < y is always false"
  Example 5:

  Input: text = "leetcode.com&frasl;problemset&frasl;all"
  Output: "leetcode.com/problemset/all"
  

  Constraints:

  1 <= text.length <= 10^5
  The string may contain any possible characters out of all the 256 ASCII characters.
  """

  "Task 1410, HTML Tag Parser" must {
    val task = new Task1410HTMLEntityParser()
    val solution = new task.Solution()

    def test(input: String, expectedOutput: String) = {
      val actual = solution.entityParser(input)
      actual should be (expectedOutput)
    }
    
    """convert #1""" in {
      test("&amp; is an HTML entity but &ambassador; is not.", "& is an HTML entity but &ambassador; is not.")
    }
    
    """convert #2""" in {
      test("and I quote: &quot;...&quot;", "and I quote: \"...\"")
    }
    
    """convert #3""" in {
      test("Stay home! Practice on Leetcode :)", "Stay home! Practice on Leetcode :)")
    }
    
    """convert #4""" in {
      test("x &gt; y &amp;&amp; x &lt; y is always false", "x > y && x < y is always false")
    }
    
    """convert #5""" in {
      test("leetcode.com&frasl;problemset&frasl;all", "leetcode.com/problemset/all")
    }

  }
}
