package com.leonhart.scalacodingdojo

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest._
import Solution._

@RunWith(classOf[JUnitRunner])
class duplicateEncodeSuite extends FunSpec {

  val basicExamples = Seq(
    ("din", "((("),
    ("recede", "()()()"),
    ("Success", ")())())"),
    ("(( @", "))((")
  )

  basicExamples.foreach { case (decoded, encoded) =>
    it(s"should return ${encoded} for input ${decoded}") {
      assert(duplicateEncode(decoded) == encoded)
    }
  }
}
