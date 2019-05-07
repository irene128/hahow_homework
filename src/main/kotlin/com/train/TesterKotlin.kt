package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    val ticketCount = scanner.nextInt()
    println("How many round-trip tickets:")
    val rtTicketCount = scanner.nextInt()
    val total=TicketKT(ticketCount, rtTicketCount)
    total.print()
}