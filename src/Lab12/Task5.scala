package Lab11

object Task5 {
  def sumFromTo(a: Int, b: Int): Int = {
    if (a > b){
      0
    } else {
      a + sumFromTo(a + 1, b)
    }
  }

  def main(args: Array[String]): Unit={
    print(sumFromTo(2, 5))
  }
}
