package javapractice;

import java.util.*;
import java.io.*;


public class pdfONEquestions {

	public static void main(String[] args) {
		//newLine();
		//Fahreneit();	
		//SPM();
		//switchValues(10,5);
		//squareQubes();
		coefficients();
		//secondsBreakdown(); 
	}
	

		
	
// QUESTION 1
	/*	integer
		float
		boolean
		string */

//	QUESTION 2
	public static void newLine() {
		// TODO Auto-generated method stub
		
		String NewLine = "\n";
		System.out.println(NewLine + "its working");
	}
	
//	QUESTION 3	
	public static void float1() 
	{
		float x,y; 
		x = 2.5f;
		y = 5.4f;
	}
	
// QUESTION 4
	public static void float2() 
	{
		float x = 2.5f ,y = 5.4f;
	}
	
// QUESTION 5
	/*
	 no semicolon
	 replace quotations with speech marks
	 extra parenthesis
	 declared integer but gave it a float number
	 assign a float to an integer
	 it should be b=i;
	 extra parenthesis
	 shouldn't declare them in the same line	 
	 didn't declare 'r'
	 use "" instead
	 
	 */
	
// QUESTION 6
	public static void Arraylist() {
		int [][] resultA = new int[1][15]; 	
		int [][] resultB = new int [38][15];
		int [][] resultC = new int[10][38]; 	
		int [][][] patientNames = new int[5][20][2];
	}

// QUESTION 7
	/*
	 a. 8
	b. 4
	c. -15
	d. 3
	e. 0
	f. jjjjjjxxx 
	 */
	
// QUESTION 8
	
	

// EXERCISE 9   

	public static void Fahreneit() 
	{		
		Scanner in = new Scanner (System.in);
		double cels = 0;
		double fahr = 0;
		fahr = ((cels*9)/5)-32;
		System.out.println ("Input celsius: "); 
		cels = in.nextDouble();
 		
		System.out.println (cels + " Celsius degrees are "  + fahr + "  Fahreneit degrees");
	}	
	


// EXERCISE 10

public static void SPM() 
{
	Scanner in = new Scanner (System.in);
	double mean, variance, deviation;
	System.out.println("Give values for x1,x2,x3");
	
	double x1 = in.nextDouble();
	double x2 = in.nextDouble();
	double x3 = in.nextDouble();
	
	mean = (x1+x2+x3)/3;
	System.out.println ("Mean value:" + mean);
	
	variance = ((x1-mean)*2 + (x2-mean)*2 + (x3-mean)*2)/3;
	System.out.println ("Variance value:" + mean);
	
	deviation = Math.sqrt(mean);
	System.out.println ("Standard deviation value:" + deviation);
	
}	

//EXERCISE 11

public static void switchValues(int x, int y) {
	int temp = x;
	x = y;
	y = temp;
	System.out.println("x is: " + x + " and y is " + y); 
}

//EXERCISE 12

public static void squareQubes() {
	int i=1;
	System.out.println("Number Square Qube");
	System.out.println("------------------");
	
	for ( i=0; i<=10; i++)
	{
		System.out.println( i + "     " + i*i + "    " + i*i*i );
		
	}	
}

//EXERCISE 13

public static void coefficients() 
{
	Scanner in = new Scanner (System.in);
	//double coef1, coef2, coef3;
	double solution1, solution2;
	double discriminant;
	System.out.println("Give values for coef1,coef2,coef3");
	
	double a = in.nextDouble();
	double b = in.nextDouble();
	double c = in.nextDouble();
	
	discriminant = (Math.sqrt(b*b) - 4*a*c);
	System.out.println ("discriminant is: " + discriminant);
	
	solution1 = ((-b + discriminant)/2*a); 
	solution2 = ((-b - discriminant)/2*a); 
	System.out.println ("solution 1: " + solution1);
	System.out.println ("solution 2: " + solution2);
}	

//EXERCISE 14

public static void secondsBreakdown() 
{
	Scanner in = new Scanner (System.in);
	double seconds =0, minutes=0, hours=0, remainder=0;
	System.out.println("Give seconds: " );
	
	double userSeconds = in.nextDouble();
	hours = userSeconds/3600;
	remainder = userSeconds%3600;
	minutes = remainder/60;
	seconds = remainder/60;
	
	
	System.out.println (userSeconds + " seconds are " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
}	


}
