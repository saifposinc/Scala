package FuncCall

object FunCalling {

  object Math{

    def +(x : Int = 45, y : Int = 10) = x+y
    def ^(x : Int) = x*x
  }

  def main(args : Array[String]){
    println(Math.+())
    println(Math.^(3))
  }

}
