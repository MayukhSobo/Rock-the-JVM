package lectures.basics

object Expressions extends App {
  val x = 1 + 2
  println(x)
  println(2 + 3 * 4)
  println(1 == x) // !=, ==, >, <, <=, >=
  println(!(1 == x))

  var y = 2
  y += 1 // y -= 5
  println(y)

  val cond = true
  val vCond = if (cond) 5 else 3
  println(vCond)

  /*
    1. There are loops in Scala but using loops is highly discouraged.

    2. It is recommended to use functional constructs instead of loops.

    3. Loops are imperative programming not functional or expressive.
  */

  // For example NEVER do this. Ok in Java or C++ but not in Scala
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Everything is EXPRESSION in Scala
  val aWeirdValue = (y = 1)
  println(aWeirdValue)

  // Side Effects: println(..), while(..), reassigning, for(..)


  // Code Blocks

  // Even a code block is also an expression
  // Everything inside the code block is visible only inside the code block
  val block = {
    val y = 2
    val z = y + 1
    if (z < 2) "Hello" else "Hi"
  }
  println(block)

}
