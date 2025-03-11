package Lab11

object Task2 {
  def countToN(a: Int, b: Int): Unit = {
    print(s"$a ")
    if (a == b){
      println("Stopped")
    } else{
      countToN(a + 1, b)
    }
  }

  def main(args: Array[String]): Unit={
    countToN(17, 25)
  }
}
