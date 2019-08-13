package Clsr

object closures {
  var num = 100
  val add = (x: Int) => {
    num=x+num
    num
  }
  def main(args : Array[String]): Unit ={
    println(add(20))
    println(num)
  }
}
