package Lab4

import scala.io.StdIn._
object Task3 {
  def main(args: Array[String]): Unit={
    println("Type in a number ")
    var number = readInt()

    var result = if (number > 0) {
      "positive"
    } else if (number < 0) {
      "negative"
    } else {
      "zero"
    }
    println("your number is " + result)
  }
}
