import org.apache.spark.SparkContext

object day4 {
  def main(args:Array[String]):Unit={

    val sc = new SparkContext("local[*]", "myapp")
//    val arr = Array(10, 20, 30, 40, 50, 60)
//    val rdd1 = sc.parallelize(arr)
//    val avg = rdd1.mean()
//    print(avg)

    //rdd1.collect.foreach(println)

//    val rdd = sc.parallelize(Array(1, 2, 3, 4, 5))
//    rdd.saveAsTextFile("file:///E:/data/oct26")


    val rdd1 = sc.parallelize(Array("apple", "banana", "carrot"))

    val search="carr"

    val rdd2=rdd1.filter(x=>x.contains(search))

    rdd2.collect.foreach(println)
    scala.io.StdIn.readLine()


  }

}
