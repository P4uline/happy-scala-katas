package fr.happy.scala.katas.fizzbuzz

import org.scalatest.Inspectors.forAll
import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.should.Matchers

class FizzBuzzSpec extends AsyncFlatSpec with Matchers {

  "A fizzbuzz" should "return fizz when the parameter is a multiple of 3" in {
    val multiplesOf3 = for (n <- intRange.filter(_ % 5 != 0)) yield 3 * n
    forAll(multiplesOf3) { (n) => FizzBuzz.runWith(n) should be("fizz") }
  }

  it should "return buzz when the parameter is a multiple of 5" in {
    val multiplesOf5 = for (n <- intRange.filter(_ % 3 != 0)) yield 5 * n
    forAll(multiplesOf5) { (n) => FizzBuzz.runWith(n) should be("buzz") }
  }

  it should "return fizzbuzz when the parameter is a multiple of 3 and 5" in {
    val multiplesOf3And5 = for (n <- intRange) yield 3 * 5 * n
    forAll(multiplesOf3And5) { (n) =>
      FizzBuzz.runWith(n) should be("fizzbuzz")
    }
  }

  private def intRange: List[Int] = (-1000 to 1000).toList
}
