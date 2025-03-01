package Lab4

import scala.io.StdIn._
object Task5 {
  def main(args: Array[String]): Unit={
    var a: Int = readInt()
    var b: Int = readInt()
    var c: Int = readInt()
    var f_con: Boolean = c == a + b
    var s_con: Boolean = a == c + b
    var t_con: Boolean = b == a + c

    var result = if (f_con || s_con || t_con){
      "Yes"
    } else {
      "No"
    }

    println(result)
  }
}
