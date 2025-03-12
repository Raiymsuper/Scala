package Week13

object Task5 {
  def sortedNames(a: String)(b: List[String]): List[String] = {
    b.sortBy(name => name.toLowerCase)
  }

  def sortLast(a: String)(b: List[String]): List[String] = {
    b.sortBy(name => name.split(" ").last.toLowerCase)
  }

  def sortWith(names: List[String], criteria: String): List[String] = {
    criteria match {
      case "alphabetical" => sortedNames("alphabetical")(names)
      case "lastName" => sortLast("lastName")(names)
      case _ => names
    }
  }

  def main(args: Array[String]): Unit = {
    val names = List("Stefan Kuhn", "Luke Atwood", "Usama Mannai", "Stuart O'Connor", "Bello Bello")

    println("Sorted Alphabetically:")
    println(sortWith(names, "alphabetical"))

    println("\nSorted by Last Name:")
    println(sortWith(names, "lastName"))
  }
}

