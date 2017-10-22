package com.leonhart.scalacodingdojo

object Dummy {

  def comp(seq1: Seq[Int], seq2: Seq[Int]): Boolean = {
    if (seq1 == null || seq2 == null) false
    else {
      val doubled = seq1.map(i => i * i).sorted
      seq2.sorted.zip(doubled).forall({ case (s1: Int, s2: Int) => s1 == s2 })
    }
  }
}
