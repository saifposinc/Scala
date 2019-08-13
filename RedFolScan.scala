//package Reduce Fold or Scan

//Fold or Scan

object RedFolScan {

  val list = List(3,4,11,-6,5)
  val list2 = List("A","B","C")

  def main(args : Array[String]): Unit ={

    println(list.reduceLeft(_+_))
    println(list2.reduceLeft(_+_))
    println(list.reduceLeft((x,y)=>{println(x+" , "+y);x+y}))
    println(list.reduceRight((x,y)=>{println(x+" , "+y);x+y}))

    println(list.reduceLeft((x,y)=>{println(x+" , "+y);x-y}))
    println(list.reduceRight((x,y)=>{println(x+" , "+y);x-y}))

    println(list.foldRight(200)(_+_))
    println(list.foldLeft(100){(x,y)=>println(x+" , "+y);x+y})
    println(list2.foldRight("G")(_+_))

    println(list.reduceRight(_-_))
    println(list.scanRight(200)(_-_))

    println(list2.scanRight("G")(_+_))


  }

}
