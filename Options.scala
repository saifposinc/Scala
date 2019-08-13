//package Scala-Options

//- Options

object Options {

  val mylist = List(1,3,58)
  val mymap = Map(1 -> "Lex",2 -> "Dru", 3 -> "Bin")
  val opt : Option[Int] = Some(3515)

  def main(args : Array[String]): Unit ={

    println(mylist.find(_>0).get)
    println(mymap.get(1))

    println(opt.get)
  }

}
