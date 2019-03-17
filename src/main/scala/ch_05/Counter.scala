package ch_05

class Counter {
private var value = 0
  def increment(): Unit ={
    value += 1
  }
  def current () = value
  def isLess(other : Counter) = value < other.value
}

