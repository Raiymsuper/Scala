package Lab10

object Task2 {
  def getResult(a: Int, b: Int): String = {
    var overall: Double = (a + b) / 2.0

    if ((a > 100 || a < 0) && (b > 100 || b < 0)){
      return "invalid inputs"
    }

    if (a >= 40 && b >= 40){
      return "passed"
    } else if (a <= 40 && b >= 40){
      return "resit coursework"
    } else if (a >= 40 && b <= 40){
      return "resit exam"
    } else{
      return "resit module"
    }
  }

  def main(args: Array[String]): Unit={
    println(getResult(30, 50))
    println(getResult(50, 30))
    println(getResult(40, 40))
    println(getResult(30, 30))
    println(getResult(-10, 110))
  }
}
