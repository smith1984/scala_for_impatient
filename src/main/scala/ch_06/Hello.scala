package ch_06

//object Hello {
//def main (args: Array[String]): Unit ={
//  println("Hello World!!!")
//}
//}

//object Hello extends App{
//  println("Hello world!!!")
//}
object Hello extends App {
  if (args.length > 0)
    println("Hello, " + args(0))
  else
    println("Hello, World!")
}
