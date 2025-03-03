package Lab6

object Task1 {
  def main(args: Array[String]): Unit={
    var letters = new Array[Char](5)
    letters(0) = 'a'
    letters(1) = 'b'
    letters(2) = 'c'
    letters(3) = 'd'
    letters(4) = 'e'

    println("The letters in your array are:")
    print(letters(0) + " ")
    print(letters(1) + " ")
    print(letters(2) + " ")
    print(letters(3) + " ")
    println(letters(4))

    /*
    b) Create a new Scala object called UsingArrays2 that behaves in a similar manner to UsingArrays but instead
    creates an array of 5 integers, assigns values of your choice to each cell, and then prints out the numbers
    in descending order. You should do this without using a loop.
    */

    var numbers = new Array[Int](5)
    numbers(0) = 1
    numbers(1) = 2
    numbers(2) = 3
    numbers(3) = 4
    numbers(4) = 5

    println("The numbers in your array are:")
    print(numbers(4) + " ")
    print(numbers(3) + " ")
    print(numbers(2) + " ")
    print(numbers(1) + " ")
    print(numbers(0))
  }
}
