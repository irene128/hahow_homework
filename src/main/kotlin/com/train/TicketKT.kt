package com.train

class TicketKT (var ticketCount:Int, var roundTripCount:Int){
    fun print(){
                if (ticketCount >= roundTripCount) {
                    println(roundTripCount.toDouble() * 2000.0 * 0.9 + (ticketCount - roundTripCount) * 1000)
                    return
                }
            println("The number of round-trip tickets MUST greater than or equal to the number of tickets")
        }
}