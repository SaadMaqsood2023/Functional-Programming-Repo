package Lab1

object Task2 {
  def main(args: Array[String]): Unit = {
    var startAscii = 97 // ASCII value for 'a'
    val endAscii = 122 // ASCII value for 'z'

    // To output the ASCII encoding of a character,
    // we’ll use the toInt method: println(‘a’.toInt)

  def charArray(Startnum : Int): List[Char]={
    var nlist : List[Char] = List()
    var ilist = List(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25)
    for(i <- ilist) {
      var n = Startnum
      n += i
      nlist = nlist :+ (n).toChar
    }
    return nlist
    }


    var charList = charArray(startAscii)

    println("Character List: " + charList.mkString(", "))


  }
}
