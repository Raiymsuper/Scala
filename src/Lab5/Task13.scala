package Lab5

import scala.io.StdIn.*

object Task13 {
  def main(args: Array[String]): Unit = {
    print("Select how many units for the base and height of the triangle? ")
    var baseHeight = readInt()

    println()

    while (baseHeight >= 1) {

      var col: Int = 1

      while (col <= baseHeight) {
        print("* ")
        col += 1
      }

      print("\n")
      baseHeight -= 1
    }
  }
}
