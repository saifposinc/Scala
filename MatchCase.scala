package MatCs

/**
  * Created by Saif on 25-Dec-18.
  */
object MatchCase {
  def main(args: Array[String]): Unit ={
    val num = 60
    num match{
      case 10 => println(num)
      case 20 => println(num)
      case 30 => println(num)
      case 60 => println(num)
      case 80 => println(num)
      case _ => println("Default")
    }

    val result = num match{
      case 10 => num
      case 20 => num
      case 30 => num
      case 60 => num
      case 80 => num
      case _ => "Default"
    }

    println("result is : "+result)

    val i = 11
    i match{
      case 1 | 3 | 5 | 7 | 9 => println("i is odd")
      case 10 | 2 | 4 | 6 | 8 => println("i is even")
      case _ => println("Default")
    }
  }
}
