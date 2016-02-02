package com.leonhart.scalacodingdojo

import com.leonhart.scalacodingdojo.Theater.{SeatCount, Row}
import org.scalatest.{FlatSpec, Matchers}

class TheaterSpec extends FlatSpec with Matchers {

  var rows = Map[Row, SeatCount]()
  rows += ('A' -> 15)
  rows += ('B' -> 15)
  rows += ('C' -> 15)

  val theater = new Theater(rows)
  val dispatcher = new TicketDispatcher(theater)

  "book seat in empty theater" should "get new reservation" in {
    val reservedSeats = dispatcher.reserveSeat()
    reservedSeats should not be empty
  }

  "book seat in empty theater" should "get reservation with central seat" in {
    val reservedSeats = dispatcher.reserveSeat()
    reservedSeats shouldEqual Set(Seat('A', 8))
  }

  "book seat in not-empty theater" should "get reservation near the center" in {
    // given
    val reservedSeat = dispatcher.reserveSeat()

    // when
    val anotherReservedSeat = dispatcher.reserveSeat()

    // then
    anotherReservedSeat should not equal reservedSeat
  }
}
