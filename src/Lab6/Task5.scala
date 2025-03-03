package Lab6

import scala.io.StdIn._
object Task5 {
  def main(args: Array[String]): Unit = {
    print("Count of words to store: ")
    var count: Int = readInt()
    var words = new Array[String](count)

    var i = 0
    while (i < count){
      words(i) = readLine()
      i += 1
    }

    i = 0
    var len = 0
    while (i < count) {
      println(words(i).toUpperCase)
      len += words(i).length
      i += 1
    }
    println(f"Average length of words is: ${(len + 0.0)/count}")
  }
}
