package Lab2

import scala.math.pow

object Exercise2
{
  def main(args: Array[String]): Unit = {

    val my_list: List[Int] = List(-3, -2, -1, 0, 1, 2, 3)

    var solve_eq_list = equation(3, 5, 7, my_list)

    print("The answers of the equations are " + solve_eq_list)
    var zip_list = my_list zip solve_eq_list
    println()
    print(zip_list)
    var indexlist : List[Int] = List()
    for (i <- 0 until my_list.length-1)
    {
      indexlist = indexlist :+ i
    }
    var zip3list = zip_list zip indexlist
    println()
    print(zip3list)
  }

  def equation(a: Double, b: Double, c: Double, x_list: List[Int]): List[Double] = {
    var m_list: List[Double] = List()

    for (i <- 0 until x_list.length - 1) {
      m_list = m_list :+ a * pow(x_list.apply(i), 2) + b * x_list.apply(i) + c
    }
    m_list
  }
}
