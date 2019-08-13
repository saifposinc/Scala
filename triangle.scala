package Inherit

class triangle(var w : Double, var h : Double) extends polygon {
  override def area = .5 * w * h
}
