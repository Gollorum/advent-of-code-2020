import org.scalatest.funsuite.AnyFunSuite

class day1test extends AnyFunSuite:

  test("0 and 2020 are 0") {
    assert(day1.mulSum2020(List(0, 2020)) === 0)
  }

  test("0, 2020 and 1000 are 0") {
    assert(day1.mulSum2020(List(0, 1000, 2020)) === 0)
  }

  test("1, 2 and 2019 are 2019") {
    assert(day1.mulSum2020(List(1, 2, 2019)) === 2019)
  }

  test("Example works") {
    assert(day1.mulSum2020(List(1721, 979, 366, 299, 675, 1456)) === 514579)
  }