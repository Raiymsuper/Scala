package Lab2

import scala.io.StdIn._
object Task13 {
  def main(args: Array[String]): Unit={
    var x: Boolean = readBoolean()
    var y: Boolean = readBoolean()

    println("" + x + " AND " + y + " is " + (x && y))
    println("" + x + " OR " + y + " is " + (x || y))
  }
}