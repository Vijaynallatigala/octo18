import org.apache.spark.SparkContext

object day3 {
  def main(args:Array[String]):Unit={

       val sc = new SparkContext("local[*]", "sai")
       // to print top 2 records from the given dataset
       
       val input = sc.textFile("file:///E:/data/ipaddr.txt")
       val rdd1 = input.flatMap(x=>x.split(" "))
      // rdd1.take(2).foreach(println)



  }


}
