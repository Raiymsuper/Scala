package Lab5

import scala.io.StdIn._
import scala.util.Random
object Task8 {
  def main(args: Array[String]): Unit={
    var secret: Int = new Random().nextInt(101)

    var guesses: Int = 0
    print("Your first guess ")
    var guess: Int = readInt()
    while (guess != secret){
      if (guess < secret){
        print("Higher ")
      } else {
        print("Lower ")
      }
      guess = readInt()
      guesses += 1
    }
    println(s"Correct - this took you $guess guesses")
  }
}
