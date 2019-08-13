//package Scala-Sets

//- Sets

object Sets {

  val myset : Set[Int] = Set(10,22,-5,4,4)
  val myset2 = scala.collection.mutable.Set(50,22,5,3,8,4,10)
  val names : Set[String] = Set("John","Tom","Puck")

  def main(args : Array[String]): Unit ={
    println(myset)
    println(myset + 11)
    println(names("Max"))

    println(myset ++ myset2)
    println(myset.intersect(myset2))

    myset2.drop(50)

    myset2.foreach(println)
  }

}
