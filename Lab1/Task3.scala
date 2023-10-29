package Lab1

object Task3 {

  def main(args : Array[String]): Unit= {

    val myarr1 : Array[Double] = Array(2.3, 3.4, 4.5)
    val myarr2 : Array[Double] = Array(1.6, 2.1, 2.2)

    val sumarr = new Array[Double](5)

    def elementWiseSum(arr1: Array[Double], arr2:Array[Double]): Array[Double] = {
      val sumArray = arr1.zip(arr2).map { case (x, y) => x + y }
      return sumArray
    }
    val sumArr = elementWiseSum(myarr1, myarr2)
    print(sumArr.mkString(", "))
  }
}
