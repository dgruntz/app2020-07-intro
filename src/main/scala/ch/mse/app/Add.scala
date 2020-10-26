package ch.mse.app

object Add extends Function2[Int, Int, Int] {
  def apply(x: Int, y: Int) = x + y
}

object TestAdd extends App {
  val add = Add
  println(add(1, 2))
  val addc = add.curried
  addc(1)
}