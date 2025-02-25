package Lab2

import scala.io.StdIn._
object Task10 {
  def main(args: Array[String]): Unit={
    var N: Int = readInt()
    var summ: Int = N * (N + 1)/2
    print(summ)
  }
}
