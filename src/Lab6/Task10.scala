package Lab6

import scala.io.StdIn._

object Task10 {
  def main(args: Array[String]): Unit={
    println("Rows? ")
    var rows = readInt();

    println("Cols? ")
    var cols = readInt()

    var table = Array.ofDim[Int](rows, cols)
    var i = 0
    var j = 0

    while (i < table.length) { //could be i < rows
      j = 0
      while (j < table(i).length) { //could be j < cols
        table(i)(j) = (i + 1) * (j + 1)
        j += 1
      }
      i += 1
    }


    i = 0

    while (i < table.length) {
      var j = 0
      while (j < table(i).length) {
        print(f"${table(i)(j)}%4d")
        j += 1
      }
      print("\n")
      i += 1
    }
  }
}
