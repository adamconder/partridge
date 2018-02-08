import scala.util.{Failure, Success, Try}

object Partridge {

  private val terms = List(
    "Partridge",
    "PearTree",
    "Chat",
    "Dan",
    "Toblerone",
    "Lynn",
    "AlphaPapa",
    "Nomad"
  )

  // IMPORTANT: Do not change the signatures of the functions declared below.
  // See the README file for explanations of what each function should do.

  def part(args: Array[String]): String = {
    val found = args.flatMap(t =>
      if (terms.contains(t)) Some(t)
      else None
    )

    if (found.isEmpty) "Lynn, I've pierced my foot on a spike!!"
    else s"Mine's a Pint${"!"*found.length}"
  }

  def apple(x: Any): String = {

    def toInt(num : Any) : Try[Int] = {
//      num match {
//        case n : Int => Success(n)
//        case _ => Failure(new IllegalArgumentException("Cannot create an instance of Int"))
//      }

      Try(num.toString.toInt)
    }

    val failure = "Help yourself to a honeycomb Yorkie for the glovebox"
    val success = "It's hotter than the sun!!"

    toInt(x).fold(
      _ => failure,
      n => {
        if(n * n > 1000) success
        else failure
      })
  }

  def london(args: Array[String]): String = {
    val stations = Set(
      "Rejection",
      "Disappointment",
      "Backstabbing Central",
      "Shattered Dreams Parkway"
    )

    if(stations.subsetOf(args.toSet)) "Smell my cheese you mother!" else "No, seriously, run. You will miss it."
  }

}
