package Lab2
import scala.io.StdIn._

object Task2 {
  def main(args: Array[String]): Unit={
    print("Enter your first number ")
    var x: Int = readInt()
    print("Enter your second number ")
    var y: Int = readInt()
    println(x + " * " + y + " = " + (x * y))
  }
}
