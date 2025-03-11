package Lab11

object Task1 {
  def countTo10(n: Int): Unit={
    print(s"$n ")
    if (n==10){
      print("Stopped")
    } else {
      countTo10(n + 1)
    }
  }

  def main(args: Array[String]): Unit={
    countTo10(1)
    println("")
    countTo10(-10)
    println("")
    countTo10(5)
  }
}
