package lectures.oop

object OBasics extends App {
  val person = new Person("Mayukh", 30) // Create an instance of the class
  println(person.age) // This is how you access the class field
  person.greet("Maytree")
  person.greet()
}

class Person(name: String, val age: Int) { // Constructor
  // if val is not mentioned before age, it would class parameter not class field
  // and we shall not be able to access it.

  // Class body

  // Method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // Method Overloading
  def greet(): Unit = println(s"Hello this is ${this.name}")

  // Constructor Overloading (Mostly Unused and can be replaced with default parameters)
  def this(name: String) = this(name, 0)
}
