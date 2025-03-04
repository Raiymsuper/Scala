import scala.io.StdIn._
object Task10 {
  def main(args: Array[String]): Unit={
    print("Year of birth: ")
    var year: Int = readInt()
    var yearsList = for (x <- (year to 2025).toArray) yield x
    println(yearsList.mkString(" "))
  }
}
