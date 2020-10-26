package ch.mse.app

object Evaluator {

  abstract class Tree
  case class Sum(x: Tree, y: Tree) extends Tree
  case class Prod(x: Tree, y: Tree) extends Tree
  case class Var(n: String) extends Tree
  case class Const(v: Int) extends Tree

  def eval(t: Tree, env: Map[String, Int]): Int = t match {
    case Sum(x, y)  => eval(x, env) + eval(y, env)
    case Prod(x, y) => eval(x, env) * eval(y, env)
    case Var(n)     => env(n)
    case Const(v)   => v
  }

  def main(args: Array[String]): Unit = {
    val t = Sum(
      Sum(Var("x"), Var("x")),
      Prod(Const(7), Var("y")))

    println(t)

    println(eval(t, Map("x" -> 1, "y" -> 2)))

  }

}