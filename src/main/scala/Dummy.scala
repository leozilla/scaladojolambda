package com.leonhart.scalacodingdojo

object Solution {

  def duplicateEncode(word: String) = {
    val countOfChars = scala.collection.mutable.HashMap[Char, Int]()
    val lower = word.toLowerCase
    for (c <- lower) {
        countOfChars.update(c, countOfChars.getOrElse(c, 0) + 1)
    }

    lower.map({
      case v if countOfChars(v) <= 1 => "("
      case _ => ")"
    }).reduce(_ + _)
  }
}
