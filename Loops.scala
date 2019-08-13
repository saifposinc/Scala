package Loops

/**
  * Created by Saif on 07-Nov-18.
  */
object Loops {
  def main(args: Array[String]): Unit ={
    ///for(i <- 1 to 10)
    ///  println("i is " + i)
    val l = List(32,-5,106,11,6,75)
    //println(l.lift(1))
    for(i <- l; if i<7)
      println("l is " + i)
    /*val s = "Mark"
    println("Oh Hai "+s)*/
    for(i <- 0 to 2;j <- 0 to 9)
      if((i!=0)||(j!=0))
        println(i+" "+j)
  }

}
