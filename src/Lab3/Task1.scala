package Lab3

import scala.io.StdIn._

object Task1 {
  def main(args: Array[String]): Unit={
    var xs: List[Int] = List()
    for (_ <- 0 until 5){
      println("Write number to add: ")
      xs = xs :+ readInt()
    }
    xs.foreach(println(_))
  }
}
