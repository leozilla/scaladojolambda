package com.leonhart.scalacodingdojo

import com.leonhart.scalacodingdojo.Theater.{SeatNumber, Row}
import org.scalatest.{FlatSpec, Matchers}

class TheaterSpec extends FlatSpec with Matchers {

  "book seat in empty theater" should "get new reservation" in {
    var rows = Map[Row, SeatNumber]()
    rows += ('A' -> 15)
    rows += ('B' -> 15)
    rows += ('C' -> 15)

    val theater = new Theater(rows)

    val dispatcher = new TicketDispatcher(theater)
    val reservedSeats = dispatcher.reserveSeat()

    reservedSeats should not be empty
  }
}
