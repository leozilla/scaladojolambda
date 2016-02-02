package com.leonhart.scalacodingdojo

import com.leonhart.scalacodingdojo.Theater.{SeatNumber, Row}
import com.leonhart.scalacodingdojo.TicketDispatcher.Reservation

object TicketDispatcher {
  type Reservation = Set[Seat]
}

trait SeatReserver {

  def reserveByCategory(theater: Theater, category: Category): Option[Seat] = {
    theater.layout.rows(category).rows.
    theater.markReserved(Seat('A', 15))
    null
  }
}

case class Seat(val row: Row, val seatNumber: SeatNumber)

class TicketDispatcher(val theater: Theater, val seatReserver: SeatReserver) {

  def reserveSeat(category: Category): Reservation = seatReserver.reserveByCategory(theater, category) match {
    case Some(seat) => Set(seat)
    case _ => Set()
  }

}
