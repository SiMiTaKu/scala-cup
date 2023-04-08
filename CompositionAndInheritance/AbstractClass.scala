object CompositionAndInheritance {
  def main(args: Array[String]): Unit = {
    val element = new ArrayElement(Array("こんにちは", "ありがとう"))
    println(element.contents)
    println(element.height)
    println(element.width)
  }
}

class ArrayElement(
  val contents: Array[String]
) extends Element

abstract class Element {
  def contents: Array[String]
  def height:   Int = contents.length
  def width:    Int = if(height == 0) 0 else contents(0).length
}