package Lab11

object Task4 {
  def factorial(n: Int): Int={
    if (n == 1){
      return n
    } else {
      return n * factorial(n-1)
    }
  }

  def main(args: Array[String]): Unit={
    print(factorial(5))
  }
}
