package Lab1

object Exercise1 extends App {
  val myarray1: Array[Int] = Array(1, 2, 3, 4, 5)
  val myarray2 = Array.apply(1, 2, 3, 4, 5)
  val myarray3 = Array.ofDim[Int](3, 3) // Creates a 2D array with dimensions 3x3
  val myarray4 = Array.range(1, 10, 2) // Creates an array with elements 1, 3, 5, 7, 9
  val myarray5 = new Array[Int](5) // Creates an array of length 5, initialized to default values (0 for Int)

  myarray1.foreach(print)
  println()
  myarray2.foreach(print)
  println()
  myarray3.foreach(print)
  println()
  myarray4.foreach(print)
  println()
  myarray5.foreach(print)


}
