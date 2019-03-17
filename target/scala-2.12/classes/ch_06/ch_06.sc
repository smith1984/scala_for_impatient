class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) { balance += amount }
}
object Account {
  private var lastNumber = 0
  def newUniqueNumber() = { lastNumber += 1; lastNumber }
}

Account.newUniqueNumber()
Account.newUniqueNumber()

abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}
object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo() {}
  override def redo() {}
}

object TrafficLightColor extends Enumeration {
  type TrafficLightColor = Value
  val Red, Yellow, Green = Value
}
import TrafficLightColor._
def doWhat(color: TrafficLightColor) = {
  if (color == Red) "stop"
  else if (color == Yellow) "hurry up"
  else "go"
}

for (c <- TrafficLightColor.values) println(s"${c.id}: $c")

TrafficLightColor(0)
TrafficLightColor.withName("Red")