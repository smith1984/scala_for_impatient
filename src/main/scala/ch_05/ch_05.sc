class Counter {
  private var value = 0
  def increment(): Unit ={
    value += 1
  }
  def current () = value
  def isLess(other : Counter) = value < other.value
}
val myCounter = new Counter
myCounter.increment()
println(myCounter.current)
myCounter.current()

//class Person {
//  var age = 0
//}

class Person {
  private var privateAge = 0
  private var name = ""
  def age = privateAge
  def age_=(newValue: Int) {
    if (newValue > privateAge) privateAge = newValue
  }
  def this(name: String) {
    this()
    this.name = name
  }

  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}

val fred = new Person
println(fred.age)
fred.age = 21

val p1 = new Person
val p2 = new Person("Fred")
val p3 = new Person("Fred", 42)


import scala.collection.mutable.ArrayBuffer
class Network {
  class Member(val name: String) {
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]
  def join(name: String) = {
    val m = new Member(name)
    members += m
  }
}

val chatter = new Network
val myFace = new Network

val fred_ = chatter.join("Fred")
val wilma = chatter.join("Wilma")

fred_. += wilma