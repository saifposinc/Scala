package Currying

object currying {

  def add(x: Int, y: Int)=x+y
  def add2(x: Int)=(y: Int)=>x+y
  def add3(x: Int) (y: Int) = x-y

  def main(args : Array[String]): Unit ={
    println(add(30,15))
    println(add2(10)(20))
    val sum=add2(25)
    println(sum(35))
    val sum2=add3 (15)_
    println(sum2(5))
  }

}
