package com.leonhart.scalacodingdojo

object Solution {

  def duplicateEncode(word: String) = {
    val wordLower = word.toLowerCase
    val charCounts = wordLower.groupBy(identity).mapValues(_.length)
    wordLower.map(c => if (charCounts(c) > 1) ')' else '(')
  }
}
