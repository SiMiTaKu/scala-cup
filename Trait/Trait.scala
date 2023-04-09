object Trait {
  def main(args: Array[String]): Unit = {
    println("Trait")
    val frog: Philosophical = new Frog
    println(frog)
    frog.Philosopize()
  }
}

class Frog extends Philosophical {
  override def toString = "green"
}

trait Philosophical {
  def Philosopize() = {
    println("I consume memory, therefore I am")
  }
}