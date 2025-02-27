package Lab3

object Task4 {
  def main(args: Array[String]): Unit = {
    var s1: List[String] = List("Mary", "had", "a", "little", "lamb")
    s1.foreach(word => print(word.substring(0, 1).capitalize + " "))
  }
}
