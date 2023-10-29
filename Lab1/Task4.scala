package Lab1

object Task4 {

  def main(args : Array[String]): Unit={
    var array1 = Array(4,5,6,7,8)

    def sel_even_num(array1 : Array[Int]): Int={
      var even_list : List[Int]= List()   // Use this format otherwise will give error
      for(n <- array1)
      {
        if(n%2==0) even_list = even_list :+ n
      }
      var t_even_no = even_list.length
      t_even_no
    }

    var even_num = sel_even_num(array1)
    println(even_num)

  }

}
