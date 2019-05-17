package com.train;

public class Ticket{
        int ticketCount;
        int roundTripCount;

        public Ticket(int ticketCount, int roundTripCount){
            this.ticketCount=ticketCount;
            this.roundTripCount=roundTripCount;
        }

        public void print(){
                if(ticketCount>=roundTripCount){
                    System.out.println(roundTripCount*2000*0.9+(ticketCount-roundTripCount)*1000);
                    return;
                }
            System.out.println("The number of round-trip tickets MUST greater than or equal to the number of tickets");
        }
}

