package Lab5

import scala.io.StdIn._
object Task5 {
  def main(args: Array[String]): Unit={
    var xs: List[Int] = List()

    print("First number? ")
    var num = readInt()

    while (num >= 0) {
      xs = xs :+ num

      print("Another number? ")
      num = readInt()
    }

    xs.foreach(x => print(x + " "))
  }
}
