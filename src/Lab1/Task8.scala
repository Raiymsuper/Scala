package Lab1

object Task8 {
  def main(args: Array[String]): Unit = {
    var option1: String = "good"
    var option2: String = "bad"

    println("Hello " + option1 + " world!")
    println("Today the weather is " + option1)
    println("So far the module is " + option1)
    /*
    b) Update the value assigned to one of the variables and run the program to observe the effect.
    Can you see the benefit of storing data in a variable (in this case of data type String)
    so that values can easily be reused or replaced.
     */
    println("\n\nHello " + option2 + " world!")
    println("Today the weather is " + option2)
    println("So far the module is " + option2)
  }
}