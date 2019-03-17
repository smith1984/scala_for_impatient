val x = -145
if (x > 0) 1 else if (x == 0) 0 else -1
print("Answer: ")
println(42)
val s = "Hello"
var sum = 0
for (i <- 0 to s.length - 1) {
  sum += s(i)
}
print(sum)
sum = 0
for (ch <- "Hello") {
  print(ch.toInt + " "); sum += ch
}
print(sum)
for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i + j}%3d")
for (i <- 1 to 3; j <- 1 to 3 if i != j) print(f"${10 * i + j}%3d")
for (i <- 1 to 3; from = 4 - i; j <- from to 3) print(f"${10 * i + j}%3d")
for (i <- 1 to 10) yield i % 3
for (c <- "Hello"; i <- 0 to 1) yield (c + i).toChar
for (i <- 0 to 1; c <- "Hello") yield (c + i).toChar

def abs(x: Double) = if (x >= 0) x else -x
def fac(n: Int) = {
  var r = 1
  for (i <- 1 to n) r = r * i
  r
}

def fact(n: Int): Int = if (n <= 0) 1 else n * fact(n - 1)
fact(5)
def decorate(str: String, left: String = "[", right: String = "]") =
  left + str + right
decorate("Hello")
decorate("Hello", "<<<", ">>>")
decorate("Hello", right = "<<<", left = ">>>")
decorate("Hello", "<<<")

def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}
val s1 = sum(1, 2, 5, 23, 35)
val s2 = sum(1 to 6: _*)

def recursiveSum(args: Int*): Int = {
  if (args.length == 0) 0
  else args.head + recursiveSum(args.tail: _*)
}

recursiveSum(1, 2, 3, 4, 5, 6, 7)

def box(s: String) {
  val border = "-" * (s.length + 2)
  print(f"$border%n|$s|%n$border%n")
}

box("Hello")
lazy val words = scala.io.Source.fromFile("/usr/share/dict/words").mkString
print(words)

//throw new IllegalArgumentException("x should not be negative")
def sig(in: Int) = {
  if (in > 0) 1
  else if (in < 0) -1
  else 0
}



print({})
for (i <- Range(10, -1, -1)) println(i)

def countdown(n: Int): Unit = {
  for (i <- Range(n, -1, -1)) println(i)
}

countdown(5)
var prod: Long = 1
for (ch <- "Hello") prod *= ch.toInt
prod

"Hello".codePoints().asLongStream().reduce(_ * _).getAsLong

def product(s: String): Long = {
  s.codePoints().asLongStream().reduce(_ * _).getAsLong
}
def product2(s: String): Long = {
if (s.length == 0) 1 else s.head * product2(s.tail)
}

product2("Hello")
