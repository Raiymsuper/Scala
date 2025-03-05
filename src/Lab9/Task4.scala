package Lab9

import scala.math.sqrt

object Task4 {
  def prime(x: Long): Boolean = {
    if (x < 2) return false
    for (i <- 2 to sqrt(x).toInt) {
      if (x % i == 0) {
        return false
      }
    }
    true
  }
  def perfect(x: Long): Boolean = {
    var sum = 0
    if (x < 2) return false
    for (i <- 1 until x.toInt) {
      if (x % i == 0) {
        sum = sum + i
      }
    }
    if (sum == x.toInt){
      return true
    } else {
      return false
    }
  }
  def digitToWord(x: Int): String ={
    var result = x match{
      case 0 => "Zero"
      case 1 => "One"
      case 2 => "Two"
      case 3 => "Three"
      case 4 => "Four"
      case 5 => "Five"
      case 6 => "Six"
      case 7 => "Seven"
      case 8 => "Eight"
      case 9 => "Nine"
      case _ => "bad digit"
    }
    return result
  }

  def wordToDigit(x: String): Int = {
    var result = x match {
      case "Zero" => 0
      case "One" => 1
      case "Two" => 2
      case "Three" => 3
      case "Four" => 4
      case "Five" => 5
      case "Six" => 6
      case "Seven" => 7
      case "Eight" => 8
      case "Nine" => 9
      case _ => -1
    }
    return result
  }

  def leapYear(x: Int): Boolean = {
    if (x % 400 == 0){
      return true
    } else if (x % 100 == 0){
      return false
    } else if (x % 4 == 0){
      return true
    } else{
      return false
    }
  }


  def main(args: Array[String]): Unit = {
    println(prime(17)) // true
    println(prime(18)) // false
    println(prime(1)) // false
    println(prime(2)) // true
    println(prime(29)) // true
    println(prime(99)) // false

    println("")
    println(perfect(6))

    println("")
    println(digitToWord(1))
    println(digitToWord(2))
    println(digitToWord(3))
    println(digitToWord(4))
    println(digitToWord(5))
    println(digitToWord(6))
    println(digitToWord(7))
    println(digitToWord(8))
    println(digitToWord(9))
    println(digitToWord(10))

    println("")
    println(wordToDigit("One"))

    println("")
    println(leapYear(1600))
    println(leapYear(1625))
    println(leapYear(1604))
    println(leapYear(1614))
  }
}