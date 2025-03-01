package Lab4

import scala.io.StdIn._
object Task1 {
  def main(args: Array[String]): Unit={
    var firstName: String = readLine("Enter your first name ")

    var lastName: String = readLine("Enter your last name ")

    var address: String = readLine("Enter your address ")
    /*
    b) Modify the program so that it also attempts to read
    in and store an address and validates the input to ensure it is not empty.
     */


    var error = ""

    if (firstName.isEmpty) {
      error += "You did not type in a first name\n"
    }

    if (lastName.isEmpty) {
      error += "You did not type in a last name\n"
    }

    if (address.isEmpty){
      error += "You did not type an address\n"
    }

    if (error.isEmpty) {
      println("Your name is " + firstName + " " + lastName + "\nYou live in " + address)
    } else {
      println(error)
    }
  }
}
