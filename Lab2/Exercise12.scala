package Lab2

object Exercise12
{
  def main(args: Array[String]): Unit = {
//    implicit class RichInt(n: Int) {
//      def squared: Int = n * n
//    }
//
//    val myNumber: Int = 5
//    val squaredNumber = myNumber.squared // The compiler will automatically convert myNumber to RichInt and call squared

    implicit def any_to_string(i: Any): String = i.toString

    def random_implicit_func(x: Any, y: Any): String = x + y

    var a = 2.509292
    var b = 'h'
    val add_num: String = random_implicit_func(a, b)
    println(add_num)
  }

}
