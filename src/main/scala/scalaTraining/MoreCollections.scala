package scalaTraining

object MoreCollectionsFrst extends App {

  val statuses = List(500, 404,200)

  statuses.foreach(x=> println(x))

  val errorCode= 500
  if(statuses.contains(errorCode)) println(raw"statuses contains error message: $errorCode")
  else println("no error message")


  statuses match {

    case x if(x.contains(errorCode)) => println(raw"statuses contains error message: ${errorCode}")
    case _ => println("no error message")
  }

  val statusesArr: Array[Int] = Array(500, 404,200)

  if(statusesArr.contains("500")) println("printAnything")

  if(100=="100") println("")


  val t: (Int, String, String) = (1,"krsna","mathura")

 println(s"id: ${t._1}, name:${t._2}, loc: ${t._3}")

  val lstTuples= List((1,"krsna","mathura"),(2,"shyam","mathura"),(3,"ram","mathura"),(4,"gopal","mathura"))

  lstTuples.foreach(t=> println(s"id: ${t._1}, name:${t._2}, loc: ${t._3}"))

  // map,flatmap/filter


  //val names= "krsna,ram,shyam,gopal"
  val names= "krsna|ram|shyam,gopal"

  val sentance = "This is the month of Feb and sprint is started"

  val arrNm= names.split(" ")

  val words= sentance.split(" ")

  val ids= Array(1,23,33,4)
  val keyCols= ids.toSet

val s= Set(1,2,3,4,5,6,7,8,9,1)



  // Set() is collection in scala which contains unique elements

// Map Collection

  val capitals: Map[String, String] = Map("France" -> "Paris", "Japan" -> "Tokyo","India"->"Delhi","US"->"Washington DC")

  val statusMsg: Map[Int, String] = Map(400->"https error",500->"null pointer exception",300 -> "ClassNotfound exception")

  val states = Map("AL" -> "Alabama", "AK" -> "Alaska")

  capitals.get("France").get
  capitals.get("SriLanka")

  capitals.getOrElse("SriLanka","cntry not present")

val str = Option("France")


  val cntry = "SouthAfrica"

  // Options = > Some(Value) or None


  capitals.get(cntry) match {
    case Some(x) => x
    case None => "Country not present"
  }


  def getCapital(cntry:String) ={

    capitals.get(cntry) match {
      case Some(x) => x
      case None => "Country not present"
    }

  }





  capitals.keySet





}

object MoreCollectionsScnd {


  def main(args:Array[String]): Unit ={


  }


}
