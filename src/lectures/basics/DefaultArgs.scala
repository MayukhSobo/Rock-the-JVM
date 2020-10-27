package lectures.basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  def factorial(n: Int, acc: BigInt=1): BigInt =
    if (n <= 2) acc
    else factorial(n-1, n*acc)

  println(factorial(10)) // This is a default value of acc
  println(factorial(10, 2)) // This uses the default value of 2

  /*
  But the default values should always be at the end like Python
                          or
  You can use keyword arguments also like Python
   */
}

