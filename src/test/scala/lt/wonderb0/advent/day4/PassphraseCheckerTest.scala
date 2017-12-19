package lt.wonderb0.advent.day4

import org.scalatest.{FlatSpec, Matchers}

class PassphraseCheckerTest extends FlatSpec with Matchers {
  "The test phrase checker" should "record sample #1 correct" in {
    PassphraseChecker.checkPhrase("aa bb cc dd ee") should be(true)
  }

  it should "record sample #2 correct" in {
    PassphraseChecker.checkPhrase("aa bb cc dd aa") should be(false)
  }

  it should "record sample #3 correct" in {
    PassphraseChecker.checkPhrase("aa bb cc dd aaa") should be(true)
  }

  // TODO: Tests for day4p2
}
