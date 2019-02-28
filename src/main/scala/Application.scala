import scala.util.Random

object Application extends App {

  val listOfNames = List("Andrew","Brendan","Dan","Bonnie","Mo","Megan")
  val randomise  = scala.util.Random

  def makePairs(listOfNames : List[String]) : List[Tuple2[String,String]] = {
    listOfNames match {
      case Nil                    => Nil
      case head :: second :: tail => makePairs(tail) :+ (head,second)
    }
  }

  val randomListOfNames = randomise.shuffle(listOfNames)

  println(makePairs(randomListOfNames))
}
