package Lab2

object Exercise9 {

  def applyfunc(xlist: List[Int]): Unit = {
//    var n_list = List(1,3,5,7,9,11)
//    for(i <- 0 until xlist.length - 1)
//      {
//        var temp = n_list.apply(i)
//        n_list = n_list :+ temp
//      }

    println(xlist)


  }
  def main(args : Array[String]): Unit = {

    var list1 = List(1,2,3,4,5)
    applyfunc(list1)
  }

}
