package Lab5

import scala.io.StdIn._
object Task6 {
  def main(args: Array[String]): Unit={
    var xs: List[Float] = List()

    print("First number? ")
    var num = readFloat()

    while (num >= 0) {
      xs = xs :+ num

      print("Another number? ")
      num = readFloat()
    }
    var sumn: Float = 0.0
    xs.foreach(x => (sumn += x))
    println(f"$sumn%2.2f")
  }
}
