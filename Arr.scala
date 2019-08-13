package Arrays
import Array._
object Arr {

  val myarray : Array[Int]=new Array[Int](4)
  val myarray2=Array(55,15,33,63)
  def main(args : Array[String]): Unit ={

    myarray(0)=15
    myarray(1)=544
    myarray(2)=14
    myarray(3)=233
    //myarray(4)=-55
    for(x <- myarray)
      println(x)
    val result=concat(myarray,myarray2)
    for(x <- result)
      println(x)

  }
}
