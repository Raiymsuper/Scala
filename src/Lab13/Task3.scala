package Week13

object Task3 {
  def wLen(a: Int)(b: String): Boolean = a == b.length

  def main(args: Array[String]): Unit = {
    // Filtering words that have a length of 5 using wLen
    List("apple", "pear", "banana", "peach")
      .filter(x => wLen(5)(x))
      .foreach(println)
  }
}
