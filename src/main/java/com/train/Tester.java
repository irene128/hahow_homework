package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) { //psvm
        int ticketCount=0, rtTicketCount;
        while(ticketCount!=-1) {
            System.out.println("Please enter number of tickets:");
            Scanner scanner = new Scanner(System.in);
            ticketCount = scanner.nextInt();
            if(ticketCount!=-1) {
                do {
                    System.out.println("How many round-trip tickets:");
                    rtTicketCount = scanner.nextInt();
                    if(rtTicketCount!=-1) {
                        Ticket ticket = new Ticket(ticketCount, rtTicketCount);
                        ticket.print();
                    }else{
                        System.out.println("Exit");
                        return;
                    }
                }while(rtTicketCount>ticketCount);
            }
        }
        System.out.println("Exit");
    }
}
