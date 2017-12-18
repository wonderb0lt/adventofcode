package lt.wonderb0.advent.day2

import org.scalatest.{FlatSpec, Matchers}

class ChecksumTest extends FlatSpec with Matchers {
  "The ChecksumCalculator" should "calculate the correct checksum sample #1" in {
    val spreadsheet = Seq(
      Seq(5, 1, 9, 5),
      Seq(7, 5, 3),
      Seq(2, 4, 6, 8)
    )

    new ChecksumCalculator(spreadsheet).calculate() should be(18)
  }

  it should "support divisions for calculationg the checksum" in {
    val spreadsheet = Seq(
      Seq(5, 9, 2, 8),
      Seq(9, 4, 7, 3),
      Seq(3, 8, 6, 5)
    )

    new ChecksumCalculator(spreadsheet).calculate(ChecksumCalculator.dividers) should be(9)
  }
}
