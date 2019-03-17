val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val scores1 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val scores2 = new scala.collection.mutable.HashMap[String, Int]
"Alice" -> 10
val scores3 = Map(("Alice", 10), ("Bob", 3), ("Cindy", 8))
val bobScore = scores("Bob")
val bobScore2 = if (scores.contains("Bob")) scores("Bob") else 0
val bobScore3 = scores.getOrElse("Boby", 0)
val scores4 = scores.withDefaultValue(0)
val zeldasScore1 = scores4.get("Zelda")
val scores5 = scores.withDefault(_.length)
val zeldasScore2 = scores5.get("Zelda")
scores1("Bob") = 10
scores1("Fred") = 7
scores1
scores2 += ("Bob" -> 10, "Fred" -> 7)
scores1 -= "Alice"
val newScores = scores + ("Bob" -> 10, "Fred" -> 7)
scores.keySet
for (v <- scores.values) println(v)
for ((k, v) <- scores) yield (v, k)
val scores6 = scala.collection.immutable.SortedMap("Alice" -> 10,
  "Fred" -> 7, "Bob" -> 3, "Cindy" -> 8)
import scala.collection.JavaConversions.mapAsScalaMap
val scores7: scala.collection.mutable.Map[String, Int] =
  new java.util.TreeMap[String, Int]
import scala.collection.JavaConversions.propertiesAsScalaMap
val props: scala.collection.Map[String, String] = System.getProperties()
import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._
val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
val font = new java.awt.Font(attrs)
(1, 3.14, "Fred")
val t = (1, 3.14, "Fred")
val second = t._2
val (first, second, third) = t
val (first2, second2, _) = t
"New York".partition(_.isUpper)
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)
for ((s, n) <- pairs) Console.print(s * n)
