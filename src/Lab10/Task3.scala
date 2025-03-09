package Lab10

object Task3 {
  def add(x: Int, y: Int): Option[Int] = {
    if ((x < 0 && y > 0) || (x > 0 && y < 0) || x == 0 || y == 0)
      Some(x + y)
    else if (x > 0) {
      if (Int.MaxValue - x >= y)
        Some(x + y)
      else
        None
    } else {
      if (Int.MinValue - x <= y)
        Some(x + y)
      else
        None
    }
  }

  def subtract(x: Int, y: Int): Option[Int] = {
    if ((x >= 0 && y <= 0) || (x <= 0 && y >= 0))
      Some(x - y)
    else if (x > 0) {
      if (x - y >= Int.MinValue)
        Some(x - y)
      else
        None
    } else {
      if (x - y <= Int.MaxValue)
        Some(x - y)
      else
        None
    }
  }

  def multiply(x: Int, y: Int): Option[Int] = {
    val result = x.toLong * y.toLong
    if (result < Int.MinValue || result > Int.MaxValue)
      None
    else
      Some(result.toInt)
  }

  def divide(x: Int, y: Int): Option[Int] = {
    if (y == 0) {
      None
    } else if (x == Int.MinValue && y == -1) {
      None
    } else {
      Some(x / y)
    }
  }

  def analyseAdd(x: Int, y: Int): Unit = {
    add(x, y) match {
      case Some(n) => println(s"Adding $x to $y produces $n")
      case None => println(s"Adding $x to $y causes underflow or overflow")
    }
  }

  def analyseSubtract(x: Int, y: Int): Unit = {
    subtract(x, y) match {
      case Some(n) => println(s"Subtracting $y from $x produces $n")
      case None => println(s"Subtracting $y from $x causes underflow or overflow")
    }
  }

  def analyseMultiply(x: Int, y: Int): Unit = {
    multiply(x, y) match {
      case Some(n) => println(s"Multiplying $x by $y produces $n")
      case None => println(s"Multiplying $x by $y causes underflow or overflow")
    }
  }

  def analyseDivide(x: Int, y: Int): Unit = {
    divide(x, y) match {
      case Some(n) => println(s"Dividing $x by $y produces $n")
      case None => println(s"Dividing $x by $y is undefined (division by zero or overflow)")
    }
  }

  def main(args: Array[String]): Unit = {
    val big: Int = Int.MaxValue
    val small: Int = Int.MinValue

    println("Addition Cases:")
    analyseAdd(small, small)
    analyseAdd(small, -1)
    analyseAdd(small, big)
    analyseAdd(big, big)
    analyseAdd(big, 1)
    analyseAdd(big, small)

    println("\nSubtraction Cases:")
    analyseSubtract(small, small)
    analyseSubtract(small, -1)
    analyseSubtract(small, big)
    analyseSubtract(big, big)
    analyseSubtract(big, 1)
    analyseSubtract(big, small)

    println("\nMultiplication Cases:")
    analyseMultiply(small, small)
    analyseMultiply(small, -1)
    analyseMultiply(small, big)
    analyseMultiply(big, big)
    analyseMultiply(big, 1)
    analyseMultiply(big, small)

    println("\nDivision Cases:")
    analyseDivide(small, small)
    analyseDivide(small, -1)
    analyseDivide(small, big)
    analyseDivide(big, big)
    analyseDivide(big, 1)
    analyseDivide(big, small)
    analyseDivide(big, 0)
    analyseDivide(Int.MinValue, -1)
  }
}