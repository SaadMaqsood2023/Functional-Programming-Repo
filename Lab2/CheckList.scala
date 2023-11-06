package Lab2

object CheckList {
  def main(args: Array[String]): Unit = {

    var mylist : List[Double] = List(2.3, 4.5, 2.9)

    var convertmap = mylist.zipWithIndex.map{case(v,i) => (i,v)}.toMap

    println("The values of list converted to map are: " + convertmap)

    var mylist2 : List[String] = List("Geometry", "Linear Algebra", "Calculus")

    var temp_map = mylist2.zipWithIndex.map{case (v,i) => (i,v)}.toMap
    println("This is our second map " + temp_map)
    temp_map.foreach(println)
  }
}
