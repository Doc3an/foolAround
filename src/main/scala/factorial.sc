
def factorial(n: Int): Int = n match {
  case 0 => 1
  case 1 => 1
  case _ => factorial(n-1) * n
}

factorial(0)
factorial(1)
factorial(2)
factorial(3)
factorial(10)



