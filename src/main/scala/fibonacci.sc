def fibonacci(n: Int): Int = n match {
  case n if n < 2 => n
  case _ => fibonacci(n-1) + fibonacci(n-2)
}