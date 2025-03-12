package Week13

object Task1 {
  def add(x: Int)(y: Int): Int = x + y

  def main(args: Array[String]): Unit={
    (1 to 10).map(add(2)).foreach(println(_))
  }
}
