package AnonFunc

object AF {

  def add = (x : Int, y : Int) => x+y

  def main(args : Array[String]): Unit ={
    println(add(30, 35))
  }

}
