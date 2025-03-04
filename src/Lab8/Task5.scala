package Lab8

import scala.io.StdIn._
object Task5 {
  def main(args: Array[String]): Unit={
    var year = readInt()
    (year to 2025).filter( _%4 != 0).foreach(x => print(x + " "))
  }
}
