package Lab1
import scala.collection.mutable
//import scala.collection.mutable.Map
//import scala.collection.mutable.Set

object Exercise2 {

  // Map
  //  Scala’s Map is a collection of key - value pairs, where each key needs to be unique. Thanks to that , we have direct access to a value under a given key.
  //  Scala defines two kinds of maps, the immutable , which is used by default and mutable, which needs animport scala.collection.mutable.Map.

  //  Scala Set is a collection of pairwise different elements of the same type. In other words, a Set is a collection that contains no duplicate elements. There
  //  are two kinds of Sets, the immutable and the mutable.

  def main(args : Array[String]): Unit= {
    val subjects = mutable.Set("OOP", "DSA", "FP")

    subjects += "Imperative programming"

    subjects.foreach(println)
    println(subjects.head)
    println(subjects.tail)
    println(subjects.isEmpty)

    var temp_map : mutable.Map[Int, Int] = mutable.Map(2 -> 12, 3 -> 18, 4 -> 21)
    temp_map(2) = 50
    temp_map(3) = 30
    temp_map.foreach(println)
  }

}
