package Lab2

import scala.io.StdIn._

object Task1 {
  def main(args: Array[String]): Unit={
    print("Enter a number ")
    var x: Int = readInt()

    println("You entered " + x)
    println("Your number squared is " + (x * x))
  }
}
