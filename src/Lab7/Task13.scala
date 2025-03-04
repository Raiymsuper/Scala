import scala.io.StdIn._
object Task13 {
  def main(args: Array[String]): Unit={
    val height = readInt()
    val width = readInt()
    println()

    for (row <- 1 to height) {
      for (col <- 1 to width) {
        print("* ")
      }
      print("\n")
    }
  }
}
