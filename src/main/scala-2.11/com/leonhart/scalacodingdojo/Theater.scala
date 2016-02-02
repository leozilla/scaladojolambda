package com.leonhart.scalacodingdojo

import com.leonhart.scalacodingdojo.Theater.{Row, SeatCount}

import scala.collection.mutable

object Theater {
  type Row = Char
  type SeatCount = Int
  type SeatNumber = Int
}

sealed trait Category

case class Vip() extends Category
case class Economy() extends Category
case class Pöbel() extends Category
case class NullOchtFünfzehn() extends Category

case class SeatRange(val rows: Map[Row, Range])
case class TheaterLayout(val rows: Map[Category, SeatRange])

class Theater(val layout: TheaterLayout) {

  var reservedSeats:mutable.Set[Seat] = mutable.Set[Seat]()

  def markReserved(seat: Seat): Unit = reservedSeats += seat
}
