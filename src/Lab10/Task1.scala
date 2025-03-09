package Lab10

object Task1 {
  def largerOf(c: Int, d: Int): Int = if (c>d) c else d

  def smallerOf3(a: Int, b: Int, c: Int): Int={
    if (a<c && a<b){
      return a
    } else if (c<a && c<b){
      return c
    } else {
      return b
    }
  }

  def medianOf3(a: Int, b: Int, c: Int): Int = {
    var nums = List[Int](a ,b, c).sorted()
    return nums.apply(1)
  }

  def gcd(a: Int, b: Int): Int={
    var max = 0
    for (y <- 1 to math.min(a, b)) {
      if (a % y == 0 && b % y == 0 && y > max) {
        max = y
      }
    }
    max
  }

  def main(args: Array[String]): Unit={
    for (a <- 1 to 3; b <- 1 to 3)
      println(s"Larger of $a and $b is ${largerOf(a, b)}")
    println("-"*20)
    for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
      println(s"$a, $b and $c is ${smallerOf3(a, b, c)}")
    println("-" * 20)
    for (a <- 1 to 3; b <- 1 to 3; c <- 1 to 3)
      println(s"$a, $b and $c is ${medianOf3(a, b, c)}")

    println(gcd(12, 36))
    println(gcd(15, 25))
    println(gcd(16, 44))
  }
}
