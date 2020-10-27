package lectures.basics

import scala.annotation.tailrec

object functions extends App {

  //  def greet(a: String, b: Int): String = {
  //    a + ' ' + b
  //  }
  //
  //  var res = greet("Mayukh", 2)
  //  println(res)
  //
  //  // This is how to replace loops in Scala
  //
  //  def greetRepeat(name: String, n: Int): String = {
  //    val msg = "Hello " + name + '\n'
  //    if (n == 1) msg
  //    else msg + greetRepeat(name, n - 1)
  //  }
  //
  //  println(greetRepeat("Mayukh", 5))
  //
  //  // Always use Recursion when there is a need of loops in Scala
  //
  //  def greetNameAge(name: String, age: Int): String = {
  //    "Hi! my name is " + name + " and I am " + age + " years old"
  //  }
  //
  //  println(greetNameAge("Mayukh", 30))

  def factorial(n: Int): Long = {
    if (n <= 2) n
    else n * factorial(n - 1)
  }

  //  println(factorial(6))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(4))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def _isPrime(factor: Int): Boolean = {
      if (n == 2) true
      else if (factor + 1 == n) true
      else if (n % factor == 0) false
      else _isPrime(factor + 1)
    }

    _isPrime(2)
  }

  //  println(isPrime(9))

}
