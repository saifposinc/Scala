//package Map & Filter

//& Filter

object MapAndFilter {
  val mylist = List(2,4,44,95,43)
  val mylist2 = List("Hello",5,86,55,44)
  val mymap = Map(1 -> "Lass", 2 -> "Max", 3 -> "Reed")

  def main(args : Array[String]): Unit ={

    println(mylist.map(x => x*3))
    println(mylist.map(x => "hi" + x))
    println(mymap.map(x => "hi" + x))
    println(mymap.mapValues(x => x + " hi"))
    println(List(mylist,mylist2).flatten)
    println(mylist2.map(x => List(x,22)))
    println(mylist.filter(x => x>10))
  }

}
