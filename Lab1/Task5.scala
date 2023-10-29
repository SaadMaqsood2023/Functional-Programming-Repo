package Lab1

object Task5 {

  def main(args: Array[String]): Unit = {

    def buildMap[A, B](data: Seq[A], f: A => B): Map[B, A] {
      // code here
    }

    val lst = Array(1, 2, 3, 4, 5)

    def func(x: Int): Boolean = x % 2 == 0 // entry is even or not

    val result = buildMap(lst, func)

  }
}
