import scala.collection.immutable.HashSet
import scala.collection.mutable

object HelloWorld {
  def main(args: Array[String]) {
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")

    val testMap = mutable.Map[String,String]()
    testMap += ("major" -> "lonly")
    println(testMap("major"))

  }

}