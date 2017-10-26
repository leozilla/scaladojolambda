package com.leonhart.scalacodingdojo

import org.junit.Assert._
import org.junit.Test

class LcsTest {
  @Test def a(): Unit = {
    assertEquals("", Lcs.lcs("", ""))
    assertEquals("", Lcs.lcs("abc", ""))
    assertEquals("", Lcs.lcs("", "abc"))
    assertEquals("", Lcs.lcs("a", "b"))
    assertEquals("a", Lcs.lcs("a", "a"))
    assertEquals("abc", Lcs.lcs("abcdef", "abc"))
  }

  @Test def b(): Unit = {
    assertEquals("ac", Lcs.lcs("abc", "ac"))
    assertEquals("acf", Lcs.lcs("abcdef", "acf"))
  }

  @Test def c(): Unit = {
    assertEquals("nottest", Lcs.lcs("anothertest", "notatest"))
  }

  @Test def d(): Unit = {
    assertEquals("12356", Lcs.lcs("132535365", "123456789"))
  }

  @Test def e(): Unit = {
    assertEquals("final", Lcs.lcs("nothardlythefinaltest", "zzzfinallyzzz"))
  }

  @Test def f(): Unit = {
     assertEquals("acdefghijklmnoq", Lcs.lcs("abcdefghijklmnopq", "apcdefghijklmnobq"))
  }
}
