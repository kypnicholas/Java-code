package fibonacciSequence;

import java.util.Scanner;

public class FibonacciSequence {
    public static int userInt;

    public static void main(String[] args) {

        System.out.println("Enter an integer up to which you want to calculate the Fibonacci sequence: ");

        do {
        	Scanner in = new Scanner(System.in);
        	try {
	            userInt = in.nextInt();                                  //user input
	            if (userInt < 0) {
	                System.out.println("Please, provide a positive integer");
	                System.out.println("Enter an integer up to which you want to calculate the Fibonacci sequence: ");
	            } else if (userInt == 0) {
	                System.out.println("The fibonacci sequence is 0");
	            }
        	}finally {
        		in.close();
        	}
        } while (userInt < 0);
        if(userInt>0){
	        System.out.println("The fibonacci sequence up to number " + userInt + " is: ");
	        for (int i = 1; i <= userInt; i++) {
	            System.out.print(calcFibonacci(i)+" ");
	        }
        }
    }


    static int calcFibonacci(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return calcFibonacci(number - 1) + calcFibonacci(number - 2);
    }
}
