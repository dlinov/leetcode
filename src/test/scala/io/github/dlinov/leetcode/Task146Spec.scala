package io.github.dlinov.leetcode

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class Task146Spec extends AnyWordSpec with Matchers {
  private val task = new Task146LRUCache()

  "Task 146, LRU Cache" must {
    "pass cmd sequence #1" in {
      val cmds = Array("LRUCache","put","put","get","put","get","put","get","get","get")
      val arg = "[2],[1,1],[2,2],[1],[3,3],[2],[4,4],[1],[3],[4]"
      test(cmds, arg, "[null,null,null,1,null,-1,null,-1,3,4]")
    }

    "pass cmd sequence #2" in {
      val cmds = Array("LRUCache","put","put","get","get","put","get","put","get","get","get")
      val arg = "[2],[1,1],[2,2],[1],[2],[3,3],[2],[4,4],[1],[3],[4]"
      test(cmds, arg, "[null,null,null,1,2,null,2,null,-1,-1,4]")
    }
  }

  private def test(cmds: Array[String], arg: String, expected: String) = {
    val args = arg.split("\\],\\[").map(s => s.replace("[", "").replace("]", ""))
    val actual = cmds.zip(args).foldLeft(Option.empty[task.LRUCache] -> Vector.empty[String]) {
      case ((_, output), ("LRUCache", capacity)) =>
        Some(new task.LRUCache(capacity.toInt)) -> (output :+ "null")
      case ((someCache @ Some(cache), output), ("get", arg)) =>
        someCache -> (output :+ cache.get(arg.toInt).toString)
      case ((someCache, output), ("put", arg)) =>
        val kv = arg.split(",").map(_.toInt)
        val (k, v) = (kv(0), kv(1))
        someCache.map(c => {c.put(k, v); c}) -> (output :+ "null")
      case _ =>
        throw new IllegalArgumentException
    }._2.mkString("[", ",", "]")
    actual should be(expected)
  }
}
