//package Scala Class

//Class

class user(var name : String, var age : Int)

object ScCl {

  def main(args : Array[String]): Unit ={

      var usr = new user("Jigg",15)
      println(usr.name)
      println(usr.age)
      usr.name="Bub"
      usr.age=20
      println(usr.name)
      println(usr.age)
  }

}
