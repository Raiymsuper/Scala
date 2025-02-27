package Lab3

import scala.io.StdIn._
object Task6 {
  def main(args: Array[String]): Unit={
    var sentence: String = readLine().toLowerCase
    var word: Char = readChar()
    var shift: Int = readInt()
    var target: Char = ((word - 'a' + shift)%26 + 'a').toChar
    print(sentence.replace(word, target))
  }
}
