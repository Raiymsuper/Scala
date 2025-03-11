package Lab11

object Task3 {
  def reverseCountToN(a: Int, b: Int): Unit = {
    print(s"$b ")
    if (a == b){
      println("Stopped")
    } else{
      reverseCountToN(a, b - 1)
    }
  }

  def main(args: Array[String]): Unit={
    reverseCountToN(17, 25)
  }
}

