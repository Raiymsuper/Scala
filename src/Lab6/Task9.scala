package Lab6

object Task9 {
  def main(args: Array[String]): Unit={
    var lottery = Array(23, 16, 18, 19, 26, 13, 22,
      20, 14, 22, 18, 21, 15, 17,
      24, 15, 18, 20, 13, 14, 20, /* 15 .. 21 */
      18, 22, 20, 16, 19, 11, 20, /* 22 .. 28 */
      16, 28, 22, 20, 15, 17, 17, /* 29 .. 35 */
      21, 21, 19, 20, 14, 22, 25, /* 36 .. 42 */
      19, 17, 26, 18, 20, 23, 12);

    var i = 0
    println(" "*11 + "_" * lottery(i))
    while (i < lottery.length){
      print(f"${i + 1}%2d (${lottery(i)})   |" + "_" * lottery(i) + "|")
      if (i < lottery.length - 1 && lottery(i) < lottery(i+1)) {
        print("_" * (lottery(i + 1)-lottery(i) - 1))
      }
      print("\n")
      i += 1
    }
  }
}
