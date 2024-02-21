package scalaTraining

object runProgram extends App {

  val num: Seq[Int] = List(1,2,3,4,5,6,7,8)

//  num.foreach(i => println(i))

  num.foreach { i =>
    val x = i * 2
    println(i,x)
  }


}
