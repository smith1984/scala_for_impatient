import java.io.{File, PrintWriter}
import scala.io.Source
val source = Source.fromFile("./projects/scala_for_impatient/myfile.txt", "UTF-8")
val contents = source.mkString
println(contents)
val lineIterator = source.getLines
for (l <- lineIterator) println(l)
val lines = source.getLines.toArray
source.close()

//val source1 = Source.fromURL("http://horstmann.com", "UTF-8")
val source2 = Source.fromString("Hello, World!")
val source3  = Source.stdin

//source1.mkString

val out = new PrintWriter("./projects/scala_for_impatient/numbers.txt")
for (i <- 1 to 100) out.println(i)
out.close()

val source4 = Source.fromFile("./projects/scala_for_impatient/numbers.txt", "UTF-8")
val contents1 = source4.mkString

import scala.sys.process._
"ls -al .".!

val result = "ls -al /".!!

"ls -al /" !!

("ls -al /" #| "grep u").!
("ls -al /" #> new File("./projects/scala_for_impatient/filelist.txt")).!
("ls -al /etc" #>> new File("./projects/scala_for_impatient/filelist.txt")).!

val source5 = Source.fromFile("./projects/scala_for_impatient/filelist.txt", "UTF-8")


source5.mkString

val numPattern = "[0-9]+".r
val wsnumwsPattern = """\s+[0-9]+\s+""".r
for (matchString <- numPattern.findAllIn("99 bottles, 98 bottles"))
  println(matchString)

val matches = numPattern.findAllIn("99 bottles, 98 bottles").toArray
val firstMatch = wsnumwsPattern.findFirstIn("99 bottles, 98 bottles")
numPattern.replaceFirstIn("99 bottles, 98 bottles", "XX")
numPattern.replaceAllIn("99 bottles, 98 bottles", "XX")
numPattern.replaceSomeIn("99 bottles, 98 bottles",
  m => if (m.matched.toInt % 2 == 0) Some("XX") else None)

val varPattern = """\$[0-9]+""".r
def format(message: String, vars: String*) =
  varPattern.replaceSomeIn(message, m => vars.lift(
    m.matched.tail.toInt))

format("At $1, there was $2 on $0.",
  "planet 7", "12:30 pm", "a disturbance of the force")
val numitemPattern = "([0-9]+) ([a-z]+)".r
for (m <- numitemPattern.findAllMatchIn("99 bottles, 98 bottles"))
  println(m.group(1))
for (m <- numitemPattern.findAllMatchIn("99 bottles, 98 bottles"))
println(m.group(2))