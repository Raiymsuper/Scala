package Lab5

import scala.io.StdIn._
object Task10 {
  def main(args: Array[String]): Unit={
    println("Select how many units for the height of the rectangle? ")
    var height: Int = readInt()
    println("Select how many units for the height of the rectangle? ")
    var width: Int = readInt()
    var row = 1
    while (row <= height){
      println("* " * width)
      row += 1
    }

  }
}
