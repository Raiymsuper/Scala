import scala.io.StdIn._
object Task6 {
  def main(args: Array[String]): Unit = {
    var ln = readInt()
    var nums = new Array[Int](ln)

    for (i <- nums.indices) {
      nums(i) = readInt()
    }

    for (x <- nums) {
      print(x + " ")
    }
  }
}
