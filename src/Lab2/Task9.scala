package Lab2

import scala.io.StdIn._
object Task9 {
  def main(args: Array[String]): Unit ={
    var initial: Int = readInt()
    var acceleration: Int = readInt()
    var time: Int = readInt()
    var finalSpeed: Int = initial + acceleration * time
    print(finalSpeed)
  }
}
