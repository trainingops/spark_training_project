import org.apache.spark.sql.SparkSession

object example1 {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().master("local[*]").appName("test").getOrCreate()
    println("Testing")
  }
}
