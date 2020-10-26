package ch.mse.app

import scala.language.implicitConversions // disables an implicit conversion warning

class Complex(val re: Double, val im: Double) {
  def +(x: Complex) = new Complex(re + x.re, im + x.im)
  def -(x: Complex) = new Complex(re - x.re, im - x.im)
  def unary_- = new Complex(-re, -im)
  def *(x: Complex) = new Complex(re * x.re - im * x.im, re * x.im + im * x.re)
  def /(y: Complex) : Complex = {
    val d = y.re * y.re + y.im * y.im
    new Complex((re * y.re + im * y.im) / d, (im * y.re - re * y.im) / d)
  }
  override def toString : String =
    if (im == 0) re.toString
    else if (re == 0) s"${im}i"
    else s"$re${if(im < 0) "" else "+"}${im}i"
}

object Complex {
  def apply(re: Double, im: Double) = new Complex(re, im)
  implicit def DoubleToComplex(d: Double) : Complex = Complex(d, 0)
  object i extends Complex(0,1)
}


/*
import ch.mse.app.Complex

val c1 = Complex(1,2)
val c2 = 4 - c1
c1 / c2
-c1

val i = Complex(0,1)
*/
