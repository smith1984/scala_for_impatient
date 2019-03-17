package ch_10

trait TimestampLogger extends ConsoleLogger {
  override def log(msg: String) {
    super.log(s"${java.time.Instant.now()} $msg")
  }
}

trait TimestampLogger_2 extends Logger {
  abstract override def log(msg: String) { // Переопределяет абстрактный метод
    super.log(s"${java.time.Instant.now()} $msg") // super.log определен?
  }
}