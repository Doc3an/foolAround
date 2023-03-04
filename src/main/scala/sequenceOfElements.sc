import scala.annotation.tailrec

def sequenceOfElements(n: Int): Seq[Int] = if (n < 1) Seq() else sequenceOfElements(n - 1) :+ n

def sequenceOfElementsTailRec(n: Int): Seq[Int] = {
  @tailrec def aux(n: Int, m: Int, state: Seq[Int]): Seq[Int] = {
    if (n < 1) state else aux(n = n - 1, m = m + 1, state = state :+ m)
  }
  aux(n = n, m = 1, state = Seq())
}
