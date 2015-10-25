def square(x: Double) = x * x

def abs(x: Double) = if (x >= 0) x else -x

def isGoodEnough(guess: Double, x: Double) =
  abs(square(guess) - x) < 0.001

def improve(guess: Double, x: Double) =
  (guess + (x / guess)) / 2

def sqrtIter(guess: Double, x: Double): Double =
  if (isGoodEnough(guess, x)) guess else
    sqrtIter(improve(guess, x), x)

