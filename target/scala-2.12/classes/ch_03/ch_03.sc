val nums = new Array[Int](10)
val a = new Array[String](10)
val s = Array("Hello", "World")
s(0) = "GoodBye"
s
import scala.collection.mutable.ArrayBuffer
val b = ArrayBuffer[Int]()
b +=1
b += (1,2,3,4,5)
b ++= Array(8,3,21)
b.trimEnd(3)
b
b.insert(2,6)
b
b.insert(2, 7, 8, 9)
b
b.remove(2)
b
b.remove(2, 3)
b
val a1 = b.toArray
a1.toBuffer
for(i <- 0 until(a1.length))
  println(s"$i :${a1(i)}")
val a2 = Array(2, 3, 5, 7, 11)
val result = for (elem <- a2) yield 2 * elem
for (elem <- a2 if elem % 2 == 0) yield 2 * elem
a2.filter(_ % 2 == 0).map(_ * 2)
a2.filter{_ % 2 == 0}.map{_ * 2}

var n = b.length
var i = 0
while (i < n) {
  if (b(i) >= 0) i += 1
  else { b.remove(i); n -= 1 }
}

val result2 = for (elem <- b if elem >= 0) yield elem
val positionsToRemove = for (i <- b.indices if b(i) < 0) yield i
for (i <- positionsToRemove.reverse) b.remove(i)

val positionsToKeep = for (i <- b.indices if b(i) >= 0) yield i
for (j <- positionsToKeep.indices) b(j) = b(positionsToKeep(j))
b.trimEnd(b.length - positionsToKeep.length)
Array(1, 7, 2, 9).sum
ArrayBuffer("Mary", "had", "a", "little", "lamb").max
val b1 = ArrayBuffer(1, 7, 2, 9)
val bSorted = b1.sorted
val bDescending = b1.sortWith(_ > _)

val a3 = Array(1, 7, 2, 9)
scala.util.Sorting.quickSort(a3)

a3
a.mkString(" and ")
a.mkString("<", ",", ">")

val matrix = Array.ofDim[Double](3, 4)
matrix(2)(2) = 42
matrix

val triangle = new Array[Array[Int]](10)
for (i <- triangle.indices)
  triangle(i) = new Array[Int](i + 1)

triangle
val a_ = Array("Mary", "a", "had", "lamb", "little")
java.util.Arrays.binarySearch(a_.asInstanceOf[Array[Object]], "beef")

import scala.collection.Searching._
val result_ = a_.search("lamb")

import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.mutable.ArrayBuffer
val command = ArrayBuffer("ls", "-al", "/home/cay")
val pb = new ProcessBuilder(command) // Из Scala в Java
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer
val cmd : Buffer[String] = pb.command()

val n_ =5

val a_temp: Array[Int] = (for (i <- 0 to n_ ) yield i).toArray
val a_temp2 = Array(1, 2, 3, 4, 5)
