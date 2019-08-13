package Strings

object Str {

  val str1 = "Hello"
  val num1 = 12
  val num2 = 25.55
  def main(args : Array[String]): Unit ={

    println(str1.length)
    val str2 = " World"
    println(str1.concat(str2))
    val s=printf("%d  %f  %s",num1, num2, str1)
    println(s)
  }

}
