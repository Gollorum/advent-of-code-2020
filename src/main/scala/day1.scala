import scala.io.Source
import scala.math.{min, max}

object day1:

  def mulSum2020(numbers: List[Int]): Int = (for {
    (a, ai) <- numbers.zipWithIndex
    bi <- (0 until ai) ++ ((ai + 1) until numbers.length)
    b = numbers(bi)
    if (a + b) == 2020
  } yield a * b).head

  def mulDoubleSum2020(numbers: List[Int]): Int = (for {
    (a, ai) <- numbers.zipWithIndex
    bi <- (0 until ai) ++ ((ai + 1) until numbers.length)
    l = min(ai, bi)
    r = max(ai, bi)
    ci <- (0 until l) ++ (l + 1 until r) ++ ((r + 1) until numbers.length)
    b = numbers(bi)
    c = numbers(ci)
    if (a + b + c) == 2020
  } yield a * b * c).head

  def main(args: Array[String]) =
    val input = Source.fromResource("day1_1").getLines().map(_.toInt).toList
    println("Task1: " + mulSum2020(input))
    println("Task2: " + mulDoubleSum2020(input))