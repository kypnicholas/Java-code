package com.kypnicholas;

public class Main {

    public static void main(String[] args) {

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for(int i=2; i<9; i++) {
            System.out.println("10000 with an interest rate of " + i + "% amounts to " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        int count = 0;
        for (int i=1; i<50; i++){
            if (isPrime(i)){
                count++;
                System.out.println(i + " is a prime number. Count of prime numbers found so far is " + count);
                if (count == 10){
                    System.out.println("Found the first three prime numbers");
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}
