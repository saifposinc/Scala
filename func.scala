package fun

/**
  * Created by Saif on 25-Dec-18.
  */
object func {

  def main(args : Array[String]): Unit ={
    println(add(32,11))
    println(sub(11,2))
    println(mul(5,3))
    println(div(22,2))
  }
  def add (x : Int, y : Int) : Int ={
    return x+y
  }
  def sub (x : Int, y : Int) : Int ={
    x-y
  }
  def mul (x : Int, y : Int) : Int = x*y
  def div (x : Int, y : Int) = x/y

}
