package Lab5

import scala.io.StdIn.readInt

object Task14 {
  def main(args: Array[String]): Unit={
    print("Select how many units for the base and height of the triangle? ")
    var baseHeight = readInt()

    println()

    var row = 1

    while (baseHeight >= 1) {

      var col: Int = 1

      println("  "*baseHeight + "* "*row)

      baseHeight -= 1
      row +=1
    }
  }
}
