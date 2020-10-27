package lectures.basics

object ValuesVariablesTypes extends App {

  // Types

  /*
   1. Variables created with val are constant and
   hence once declared, they can not be reassigned

   2. The types of variables are not mandatory to use.
    hence the following line can be used as
    val x = 42
  */

  val x: Int = 42
  println(x)
  // x = 5 <-- this shall throw error because x is constant

  val name: String = "Mayukh Sarkar"
  println(name)

  val isTrue: Boolean = true
  println(isTrue)

  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 2314
  val aLong: Long = 3252342442355L
  val aFloat: Float = 3.14f
  val aDouble: Double = 24.4232


  // Variables
  /*
   1. Unlike val, variables represented by var, can be used to reassign values as
   these are not constant.
   */
  var y: Int = 7
  y = 67
}
