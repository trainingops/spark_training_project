package scalaTraining

object controlStructures extends App {

val num: Seq[Int] = List(1,2,3,4,5,6,7,8)
  // num(0) =1
  // num(1) =2
  //
  num.foreach(i => println(i))

  num.foreach { i =>
    val x = i * 2
    println(i)
  }

  /*
  * foreach equivalent to for loop
  * */
  
  
  
  for(i <- num) {
    println(i)
    
  }


  val number: Seq[Int] = for(i <- 1 to 10)
  yield {

    println(i)
    i
  }

  // number:Seq[Int]=List(1,2,3,4,5,6,7,8,9,10)


  val mult= {
    for {x <- 1 to 10; y <- 1 to 10}
 {
        println(x * y)

      }
  }



/*
* while(boolean expression){
*
* do this
* }
*
* */

  //  val num: Seq[Int] = List(1,2,3,4,5,6,7,8)
    var it = 0
    while(it<num.length){
      println(num(it))
      it=it+1
    }


  var iter = 0
  do {
    println(num(iter))
    iter=iter+1
  }while(iter<num.length)


  var name = "Pavan Kumar"
  println("length is " + name.length)
  var i = 0
  while(i<name.length)
  {
    println(name(i))
    i+= 1
  }



  /*
  * nested for
  * for with yield
  * foreach
  * while/do while
  * */
}
