package io.github.dlinov.leetcode1k

import org.scalatest._

class Task1116Spec extends WordSpec with Matchers {
    private val s = new Task1116PrintZeroEvenOdd()

    "Task 1116, Print Zero Even Odd" must {
        "print '0102' for n = 2" in {
            test(2)
        }

        "print '0102030405' for n = 5" in {
            test(5)
        }

        "print '010203040506070809' for n = 9" in {
            test(9)
        }
    }

    def test(n: Int): Assertion = {
        val sb = new StringBuilder()
        val p = new s.ZeroEvenOdd(n)
        val t1 = new Thread(new Runnable {
            override def run(): Unit = p.zero(x => sb.append(Integer.toString(x)));
        })
        val t2 = new Thread(new Runnable {
            override def run(): Unit = p.even(x => sb.append(Integer.toString(x)));
        })
        val t3 = new Thread(new Runnable {
            override def run(): Unit = p.odd(x => sb.append(Integer.toString(x)));
        })
        t3.start();
        t2.start();
        t1.start();
        t1.join();
        t2.join();
        t3.join();
        sb.toString() should be(scalaSolution(n))
    }

    def scalaSolution(n: Int): String = (1 to n).map(x => s"0$x").reduce(_ + _)
}