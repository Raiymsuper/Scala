package Lab2

import scala.io.StdIn._
object Task12 {
  def main(args: Array[String]): Unit={
    var x: Int = readInt()
    var y: Int = readInt()
    println(x + " < " + y + " is " + (x < y))
    println(x + " > " + y + " is " + (x > y))
    println(x + " <= " + y + " is " + (x <= y))
    println(x + " >= " + y + " is " + (x >= y))
    println(x + " == " + y + " is " + (x == y))
    println(x + " != " + y + " is " + (x != y))
  }
}
