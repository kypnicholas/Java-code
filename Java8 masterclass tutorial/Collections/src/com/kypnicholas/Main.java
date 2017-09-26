package com.kypnicholas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());      //Create new list 'reverseSeats' to SHALLOW COPY (print same elements to diff. list) values from 'theatre' list
        Collections.reverse(reverseSeats);
        // Collections.shuffle(reverseSeats);                                       //shuffles pseudo-randomly a list
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());        //Create new Seats arraylist to which we are going to add new seats.
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);                          //This is gonna sort the seats by price
        printList(priceSeats);

/*

        Theatre.Seat minSeat = Collections.min(reverseSeats);
        Theatre.Seat maxSeat = Collections.max(reverseSeats);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
*/

    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " £" + seat.getPrice());
        }
        System.out.println();
        System.out.println("======================================================================");
    }

}
