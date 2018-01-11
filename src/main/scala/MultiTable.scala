class MultiTable {
  def makeRowSeq(row: Int) =
    for (col <- 1 to row) yield {
      val prod = row + "*" + col + "=" + (row * col).toString
      val padding = " " * (8 - prod.length)
      prod + padding
    }

  def makeRow(row: Int) = makeRowSeq(row).mkString

  def multiTable() = {
    val tableSeq =
      for (row <- 1 to 9)
        yield makeRow(row)
    println(tableSeq.mkString("\n"))
  }
}

object MultiTable {
  def main(args: Array[String]): Unit = {
    val fuz = new MultiTable
    fuz.multiTable()
  }
}
