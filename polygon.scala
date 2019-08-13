package Inherit

abstract class polygon {
  def area : Double
}

object polygon{
  def main(args : Array[String]): Unit ={
    //var poly = new polygon
    var rect = new rectangle(3.2,1.5)
    var tri = new triangle(5,1.6)
    printArea(poly)
    printArea(rect)
    printArea(tri)

  }
  def printArea(p : polygon): Unit ={
    println(p.area)
  }
}
