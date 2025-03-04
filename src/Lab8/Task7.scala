package Lab8

object Task7 {
  def main(args: Array[String]): Unit={
    var words = Array("Mse", "crete", "t", "messiah", "s", "ageing")
    words.map(x => if (x.length >= 3) x.substring(0,3) else x)
      .flatten()
      .filter(x => x > 'a' && x < 'z')
      .foreach(x => println(f"$x -> ${(x +1).toChar}"))
  }
}
