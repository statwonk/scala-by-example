
def square(x: Double) = x * x

def abs(x: Double) = if (x >= 0) x else -x

def sqrt(x: Double) = {

    def isGoodEnough(guess: Double) =
      abs(square(guess) - x) < 0.001

    def improve(guess: Double) =
      (guess + (x / guess)) / 2

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess else
        sqrtIter(improve(guess))

  sqrtIter(1.0)
}

