package Lab3

object Task2 {
  def main(args: Array[String]): Unit={
    var xs: List[Int] = List(4, 1, 8, 45, 3)

    println(xs)
    println(xs.head)
    println(xs.tail)
    println(xs.isEmpty)
    println(xs.tail.isEmpty)

    var xs2: List[Int] = xs.reverse

    println(xs2)

    /*
    b) Modify the program to add a println statement which produces the output:
    List(3, 45, 8)
     */

    println(xs.tail.tail.reverse)
  }
}
