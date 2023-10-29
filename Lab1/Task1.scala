package Lab1

import scala.util.Random
//import scala.collection.mutable.MutableList
object Task1 {

  def main(args : Array[String]): Unit = {

    val ran_num = new Random()
    // val ran_num_list = ran_num.nextInt(50,500)
    val n = ran_num.nextInt(500)
    println(n)
    var mylist = List(ran_num.nextInt(500))    // Making a list and adding elements to it
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)
    mylist = mylist :+ ran_num.nextInt(500)

    mylist.foreach(println)
    val sorted_list = mylist.sorted

    print(sorted_list)
//    var map1 = sorted_list.zipWithIndex.map{ case(v,i) => (i,)}.toMap

    // Converting to Map
    val map_name = (sorted_list zip mylist).toMap
    print(map_name)
  }

}
