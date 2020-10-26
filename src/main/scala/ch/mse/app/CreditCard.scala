package ch.mse.app

class CreditCard(val number: Int, var limit: Int) {
  def this(number: Int) = this(number, 1000)

  println("new card created")

  private var sum = 0

  def buy(amount: Int): Unit = {
    if (sum + amount > limit) throw new RuntimeException
    sum += amount
  }

  def remainder = limit - sum
}                              