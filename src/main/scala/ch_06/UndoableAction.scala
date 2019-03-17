package ch_06

abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}
object DoNothingAction extends UndoableAction("Do nothing") {
  override def undo() {}
  override def redo() {}
}