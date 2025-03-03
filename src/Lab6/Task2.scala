package Lab6

import scala.io.StdIn._
object Task2 {
  def main(args: Array[String]): Unit = {
    var nums = new Array[String](5)

    var i = 0
    while (i < nums.length) {
      nums(i) = readLine()
      i += 1
    }

    i = 0
    while (i < nums.length) {
      print(nums(i) + " ")
      i += 1
    }
  }
}
