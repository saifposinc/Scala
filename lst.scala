package Lists

object lst {

  val mylist : List[Int] = List(3,5,88,-4)
  val names : List[String] = List("Max","John","Puck")
  def main(args : Array[String]): Unit ={
    println(-5::"Deer"::mylist)
    println(mylist)
    println(names)
    //println(mylist.head)
    //val res = 33::mylist
    println((33::"Taz"::mylist).head)
    println(10::55::Nil)
    println(names.reverse)
    println(names)
    println(List.fill(5)(-36))

    mylist.foreach(println)

    var st : String =""
    names.foreach(st+=_)
    println(st)
  }

}
