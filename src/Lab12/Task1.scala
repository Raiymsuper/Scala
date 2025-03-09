package Lab12

object Task1 {
  def rFib(n: Int): Int={
    if (n < 1){
      return n
    }
    rFib(n-1) + rFib(n-2)
  }

  def main(args: Array[String]): Unit={
    println(-rFib(9))
  }
}
