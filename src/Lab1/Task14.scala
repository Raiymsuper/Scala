package Lab1

object Task14 {
  def main(args: Array[String]): Unit={
    var x: Int = 3
    println("The value of x is " + x)
    /*
    b) Modify the program so that it prints the value of the variable before
    the string and change the value of the variable to 5. So the message should now say:
    5 is the value of x
    */
    x = 5
    println(x + " is the value of x")
  }
}
