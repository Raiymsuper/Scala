package Lab2

import scala.io.StdIn.readInt

object Task15 {
  def main(args: Array[String]): Unit={
    var N: Int = readInt()
    var sumSq = N * N * (N * N + 2 * N + 1) / 4
    print(sumSq)
  }
}
