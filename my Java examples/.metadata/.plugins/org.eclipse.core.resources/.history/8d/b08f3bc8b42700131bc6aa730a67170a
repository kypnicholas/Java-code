package javapractice;

import java.util.*;
import java.io.*;


public class pdfTWOquestions {

	public static void main(String[] args) {
		//printLarge();
		//divisible();
		//evenOdd();
		//cinema();
		//decreasing();
		//exe6();
		//splitInt();
		//printSmaller();
		//printChar1();
		//printChar2();
		//areaCalc();
		//exe11a();
		//exe11b();
		//exe11c();
		//multiplesOf3();
		//multiplesOf5();
		//exercise14();
		//factorial();
		squareStar();
		//emptySquare();
	}
	

		
	
// QUESTION 1
	
	public static void printLarge() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give value for x1");
		int x1 = in.nextInt();
		System.out.println("Give value for x2");
		int x2 = in.nextInt();
		
		if (x1>x2)
		{
			System.out.println (x1);
		}
		else
		{
			System.out.println (x2);
		}
	
	}
	
	
	// QUESTION 2
	
	public static void divisible() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give value for x1");
		int x1 = in.nextInt();
		System.out.println("Give value for x2");
		int x2 = in.nextInt();
			
		if (x1%x2 == 0)
		{
			System.out.println (x1);
		}
		
	
	}
	
	
	// QUESTION 3
	public static void evenOdd() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give value for x1");
		int x1 = in.nextInt();
			
		if (x1%2 == 0)
		{
			System.out.println (x1 + " is an even number");
		}
		else
		{
			System.out.println (x1 + " is an odd number");
		}	
		
	}
	
	
	// QUESTION 4
	public static void cinema() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give age:");
		int x1 = in.nextInt();
		double price = 7;
		
		if (x1<5)
		{
			price = 7*(0.6);
			System.out.println (" price is " + price);
		}
		else if (x1>60)
		{
			price = 7*(0.55);
			System.out.println (" price is " + price);
		}
		else
		{
			System.out.println (" price is " + price);
		}
		
	}
	
	
	
	// QUESTION 5
	
	public static void decreasing() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give three integers:");
		int x1 = in.nextInt();
		int x2 = in.nextInt();
		int x3 = in.nextInt();
		
		int[] myArray = {x1,x2,x3};
		
		for (int i=myArray.length-1; i>=0; i--)
		
		{	
			Arrays.sort(myArray);
			System.out.println(myArray[i]);
		}
			
			
	}
	
	
	// QUESTION 6	
	
	public static void exe6() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give integer:");
		int x1 = in.nextInt();
		
		
		if (x1 <= 0)
		{	
			int answer = x1 + 3;
			System.out.println("Answer is: " + answer);
		}
		else
		{
			int answer = x1*x1 + 2*x1;
			System.out.println("Answer is: " + answer);
		}	
			
	}
	
	
	//QUESTION 7		NOT WORKING!!!!!!!!!
	public static void splitInt() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give integer:");
		int x1 = in.nextInt();
	
		List<Integer> myLL = new LinkedList<Integer>();
		myLL.add(x1);
		
		if (x1 > 9)
		{
			myLL.add(x1%10);
			x1/=10;
			System.out.println(Arrays.toString(myLL.toArray()));
		}
	}
	
	
	//QUESTION 8
	
	public static void printSmaller() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give five integers:");
		int x1 = in.nextInt();
		int x2 = in.nextInt();
		int x3 = in.nextInt();
		int x4 = in.nextInt();
		int x5 = in.nextInt();
		
		int[] myArray = {x1,x2,x3,x4,x5};
		
		for (int i=myArray.length-1; i>=0; i--)
		
		{	
			Arrays.sort(myArray);
		}
		System.out.println(myArray[0]);	
			
	}
	
	
	//QUESTION 9
	
	public static void printChar1() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give a single character:");
		String x1 = in.nextLine();
		char result = x1.charAt(0);
		
		switch (x1)
		{
		//case char: isChar  
		
		}
		
		
	}
	
	
	
	public static void printChar2() {
		Scanner in = new Scanner (System.in);
		System.out.println("Give a single character:");
		String x1 = in.nextLine();
		char result = x1.charAt(0);
		
		if (Character.isDigit(result))
		{
			System.out.println(x1 + " is a digit");			
		}	
		else
		{
			System.out.println(x1 + " is a char");
		}	
		
	}
	
	
	
	// QUESTION 10
	
	public static void areaCalc() 
	{
		System.out.println("Calculate the area");
		System.out.println("------------------");
		System.out.println("1. Calculate the area of a triangle(base,height)");
		System.out.println("2. Calculate the area of a trapezoid(edge a,edge b,height)");
		System.out.println("3. Calculate the area of a rectangle(base,height)");
		System.out.println("4. Exit");
		
		System.out.println("Please choose an option from the above:");
		Scanner in = new Scanner (System.in);
		int userIn = in.nextInt();
		
		if (userIn == 1)
		{
			System.out.println("Calc area of the trianlge");
			System.out.println("Give base and height:");
			int base = in.nextInt();
			int height = in.nextInt();
			
			double triangleArea = (base*height)*(0.5);
			System.out.println("Triangle area is:" + triangleArea);
		}
		else if (userIn == 2)
		{
			System.out.println("Calc area of the trapezoid");
			System.out.println("Give edge a, edge b and height:");
			int edgeA = in.nextInt();
			int edgeB = in.nextInt();
			int height = in.nextInt();
			
			double trapezoidArea = ((edgeA + edgeB)/2)*height;
			System.out.println("Trapezoid area is:" + trapezoidArea);
		}
		else if (userIn == 3)
		{
			System.out.println("Calc area of the rectangle");
			System.out.println("Give base and height:");
			int base = in.nextInt();
			int height = in.nextInt();
			
			double rectangleArea = base*height;
			System.out.println("Rectangle area is:" + rectangleArea);
		}
		else if (userIn == 4)
		{
			System.out.println("Program closed!");
			System.exit(0);
		}	
		
	}
	// QUESTION 2.1
		
		public static void exe11a()
		{
			for (int i=1; i<=100; i++)
			{
				System.out.println(i);
				
			}	
		}
		
		
		public static void exe11b()
		{
			for (int i=1; i<=100; i++)
			{
				int solution = i%2;
				if (solution != 0)
				{	
					System.out.println(i);
				}
			}	
		}
		
		
		public static void exe11c()
		{
			for (int i=100; i>=1; i--)
			{
				System.out.println(i);
				
			}	
		}

	// QUESTION 2.2
		
		public static void multiplesOf3()
		{
			for (int i=1; i<=100; i++)
			{
				int solution = i%3;
				if (solution == 0)
				{	
					System.out.println(i);
				}
			}	
		}	
	
		
	// QUESTION 2.3
		
		public static void multiplesOf5()
		{
			for (int i=1; i<=100; i+=5)
			{
				//int solution = i%5;
				//if (solution == 0)
				{	
					System.out.println(i);
				}
			}	
		}	

		
		
	// QUESTION 2.4
		
		public static void exercise14() 
		{
				Scanner in = new Scanner (System.in);
				System.out.println("Give ten positive numbers:");
				int x1= in.nextInt();
				int x2 = in.nextInt();
				int x3 = in.nextInt();
				int x4 = in.nextInt();
				int x5 = in.nextInt();
				int x6 = in.nextInt();
				int x7 = in.nextInt();
				int x8 = in.nextInt();
				int x9 = in.nextInt();
				int x10 = in.nextInt();
				
				int[] myArray = {x1,x2,x3,x4,x5,x6,x7,x8,x9,x10};
				//System.out.println(myArray);
				
				
				int add=0;
				double mean=0; 
				
				
				for (int i=0; i<myArray.length; i++)		
				{	
					add = add + myArray[i];
				}	
				System.out.println("Sum of the numbers is: " + add);
	
				
				for (int i=0; i<myArray.length; i++)		
				{	
					add = add + myArray[i];			
				}	
				mean = add/myArray.length;
				System.out.println("Mean of the numbers is: " + mean);
					

				for (int i=myArray.length-1; i>=0; i--)
					
				{	
					Arrays.sort(myArray);
				}
				System.out.println("largest no. is : " + myArray[9]);	

				
				
				for (int i=myArray.length-1; i>=0; i--)
				
				{	
					Arrays.sort(myArray);
				}
				System.out.println("smallest no. is : " + myArray[0]);	
					
		
		}
		
		
		// QUESTION 2.5
		
		
		// QUESTION 2.6
		
		public static void factorial() {
			Scanner in = new Scanner (System.in);
			System.out.println("Give an integer:");
			int x1 = in.nextInt();
			
			int fact=1;
			for (int i=1; i<=x1; i++)
			{
				fact = fact*i;
			}
			System.out.println("factorial of " + x1 + " is " + fact);
			
		}
	

		// QUESTION 2.7
	
		
		public static void squareStar() 
		{
			Scanner in = new Scanner (System.in);
			System.out.println("Give an integer:");
			int x1 = in.nextInt();
			char[][]myArray = new char[x1][x1];
			for (int row = 0; row < x1; row++) 
			{      	      
				for (int col = 0; col < x1-1; col++) 
				{        
					System.out.print("*");      
				}      
				System.out.println("*");    
			}    

		}
		
		// QUESTION 2.8
	



}

