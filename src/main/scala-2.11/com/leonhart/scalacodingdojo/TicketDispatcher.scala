package com.leonhart.scalacodingdojo

import com.leonhart.scalacodingdojo.Theater.{Row, SeatNumber}
import com.leonhart.scalacodingdojo.TicketDispatcher.Reservation

object TicketDispatcher {
  type Reservation = Set[Seat]

  case class Seat(val row: Row, val seatNumber: SeatNumber)
}

class TicketDispatcher(val theater: Theater) {

  def reserveSeat(): Option[Reservation] =
    Some(Set())

}
