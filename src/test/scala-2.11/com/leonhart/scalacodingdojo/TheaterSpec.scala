package com.leonhart.scalacodingdojo

import com.leonhart.scalacodingdojo.Theater.{Row}
import org.scalatest.{FlatSpec, Matchers}

class TheaterSpec extends FlatSpec with Matchers {

  var vipRange = Map[Row, Range]()
  vipRange += ('A' -> Range(1, 5))
  vipRange += ('B' -> Range(1, 5))
  vipRange += ('C' -> Range(1, 5))

  var pöbelRange = Map[Row, Range]()
  pöbelRange += ('A' -> Range(6, 10))
  pöbelRange += ('B' -> Range(6, 10))
  pöbelRange += ('C' -> Range(6, 10))

  var layout = Map[Category, SeatRange]()
  layout += (Vip() -> SeatRange(vipRange))
  layout += (Pöbel() -> SeatRange(pöbelRange))

  val seatReserver = new SeatReserver {}
  val theater = new Theater(new TheaterLayout(layout))
  val dispatcher = new TicketDispatcher(theater, seatReserver)

  "book seat in empty theater" should "get new reservation" in {
    val reservedSeats = dispatcher.reserveSeat(Vip())
    reservedSeats should not be empty
  }

  "book seat in empty theater" should "get reservation with central seat" in {
    val reservedSeats = dispatcher.reserveSeat(Vip())
    reservedSeats shouldEqual Set(Seat('A', 8))
  }

  "book seat in not-empty theater" should "get reservation near the center" in {
    // given
    val reservedSeat = dispatcher.reserveSeat(Vip())

    // when
    val anotherReservedSeat = dispatcher.reserveSeat(Vip())

    // then
    anotherReservedSeat should not equal reservedSeat
  }

  "book seat in VIP category" should "reserve seat in chosen category" in {
    // when
    val reservedSeat = dispatcher.reserveSeat(Vip())

    // then
    vipRange should contain (reservedSeat)
  }
}
