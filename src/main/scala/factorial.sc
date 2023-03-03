import scala.annotation.tailrec

def factorial(n: Int): Int = if (n < 2) 1 else factorial(n - 1) * n

def factorialTailRec(n: Int): Int = {
  @tailrec def aux(n: Int, state: Int): Int = {
    if (n < 2) 1 else aux(n = n - 1, state = state * n)
  }
  aux(n = n, state = 1)
}

// factorialTailRec(n = 5, state = 1)
// factorialTailRec(n = 4, state = 5)
// factorialTailRec(n = 3, state = 20)
// factorialTailRec(n = 2, state = 60)
// factorialTailRec(n = 1, state = 120)







