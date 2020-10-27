package lectures.basics

import scala.annotation.tailrec

object Recursions extends App {
  def factorial(n: Int): Int = {
    if (n <= 2) n
    else n * factorial(n - 1)
  }

  def factorialImproved(n: Int): BigInt = {
    @tailrec
    def _factorial(x: Int, acc: BigInt): BigInt = {
      if (x <= 1) acc
      else _factorial(x - 1, acc * x)
    }

    _factorial(n, 1)
  }

  //  println(factorial(5))
  println(factorialImproved(100))
}
