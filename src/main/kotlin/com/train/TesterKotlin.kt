package com.train

import java.util.*

fun main() {
    var ticketCount = 0
    var rtTicketCount:Int
    while(ticketCount != -1) {
        val scanner = Scanner(System.`in`)
        println("Please enter number of tickets:")
        ticketCount = scanner.nextInt()
        if(ticketCount != -1){
            do {
                println("How many round-trip tickets:")
                rtTicketCount = scanner.nextInt()
                if(rtTicketCount != -1) {
                    val total = TicketKT(ticketCount, rtTicketCount)
                    total.print()
                }else{
                    println("Exit")
                    return
                }
            }while(rtTicketCount>ticketCount)
        }
    }
    println("Exit")
}