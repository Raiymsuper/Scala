package Lab2

import scala.io.StdIn._

object Task3 {
  def main(args: Array[String]): Unit={
    var firstName: String = readLine("Enter your firs name ")

    var lastName: String = readLine("Enter your last name ")
    var title: String = readLine("Enter your title ")

    println("Your name is " + title + " " + firstName + " " + lastName)
  }
}
