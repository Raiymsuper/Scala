package Lab5

import scala.io.StdIn._
object Task2 {
  def main(args: Array[String]): Unit={
    var number: Int = readInt()
    var count: Int = 1
    while(count <= 12){
      println(f"$count * $number = ${count * number}")
      count += 1
    }
  }
}
