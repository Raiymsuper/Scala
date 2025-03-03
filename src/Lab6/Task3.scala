package Lab6

object Task3 {
  def main(args: Array[String]): Unit={
    var nums = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var i = 0
    while (i < nums.length) {
      println("Index: " + i + " ; Value: " + nums(i))
      i += 2
    }

    /*
    b) Create a new Scala object called OddIndex that behaves in a similar manner to EvenIndex but instead creates
    an array of 10 double values, which should be initialised with values of your choice at the point of construction.
    Then use a while loop to print out the elements at each odd index of the array in reverse order.
    */

    var nums2 = Array[Double](1.0, 2.8, 3.1, 4.1, 5.6, 6.7, 7.9, 8.2, 9.6, 10.5)

    i = nums2.length - 1
    while (i > 0) {
      println("Index: " + i + " ; Value: " + nums2(i))
      i -= 2
    }
  }
}
