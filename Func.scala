package PartiallyApplFunc
import java.util.Date

object Func {

  def log(date: Date, msg : String)={
    println(date+" "+msg)
  }
  def main(args : Array[String]): Unit ={

    val sum = (x : Int, y : Int, z : Int) => x+y+z
    val f=sum(10,_: Int, _ : Int)
    println(f(100,200))
    val d=new Date
    val newlog=log(d,_ : String)
    newlog("The message 1")
  }

}
