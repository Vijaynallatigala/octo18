object day1 {
def main(args:Array[String]):Unit={
  println("hellow")

//for loop
  for(i<- 1 to 5)
    {
      print(i)
    }
println
  //while loop
  var i =1
  while(i<=5)
    {
      println(i)
      i+=1
    }
 //foreach loop
println
 val numbers = List(1,2,3,4)
  numbers.foreach(println)

  //data structures
  //Array
  println
  val arr = Array(10,20,30,40,50)
  //access by index value
  val firstEle = arr(0)

//tuples

  val tuple = (10, "scala", 2.45, true)
  val FirstElem = tuple._1
  //access by index
  //doesnt support loops


  //set
  //doesnt support index

  val set = Set(1,4,4, 5,6,7,7,9)
  set.foreach(println)
}
}
