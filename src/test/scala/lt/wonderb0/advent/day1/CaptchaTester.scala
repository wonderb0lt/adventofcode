package lt.wonderb0.advent.day1

import org.scalatest.{FlatSpec, Matchers}

class CaptchaTester extends FlatSpec with Matchers {
  "The captcha solver" should "solve sample captcha #1" in {
    new CaptchaSolver("1122").solution should be(3)
  }

  it should "solve sample captcha #2" in {
    new CaptchaSolver("1111").solution should be(4)
  }

  it should "solve sample captcha #3" in {
    new CaptchaSolver("1234").solution should be(0)
  }

  it should "solve sample captcha #4" in {
    new CaptchaSolver("91212129").solution should be(9)
  }

  it should "solve sample capcha #1 for half-ahead captchas" in {
    CaptchaSolver.getHalfwayAheadCaptchaSolver("1212").solution should be(6)
  }

  it should "solve sample captcha #2 for half-ahead captchas" in {
    CaptchaSolver.getHalfwayAheadCaptchaSolver("1221").solution should be(0)
  }

  it should "solve sample captcha #3 ha" in {
    CaptchaSolver.getHalfwayAheadCaptchaSolver("123425").solution should be(4)
  }

  it should "solve sample captcha #4 ha" in {
    CaptchaSolver.getHalfwayAheadCaptchaSolver("123123").solution should be(12)
  }

  it should "solve smaple captcha #5 ha" in {
    CaptchaSolver.getHalfwayAheadCaptchaSolver("12131415").solution should be(4)
  }

}
