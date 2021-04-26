package fr.happy.scala.katas.fizzbuzz

object FizzBuzz {
  def runWith(i: Int): String = {
    if (((i % 3) == 0) && ((i % 5) == 0)) {
      "fizzbuzz"
    } else if (i % 3 == 0) {
      "fizz"
    } else if (i % 5 == 0) {
      "buzz"
    } else {
      i.toString
    }
  }
}
