package Lab5

import scala.io.StdIn._

object Task4 {
  def main(args: Array[String]): Unit = {
    println("Start character? ")
    var start: Char = readChar()

    println("End character? ")
    var end: Char = readChar()

    if (start <= end) {
      while (start <= end) {
        print(start + " ")
        start = (start + 1).toChar
      }
    } else {
      while (end <= start) {
        print(start + " ")
        start = (start - 1).toChar
      }
    }
  }
}