package com.leonhart.scalacodingdojo

import com.leonhart.scalacodingdojo.Theater.{Row, SeatCount}

object Theater {
  type Row = Char
  type SeatCount = Int
  type SeatNumber = Int
}

class Theater(val rows: Map[Row, SeatCount]) {
}
