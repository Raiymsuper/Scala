package Lab4

import scala.io.StdIn._
object Task7 {
  def main(args: Array[String]): Unit = {
    println("Type in a digit ")
    var digit: Char = readChar()

    var result = digit match {
      case '1' => "red"
      case '2' => "orange"
      case '3' => "yellow"
      case '4' => "green"
      case '5' => "blue"
      case '6' => "indigo"
      case '7' => "violet"
      case _ => "NOT VALID"
    }
    println(result)
  }
}
