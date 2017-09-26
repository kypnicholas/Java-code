package com.kypnicholas;

import java.util.*;

/**
 * Created by nkypr on 03/08/2017.
 */
public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();                     //Original declaration of Seats. (it SHOULD NOT be public - only for the purposes of this exercise)
    //private List<Seat> seats = new LinkedList<>();                    //This would still work because our definition of Seat is generic.

    /* We could however make the above statement even more generic */
    //private Collection<Seat> seats = new ArrayList<>();                 //This makes it really generic and allows us to USE ANY Collections classes to implement Seats.
    //private Collection<Seat> seats = new HashSet<>();                   //This also works because HashSet is a kind of collection
    //private Collection<Seat> seats = new LinkedHashSet<>();

    /*
    ALTERNATIVE TO IMPLEMENTING Comparable Interface
    Creating an object of type Comparator with a Compare() to sort the objects we want
    This method allows more than one Comparator objects to be created so we can sort our lists in different ways
    * */
    static final Comparator<Seat> PRICE_ORDER;                  //DECLARATION OF COMPARATOR

    // the following compare() does what the CompareTo() does when the override it when using the implements Comparable Interface
    static {                                                    //INITIALIZATION OF COMPARATOR
        PRICE_ORDER = new Comparator<Seat>() {
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows -1);
        for (char row = 'A'; row <= lastRow; row++) {
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if((row < 'D') && (seatNum >=4 && seatNum <=9)) {
                    price = 14.00;
                } else if((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    /*
    //Commented out as using binary search (above) is much more efficient than brute force search (below)
     public boolean reserveSeat(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
     }
    */


    // for testing
    public Collection<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat>{                 //(it SHOULD NOT be public - only for the purposes of this exercise)
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        /*
        * Returns a negative integer, zero, or a positive integer as this object is less
        * than, equal to, or greater than the specified object.
        */
        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}
