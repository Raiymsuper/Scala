package Lab2

import scala.io.StdIn._
object Task8 {
  def main(args: Array[String]): Unit = {
    var z: Int = readInt()
    var y: Int = readInt()
    println(z + " + " + y + " = " + (z + y))
    println(z + " x " + y + " = " + (z * y))
    println(z + " - " + y + " = " + (z - y))
    println(z + "^2 + " + y + "^2 = " + (z*z + y*y))
  }
}
