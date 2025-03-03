package Lab6

object Task6 {
  def main(args: Array[String]): Unit={
    var fibo = new Array[Int](40)
    fibo(0) = 1
    fibo(1) = 1

    var i = 2
    while (i < fibo.length){
      fibo(i) = fibo(i-1) + fibo(i-2)
      i += 1
    }

    fibo.foreach(x => print(x + " "))
  }
}
