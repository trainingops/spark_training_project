package scalaTraining

object Functions {


  def main(args: Array[String]): Unit = {


    def Hi(): Unit = println("Hi: How are you")

    Hi()

    Hello("How are you doing")


    val result = multiply(10, 12)

  }

  def STrim(str: String): Unit = {
    if(str==null) println("null message is passed")
    else {
      println(s"The length before trim of the str :${str.length}")
      val trimStr = str.trim
      println(s"The length after trim of the str :${trimStr.length}")
    }
  }

  def STrimOPtions(str: String): Unit = {

    val optionStr: Option[String] =Option(str) // Some(str) otherwise in case of str being null ->  None

    optionStr match {
      case Some(x) => {
        println(s"The length before trim of the str :${str.length}")
        val trimStr = str.trim
        println(s"The length after trim of the str :${trimStr.length}")
        println(s"The String is : $trimStr")
      }
      case None => println("null message is passed")
    }

  }


  def Hello(msg: String){
    println(s"Hello !! $msg")
  }  /// -- this is procedure

  def multiply(x: Int, y: Int): Int = {

    println(s"Multipying ${x} and $y")
     x * y
  }




}







