package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) { //psvm
        System.out.println("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int ticketCount = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int rtTicketCount = scanner.nextInt();
        Ticket ticket = new Ticket(ticketCount, rtTicketCount);
        ticket.print();
    }


}
