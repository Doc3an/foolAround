def fibonacci(n: Int): Int = if (n < 2) n else fibonacci(n-1) + fibonacci(n-2)

def fibonacciTailrec(n: Int): Int = {
  def aux(m: Int, r1: Int, r2:Int): Int = {
    if (m < n) aux(m = m + 1, r1 = r2, r2 = r1 + r2) else r2
  }
  aux(2, r1 = 1, r2 = 1)
}