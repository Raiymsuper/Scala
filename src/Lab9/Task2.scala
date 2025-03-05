package Lab9

object Task2 {
  def incr(x: Int): Int = x + 1
  def decr(x: Int): Int = x - 1
  def sqr(x: Int): Int = x*x
  def dbl(x: Int): Int = 2*x
  def even(x: Int): Boolean = x%2==0
  def odd(x: Int): Boolean = x%2==1
  def inv(x: Boolean): Boolean = !x
  def negative(x: Int): Boolean = x<0
  def strlen(x: String): Int = x.length
  def bracket(x: String): String = "[" + x +"]"
  def pal(x: String): Boolean = {
    var firstHalf = new Array[String](0)
    var secondHalf = new Array[String](0)
    if (x.length % 2 == 0){
      firstHalf = x.substring(0, x.length/2).split("")
      secondHalf = x.substring(x.length/2).split("")
    } else {
      firstHalf = x.substring(0, x.length / 2).split("")
      secondHalf = x.substring(x.length / 2 + 1).split("")
    }

    if (secondHalf.sorted() sameElements firstHalf.sorted()){
      return(true)
    } else{
      return(false)
    }
  }

  def main(args: Array[String]): Unit={
    println(decr(5))
    println((1 to 10) map decr)
    println((1 to 10) map decr map decr)

    println(sqr(5))
    println((1 to 10) map sqr)
    println((1 to 10) map sqr map sqr)
    println((1 to 10) map sqr map incr)

    println(dbl(5))
    println((1 to 10) map dbl)
    println((1 to 10) map incr map dbl)
    println((1 to 10) map dbl map incr)
    println((1 to 10) map sqr map incr map dbl)

    println(even(5))
    println(even(6))
    println((1 to 10) map even)
    println((1 to 10) filter even)
    println((1 to 10) filter even map sqr)

    println(odd(5))
    println(odd(6))
    println((1 to 10) map odd)
    println((1 to 10) filter odd)
    println((1 to 10) filter odd map sqr)

    println(inv(true))
    println(inv(false))

    println(negative(-5))
    println(negative(5))

    println(pal("pip"))
    println(pal("piip"))
    println(pal("pppiippp"))
    println(pal("Hello"))

    println(strlen("hello world"))
    println(bracket("red"))
  }
}
