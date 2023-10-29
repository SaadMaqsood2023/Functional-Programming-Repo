package Lab1

object Exercise3 {

  def main(args : Array[String]): Unit = {
    // A sealed class is one which cannot be further inherited or extended
    // Define a function that may or may not return a value

    def divide(x: Int, y: Int): Option[Int] = {
      if (y != 0) Some(x / y) else None
    }

    def percent_func(total: Int, obtain: Option[Int]): Any = {
      print("Percentage obtained is ")
      if (total != 0) print(obtain) else None
    }

    // Usage of the function
    val result1: Option[Int] = divide(10, 2) // result1 will be Some(5)
    val result2: Option[Int] = divide(10, 0) // result2 will be None

    val my_percent = percent_func(23, Some(25))
    println(my_percent)
    println(result1)
    print(result2)

  }

}
