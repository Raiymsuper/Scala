package Lab5

import scala.io.StdIn._
object Task7 {
  def main(args: Array[String]): Unit={
    println("Enter start value of list ")
    var start = readInt()

    print("Enter end value of list (exclusive) ")
    var end = readInt()

    var xs = List.range(start, end)

    var cmd = ""

    while {
      println("\nMenu\n====")
      println("Take: take from list")
      println("TakeR: take from right of list")
      println("Drop: drop from list")
      println("DropR: drop from right of list")
      println("End: exit program")

      cmd = readLine()

      if (cmd == "Take"){
        var n = readInt()
        println(xs.take(n))
      } else if (cmd == "TakeR"){
        var n = readInt()
        println(xs.takeRight(n))
      } else if (cmd == "Drop") {
        var n = readInt()
        println(xs.drop(n))
      } else if (cmd == "DropR") {
        var n = readInt()
        println(xs.dropRight(n))
      }


      (cmd != "End")
    } do ()

    println("Exiting program...")
  }
}
