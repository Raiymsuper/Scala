package Lab5

import scala.io.StdIn.*
object Task15 {
  def main(args: Array[String]): Unit={
    var a = readInt()
    var row = 1
    var column = 1
    print(" "*3)
    while (row <= a){
      print(f"$row%4d")
      row +=1
    }
    println("\n" + " "*6 + "-"*4*(a-1) + "-")
    row = 1
    while (column <= a){
      print(f"$column%2d|")
      while (row <= a){
        print(f"${row*column}%4d")
        row += 1
      }
      print("\n")

      row = 1
      column += 1
    }

  }
}
