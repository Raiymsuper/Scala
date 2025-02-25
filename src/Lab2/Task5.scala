package Lab2

import scala.io.StdIn._

object Task5 {
  def main(args: Array[String]): Unit={
    var initial: String = readLine()
    var houseNumber: Int = readInt()
    var address: String = readLine()
    var telephoneNumber: String = readLine()
    var salary: Int = readInt()
    print(initial + houseNumber + address + telephoneNumber + salary)
  }
}
