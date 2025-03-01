package Lab4

import scala.io.StdIn._
object Task9 {
  def main(args: Array[String]): Unit = {
    var course = readInt()
    var exam = readInt()
    var overall: Double = (course + exam)/2.0
    var result = if ( overall >= 40 && course >=40 && exam >= 40){
      "passed"
    } else {
      if (course < 40){
        "Resit Coursework"
      } else {
        "Resit Examination"
      }
    }

    println(result)
  }
}
