package io.github.dlinov.leetcode1k

import org.scalatest._

class Task1115Spec extends WordSpec with Matchers {
    private val s = new Task1115PrintFooBarAlternately()

    "Task 1115, Print FooBar Alternately" must {
        "print 'foobar' once" in {
            test(1)
        }

        "print 'foobar' 10 times" in {
            test(10)
        }

        "print 'foobar' 1000 times" in {
            test(1000)
        }

        "print nothing" in {
            test(0)
        }
    }

    def test(n: Int): Assertion = {
        val sb = new StringBuilder()
        val fb = new s.FooBar(n)
        val t1 = new Thread(new Runnable {
            override def run(): Unit = fb.foo(new java.lang.Runnable {
                override def run(): Unit = sb.append("foo");
            })
        })
        val t2 = new Thread(new Runnable {
            override def run(): Unit = fb.bar(new java.lang.Runnable {
                override def run(): Unit = sb.append("bar");
            })
        })
        t2.start();
        t1.start();
        t1.join();
        t2.join();
        sb.toString() should be("foobar" * n)
    }
}