import org.scalatest._

class Euler001Spec extends FlatSpec {
  "sumOfMultiple" should "sum of multiples of 3 and 5 up to 10, to 23" in {
    assert(Euler001.sumOfMultiple(10) == 23)
  }
  "sumOfMultiple" should "sum of multiples of 3 and 5 up to 100, to 23" in {
    assert(Euler001.sumOfMultiple(100) == 2318)
  }
  "sumOfMultiple" should "sum of multiples of 3 and 5 up to 1000, to 23" in {
    assert(Euler001.sumOfMultiple(1000) == 233168)
  }
}
