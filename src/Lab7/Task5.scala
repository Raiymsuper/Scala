import scala.io.StdIn._
object Task5 {
  def main(args: Array[String]): Unit={
    var a = readInt()
    for (x <- 1 to 12){
      println(f"$x%2d * $a = ${x*a}")
    }
  }
}
