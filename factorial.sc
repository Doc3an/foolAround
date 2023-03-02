
def factorial(n: Int): Int = n match {
  case n if n < 2 => 1
  case _ => factorial(n - 1) * n
}



