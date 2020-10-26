package ch.mse.app

import javax.swing._
import java.awt._

object SampleGUI {
  def main(args: Array[String]): Unit = {
    val f = new JFrame("Title")
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    f.setLayout(new FlowLayout())
    f.add(new JLabel("Please press the Button"))
    f.add(new JButton("OK"))
    f.setSize(500, 500)
    f.setVisible(true)
  }
}
