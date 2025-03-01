package Lab4

import scala.io.StdIn._
object Task2 {
  def main(args: Array[String]): Unit={
    println("Type in a number ")
    var number: Int = readInt()

    var result = if (number % 2 == 0)
      "even"
    else
      "odd"

    println("Your number is " + result)

    /*
    b) Extend the program to also include an if-else statement that checks whether the number input is greater than
    zero and then prints out a message as to whether it is positive or not accordingly.
     */
    var result1 = if (number > 0)
      "positive"
    else
      "negative"

    println("Your number is " + result1)
    
  }
}
