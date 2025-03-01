package Lab4

import scala.io.StdIn._
object Task4 {
  def main(args: Array[String]): Unit={
    print("Write your number ")
    var number: Int = readInt()
    var result = if (number == 0){
      "Zero"
    } else if (number == 1){
      "One"
    } else if (number == 2){
      "Two"
    } else if (number == 3){
      "Three"
    } else if (number == 4){
      "Four"
    } else if (number == 5){
      "Five"
    } else if (number == 6){
      "Six"
    } else if (number == 7){
      "Seven"
    } else if (number == 8){
      "Eight"
    } else if (number == 9){
      "Nine"
    } else {
      "out of bounds"
    }
    println("Your number is " + result)
  }
}
