package scalaTraining

import scala.collection.mutable.ArrayBuffer

object Collection extends App {


  // Alt enter
  val arr: Array[Int] = Array(1, 2, 3, 4, 4, 5, 67, 8)

  val ayy2 = Array.fill(5)(0)

  val arry: Array[Int] = Array[Int](1, 2, 3, 4, 4, 5, 67, 8)


  val arrStr1: Array[String] = Array("krsna", "ram", "gopal")


  val arrStr: Array[Any] = Array("krsna", "ram", "gopal", 1)

  var a = new Array[Int](3)


  val arrBuffer = ArrayBuffer[Int]()

  // vehicals

  // autos , cars, trucks

  // pigeao , tata auto  , 12,3 45,5   = autos categoriwes

  // maruti800 , slavia, octavia  = cars categor
  // tata trucks , AL trucks = trucks categories

  ///
  /// pigeao,maruti800 ,AL trucks  = vehical


  for (e <- arr) {
    println(s"arry: $e")

  }

//  val arr: Array[Int] = Array(1, 2, 3, 4, 4, 5, 67, 8)
  val arrBff = ArrayBuffer[Int]()

  arr.foreach { e =>
    arrBff += e * e
  }
  val originalList = List(5, 1, 4, 3, 2)
  val newList = originalList.filter(e => e>2)

  val newList1 = originalList.filter{e =>
    e%2==0}
}
