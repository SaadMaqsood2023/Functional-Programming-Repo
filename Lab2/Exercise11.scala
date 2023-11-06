package Lab2

object Exercise11 {
  def main(args : Array[String]): Unit = {
    // Implicit with parameters
    // Define a function with an implicit parameter
    def greet(name: String)(implicit greeting: String): String = s"$greeting, $name!"

    // Define an implicit greeting
    implicit val defaultGreeting: String = "Hello"

    val result = greet("Alice") // The compiler will automatically use the implicit greeting

    println(result)

    // Implicit for type conversion, in the variables
    implicit def int_to_string (i : Int): String = i.toString
    implicit def double_to_string (i : Double) : String = i.toString

    var imp_str : String = 23   // compiler will automatically convert int to string
    var imp_str2 : String = 13.6 // we don't have to explicitly call the function
    if(imp_str == "23") println("Is a string") else println("Not a string")
    if(imp_str == "23") println("Not a Double, but string") else println("It is a double")
  }

}
