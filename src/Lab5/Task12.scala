package Lab5

import scala.io.StdIn.*

object Task12 {
  def main(args: Array[String]): Unit={
    var values:Array[Int] = new Array[Int](5)
    print("Select how many units for the base and height of the triangle? ")
    val baseHeight = readInt()

    println()

    var row: Int = 1

    while (row <= baseHeight) {

      var col: Int = 1

      while (col <= row) {
        print("* ")
        col += 1
      }

      print("\n")
      row += 1
    }
  }
}