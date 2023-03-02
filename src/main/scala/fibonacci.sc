def fibonacci(n: Int): Int = n match {
  case n if n < 2 => n
  case _ => fibonacci(n-1) + fibonacci(n-2)
}

fibonacci(0)
fibonacci(3)
fibonacci(8)
fibonacci(10)
fibonacci(15)