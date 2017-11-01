package com.leonhart.scalacodingdojo

import org.scalatest.{Matchers, FlatSpec}

class DummySpec extends FlatSpec with Matchers {

  "some test" should "not fail" in {
    Dummy.regexDivisibleBy(10) should be ("")
  }
}
