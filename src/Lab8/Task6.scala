package Lab8

import scala.io.StdIn._
object Task6 {
  def main(args: Array[String]): Unit={
    var words = new Array[String](5)
    for (i <- 0 until 5){
      words(i) = readLine()
    }
    var chars = new Array[Char](5)
    for (i <- 0 until 5) {
      chars(i) = readChar()
    }

//    var wordsFiltered =
    words.filter(x => chars.contains(x.charAt(0))).foreach(println(_))
  }
}
