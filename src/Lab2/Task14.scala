package Lab2

import scala.io.StdIn._
object Task14 {
  def main(args: Array[String]): Unit={
    var N: Int = readInt()
    var sumSq = N * (N + 1) * (2 * N + 1)/6
    println(sumSq)
  }
}
