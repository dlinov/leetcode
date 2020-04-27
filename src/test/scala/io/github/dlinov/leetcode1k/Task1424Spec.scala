package io.github.dlinov.leetcode1k

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import java.{util => ju}

class Task1424Spec extends AnyWordSpec with Matchers {
  private val t = new Task1424DiagonalTraverseII
  private val s = new t.Solution

  "Task 3, Diagonal Traverse II" must {
    "return [1,4,2,7,5,3,8,6,9] for [[1,2,3],[4,5,6],[7,8,9]]" in {
      val listOfLists = ju.Arrays.asList(
        ju.Arrays.asList[Integer](1,2,3),
        ju.Arrays.asList[Integer](4,5,6),
        ju.Arrays.asList[Integer](7,8,9)
      )
      val expected = Array(1,4,2,7,5,3,8,6,9)
      s.findDiagonalOrder(listOfLists) should be(expected)
    }
    
    "return [1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16] for [[1,2,3,4,5],[6,7],[8],[9,10,11],[12,13,14,15,16]]" in {
      val listOfLists = ju.Arrays.asList(
        ju.Arrays.asList[Integer](1,2,3,4,5),
        ju.Arrays.asList[Integer](6,7),
        ju.Arrays.asList[Integer](8),
        ju.Arrays.asList[Integer](9,10,11),
        ju.Arrays.asList[Integer](12,13,14,15,16),
      )
      val expected = Array(1,6,2,8,7,3,9,4,12,10,5,13,11,14,15,16)
      s.findDiagonalOrder(listOfLists) should be(expected)
    }
    
    "return [1,4,2,5,3,8,6,9,7,10,11] for [[1,2,3],[4],[5,6,7],[8],[9,10,11]]" in {
      val listOfLists = ju.Arrays.asList(
        ju.Arrays.asList[Integer](1,2,3),
        ju.Arrays.asList[Integer](4),
        ju.Arrays.asList[Integer](5,6,7),
        ju.Arrays.asList[Integer](8),
        ju.Arrays.asList[Integer](9,10,11),
      )
      val expected = Array(1,4,2,5,3,8,6,9,7,10,11)
      s.findDiagonalOrder(listOfLists) should be(expected)
    }
    
    "return [1,2,3,4,5,6] for [[1,2,3,4,5,6]]" in {
      val listOfLists = ju.Arrays.asList(
        ju.Arrays.asList[Integer](1,2,3,4,5,6)
      )
      val expected = Array(1,2,3,4,5,6)
      s.findDiagonalOrder(listOfLists) should be(expected)
    }

    "iterate through very long sparse matrix in a reasonable time" in {
      val singleton = new ju.LinkedList[Integer]()
      singleton.add(1);
      val longRow = new ju.LinkedList[Integer]()
      val tenK = 1 until 10000
      tenK.foreach(i => longRow.add(i))
      val listOfLists = new ju.LinkedList[ju.List[Integer]]()
      tenK.foreach(_ => listOfLists.add(singleton))
      listOfLists.add(longRow)
      val expected: Array[Integer] = new Array[Integer](tenK.size * 2)
      tenK.foreach { i =>
        expected(i - 1) = 1
        expected(tenK.size + i - 1) = i
      }
      s.findDiagonalOrder(listOfLists) should be(expected)
    }
  }
  
}
