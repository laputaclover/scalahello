object Fortest {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(i + "X" + j + "=" + i * j + "\t")
      }
      println()
    }

  }
}
