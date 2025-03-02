package Lab5

import scala.io.StdIn._
object Task1 {
  def main(args: Array[String]): Unit={
    println("Type in a maximum between 2 - 1000: ")
    var max = readInt()

    var count: Int = 1 //start value - of the counter

    while (count <= max) { //condition - iterate whilst true
      println(f"$count%04d")
      count = count + 1 //update - by incrementing count
    }
    /*
    b) Create a new Scala object called XToOne that behaves in a similar manner to OneToX but instead prints out the
    numbers in reverse order. The general structure of your program can remain the same, however you will need to
    initialise the count variable to the value of max, change your condition, and rewrite the update statement.
    */

    count = max

    println("-"*4)
    while (count > 0){
      println(f"$count%04d")
      count -= 1
    }

  }
}
