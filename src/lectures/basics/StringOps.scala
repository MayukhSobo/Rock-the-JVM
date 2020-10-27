package lectures.basics

object StringOps extends App {
  val str: String = "Hello, I am learning Scala!!"

  // Adopted from Java
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)

  // Scala Only
  val aNumStr = "2"
  val num = aNumStr.toInt
  println('a' + aNumStr + 'z')
  println(str.reverse)

  // S-interpolators
  val name = "Mayukh"
  val age = 30
  val greeting = s"Hello my name is $name and I am $age years old"
  val greeting2 = s"Hello my name is $name and I shall be turning ${age+1} year old"
  println(greeting)
  println(greeting2)

  // F-interpolators (Just like Python)
  val speed = 1.23424f
  val myth = f"$name can eat $speed%2.2f burgers per minutes"
  println(myth)

  // raw-Interpolator
  println(raw"This is \n in your line") // \n is NOT escaped

}
