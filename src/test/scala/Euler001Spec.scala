import org.scalatest._

class Euler001Spec extends FlatSpec {
  "sumOfMultiple" should "sum of multiples of 3 and 5 up to 1, to 0" in {
    assert(Euler001.sumOfMultiple(1) == 0)
  }
  "sumOfMultiple" should "sum of multiples of 3 and 5 up to 10, to 23" in {
    assert(Euler001.sumOfMultiple(10) == 23)
  }
  "sumOfMultiple" should "sum of multiples of 3 and 5 up to 100, to 2318" in {
    assert(Euler001.sumOfMultiple(100) == 2318)
  }
  "sumOfMultiple" should "sum of multiples of 3 and 5 up to 1000, to 233168" in {
    assert(Euler001.sumOfMultiple(1000) == 233168)
  }

  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 1, to 0" in {
    assert(Euler001.sumOfMultiples5(1) == 0L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 10, to 23" in {
    assert(Euler001.sumOfMultiples5(10) == 23L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 100, to 2318" in {
    assert(Euler001.sumOfMultiples5(100) == 2318L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 1000, to 233168" in {
    assert(Euler001.sumOfMultiples5(1000) == 233168L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 10000, to 23331668" in {
    assert(Euler001.sumOfMultiples5(10000) == 23331668L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 100000, to 2333316668" in {
    assert(Euler001.sumOfMultiples5(100000) == 2333316668L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 1000000, to 233333166668" in {
    assert(Euler001.sumOfMultiples5(1000000) == 233333166668L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 10000000, to 23333331666668" in {
    assert(Euler001.sumOfMultiples5(10000000) == 23333331666668L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 100000000, to 2333333316666668" in {
    assert(Euler001.sumOfMultiples5(100000000) == 2333333316666668L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 1000000000, to 233333333166666668" in {
    assert(Euler001.sumOfMultiples5(1000000000) == 233333333166666668L)
  }
  "sumOfMultiple5" should "sum of multiples of 3 and 5 up to 2147483647, to 1076060070465310994" in {
    assert(Euler001.sumOfMultiples5(2147483647) == 1076060070465310994L)
  }

}
