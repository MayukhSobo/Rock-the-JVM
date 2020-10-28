package exercises

// Exercise 1 //
class Writer(val fName: String, val lName: String, val year: Int) {
  def fullName: String = s"${this.fName} ${this.lName}"
}
class Novel(val name: String, val year: Int, val author: Writer) {
  def authorAge: Int = this.year - this.author.year

  def isWrittenBy(author: Writer): Boolean =
    author == this.author

  def copy(year: Int): Novel = new Novel(this.name, year, this.author)
}

// Exercise 2 //

class Counter(n: Int) {
  def count: Int = n
  def increment: Counter = new Counter(this.n+1)
  def decrement: Counter = new Counter(this.n-1)

  // TODO: Replace the following overloading with recursion
  def increment(amount: Int): Counter = new Counter(this.n+amount)
  def decrement(amount: Int): Counter = new Counter(this.n-amount)
}

object Oop extends App {
  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(imposter))
}
