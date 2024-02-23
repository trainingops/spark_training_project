package scalaTraining

import scalaTraining.Rough.PipelineType

object Rough extends  App{


  object PipelineType extends Enumeration{

    type PipelineType = Value

    val ORACLE,HIVE,PARQUET,CSV,AVRO,MYSQL = Value


    val vmap: Map[String, PipelineType.Value] = values.map(v=> (v.toString,v)).toMap
    values.foreach(v=> println(v))

    def getValue(v:String) =
      {


        vmap.get(v) match {
          case Some(x) => x
          case None =>  PipelineType.AVRO
//            println(s"The value: $v does not exist")
//          throw new Exception
        }

        }

  }



  val rs: PipelineType.Value = PipelineType.getValue("ORACLE")


println("printing the checks**************")
  println(PipelineType.ORACLE==PipelineType.getValue("ORACLE"))
  println(PipelineType.getValue("ABC"))
  println(PipelineType.ORACLE==PipelineType.getValue("ABC"))
}
