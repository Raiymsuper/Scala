package Lab5

import scala.io.StdIn._
object Task9 {
  def main(args: Array[String]): Unit={
    val heightWidth = readInt()

    println()

    var row: Int = 1

    while (row <= heightWidth) {

      println("* " * heightWidth)
      row += 1
    }
  }
}
