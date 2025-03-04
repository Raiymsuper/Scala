import scala.io.StdIn._
object Task4 {
  def main(args: Array[String]): Unit={
    var a = readInt()
    var b = readInt()

    if (a < b){
      for (x <- a to b){
        print(x + " ")
      }
    }else{
      for (x <- a to b by -1){
        print(x + " ")
      }
    }
  }
}
