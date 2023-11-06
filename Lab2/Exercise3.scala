package Lab2

import scala.math.{pow, sqrt}

object Exercise3
{
  def main(args : Array[String]): Unit= {

    var vector_list = Vector(1,2,3)
    vector_list = vector_list :+ 4
    var vector_list2 = vector_list ++ Vector(5,6)

//    You can also prepend elements like this: a is vector
//    val b = 0 +: a
//    and this:
//    val b = Vector(-1, 0) ++: a

    var myans : Double = 0
    for(i <- 0 until vector_list2.length - 1){
      var tempvar = pow( vector_list2.apply(i), 2 )
      myans += tempvar
    }
    myans = sqrt(myans)

    println(myans)


  }
}
