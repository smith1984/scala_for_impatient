package ch_10

class ConsoleLogger extends Logger with Cloneable with Serializable{
  def log(msg: String) {println(msg)}
}
