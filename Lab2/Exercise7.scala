package Lab2

object Exercise7 {
  def main(args: Array[String]): Unit ={
    // Using flatmap with Seq
    val collection = Seq("hi", "bye")
    println(collection.map(x => x + "map"))
    println(collection.flatMap(x => x + "hello"))

    val vehicle = Array("Car1","Car2")
    println(vehicle.map(x => x + " Automate"))
    println(vehicle.flatMap(x => x + " Automate"))
  }

}
