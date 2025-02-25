package Lab1

object Task7 {
  def main(args: Array[String]): Unit ={
    /*
    a) Create and run the following program and study the code and output.
     */
    print("My favourite whole number is: ")
    println(20)
    print(" and decimal number is: ")
    println(0.5)
    print(" and letter is: ")
    println('t')
    /*
    b) Try and rewrite the program so all of the output is within a single println statement.
    (Hint: you will need to use concatenation)
     */
    println("My favourite whole number is: " + 20)
    println(" and decimal number is: " + 0.5)
    println(" and letter is: " + "t")
  }
}