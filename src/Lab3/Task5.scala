package Lab3

import scala.io.StdIn._
object Task5 {
  def main(args: Array[String]): Unit = {
    print("Write your name: ")
    var name: String = readLine()
    var space: Int = name.indexOf(" ")
    println(f"Hello ${name.charAt(0) + "" + name.charAt(space+1)}")
    println(f"Your email ${name.substring(0, space).toLowerCase() + "." + name.substring(space + 1).toLowerCase()}@email.dmu.ac.uk.")
  }
}
