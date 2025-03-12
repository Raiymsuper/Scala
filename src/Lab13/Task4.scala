package Week13

object Task4 {
  def bracket(left: String)(right: String)(whatever: String) = left + whatever + right

  def main(args: Array[String]): Unit={
    var what = "hello world"
    print(bracket("( ")(" )")(what))
    List("Steve", "Bobby", "Tom", "John", "Bob").sortWith((x, y) => x.take(3).compareTo(y.take(3)) < 0).foreach(println)
  }
}
