package ch.mse.app

class Vehicle(val id: Int, val year: Int) {
  override def toString() = s"ID: $id Year: $year"
}

class Car(override val id: Int, y: Int, var fuelLevel: Int) extends Vehicle(0, y) {
  override def toString() =
    s"${super.toString()} FuelLevel: $fuelLevel";
}

object Test extends App {
  val v = new Vehicle(1, 1998)
  val c = new Car(2, 2010, 100)
  println(v)
  println(c)
}