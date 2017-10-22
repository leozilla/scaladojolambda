package com.leonhart.scalacodingdojo

import org.scalatest._

class DummySpec extends FlatSpec with Matchers {

  "same sequences" should "not fail" in {
    val seq1 = Seq(121, 144, 19, 161, 19, 144, 19, 11)
    val seq2 = Seq(11*11, 121*121, 144*144, 19*19, 161*161, 19*19, 144*144, 19*19)
    Dummy.comp(seq1, seq2) should be (true)
  }

  "not same sequences" should "fail" in {
    val seq1 = Seq(121, 144, 12)
    val seq2 = Seq(11*11, 121*121, 144*144)
    Dummy.comp(seq1, seq2) should be (false)
  }

  "empty seq1" should "fail" in {
    val seq1 = Seq()
    val seq2 = Seq(11*11, 121*121, 144*144)
    Dummy.comp(seq1, seq2) should be (false)
  }

  "number of occurences dont match" should "fail" in {
    val seq1 = Seq(2, 2, 3)
    val seq2 = Seq(4, 9, 9)
    Dummy.comp(seq1, seq2) should be (false)
  }
}
