import scala.io.StdIn._
object Task12 {
  def main(args: Array[String]): Unit={
    var sentence = readLine()
    var shift = readInt()
    var ceaser = for (x <- sentence) yield{
      x.toLower
      (x.toInt + shift).toChar
    }
    print(ceaser)
  }
}
