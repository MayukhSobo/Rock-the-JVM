package lectures.basics

object CallByFunction extends App {

  def callByValue(x: Long): Unit = {
    println("By Value: " + x)
    println("By Value: " + x)
  }

  // Here because of this => the reference of the variable is passed
  def callByName(x: => Long): Unit = {
    println("By Name: " + x)
    println("By Name: " + x)
  }

  callByValue(System.nanoTime()) // This prints the same number twice
  callByName(System.nanoTime()) // This doesn't because the expression
                                // is passed and evaluated two time.

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//  printFirst(infinite(), 34) // This crashes because infinite(..) is being called forever
  printFirst(34, infinite()) // This doesn't crash but prints 34 because we used =>, forever(..)
                             // is not executed but rather the expression is passed and before it
                             // can be used in anyway, the printFirst(..) exits the execution.
}
