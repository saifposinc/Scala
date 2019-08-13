//package Scala-Tuples

//- Tuples

object Tuples {

  val mytuple = (1,2,"moina",false)
  val mytuple2 = new Tuple3(420,55,true)
  val mytuple3 = new Tuple4(10,20,true,("hello",22))

  def main(args : Array[String]): Unit ={
    println(mytuple)
    println(mytuple2._2)

    mytuple.productIterator.foreach{
      i => println(i)
    }

    println(mytuple3._4)
    println(mytuple3._4._2)
  }
}
