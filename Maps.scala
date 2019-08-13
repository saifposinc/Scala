//package Scala-Maps

//- Maps

object Maps {

  val mymap : Map[Int, String] = Map(802 -> "John", 803 -> "Max", 803 -> "July", 805 -> "Remi")
  def main(args : Array[String]): Unit ={

    println(mymap)

    println(mymap(803))

    mymap.keys.foreach{ key =>
      println("Key: "+ key + " value: "+ mymap(key))
    }

    println(mymap.get(805).get)


  }

}
