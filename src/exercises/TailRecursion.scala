package exercises

import scala.annotation.tailrec

object TailRecursion extends App {
  /*
   Tail Recursive functions can use a large number as an input
   without getting into StackOverflow exception. Hence all the following
   examples should have a very large output size.

     1. Concatenate a string n times
     2. IsPrime function.
     3. Fibonacci function.
   */

  def concat(base: String, times: Int): String = {
    @tailrec
    def _concat(n: Int, acc: String): String =
      if (n == times) acc
      else _concat(n + 1, acc + base)

    _concat(0, "")
  }

  def isPrime(n: BigInt): Boolean = {
    @tailrec
    def _isPrime(factor: BigInt, acc: Boolean): Boolean = {
      if (factor * factor >= n) acc
      else if (n % factor == 0) false
      else _isPrime(factor + 1, acc = true)
    }

    _isPrime(2, acc = false)
  }

  def fibonacci(n: Int): Int = {
    @tailrec
    def _fibonacci(n: Int, prev: Int, acc: Int): Int = {
      if (n <= 2) acc
      else _fibonacci(n - 1, acc, prev + acc)
    }

    _fibonacci(n, 1, 1)
  }

  //  println(concat("Mayukh ", 10))
  println(isPrime(1943532342))
  //  println(fibonacci(6)) // 1 1 2 3 5 8
}
