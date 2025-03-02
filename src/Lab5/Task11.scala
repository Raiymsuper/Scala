package Lab5

import scala.io.StdIn._
object Task11 {
  def main(args: Array[String]): Unit={
    var n = readInt()
    var c = 0
    for (i <- 1 to n){
      for (j <- (1 + c) to (n + c)){
        print(f"$j%2d ")
      }
      print("\n")
      c += 1
    }
  }
}
