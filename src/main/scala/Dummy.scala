package com.leonhart.scalacodingdojo

import scala.collection.mutable.ListBuffer

object Lcs {
  def lcs(a: String, b: String): String = {
    var subSequences = new ListBuffer[String]()

    var aIndex = 0
    var bIndex = 0

    var possibleSequence = new ListBuffer[Char]()

    while (aIndex < a.length && bIndex < b.length) {
      val aChar = a(aIndex)
      val bChar = b(bIndex)
      if (aChar == bChar) { // char does match
        possibleSequence += aChar
        aIndex += 1
        bIndex += 1
      } else {
        aIndex += 1
      }
    }

    subSequences += possibleSequence.mkString

    subSequences.sortBy(_.length).headOption.getOrElse("")
  }
}
