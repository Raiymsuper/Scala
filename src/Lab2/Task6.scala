package Lab2

object Task6 {
  def main(args: Array[String]): Unit={
    var x: Int = 3
    var y: Int = 7
    var z: Double = 5.5

    /*
    a) Write an expression that provides the average of x and y
     */
    println(x/(y + 0.0))
    /*
    Write an expression that gives the remainder of a division of y by x
     */
    println(y%x)
    /*
    Write an expression that adds x and y, divides this by z,
    and assigns the overall result to a new variable called result
     */
    var result = (x + y)/z
    println(result)
    /*
    Write an expression that subtracts x from z and then divides the result of this by y
     */
    result = (z - x)/y
    println(result)
    /*
     Write an expression that increases x by 1
     (note: this should actually update the value held by variable x, i.e. reassignment)
     */
    x += 1
  }
}
