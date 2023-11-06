package Lab2

import scala.reflect.ClassManifestFactory.Any

object Exercise6 {

  def main(args : Array[String]): Unit = {

    val immutable = new Original
    val immutable2 = immutable

    println(immutable.getValue)

  }

}

class Original {
  private val value: String = "Baeldung"

  def getValue: String = value

  def setValue(value: String): String = this.value
}

class CopyOnWrite {
  private var value: Original = null
  private var copied = false

  def getValue: String = this.value.getValue

//  def deepCopy(value: Original): Original = ???

  def setValue(newValue: String): String = {
    if (!copied) {
//      this.value = deepCopy(this.value)
      copied = true
    }
    this.value.setValue(newValue)
  }
}