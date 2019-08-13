package HOF

object HigherOrdFunc {

  def math(x : Double, y : Double, z : Double, f : (Double, Double) => Double) : Double = f(f(x,y),z)

  def main(args : Array[String]): Unit ={
    val result = math(50,30,20, (x,y)=>(x min y))
    println(result)
  }

}
