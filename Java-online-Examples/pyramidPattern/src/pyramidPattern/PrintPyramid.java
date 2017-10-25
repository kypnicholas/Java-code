package pyramidPattern;

public class PrintPyramid {
	
	public static void main(String args[]) { 
		System.out.println("Pyramid of stars: "); 
		drawPyramidofStars(); 
		System.out.println("Inverted Pyramid of stars: "); 
		drawInvertedPyramidofStars(); 
		System.out.println("Pyramid of numbers: "); 
		drawPyramidOfNumbers(); } 
	
	//This method draws a pyramid pattern using asterisks
	public static void drawPyramidofStars() { 
		for (int rows = 0; rows < 5; rows++) { 
			for (int spaces = 0; spaces < 5 - rows; spaces++) { 
				System.out.print(" "); 
			} 
			for (int stars = 0; stars <= rows; stars++) { 
				System.out.print("* "); 
			} 
			System.out.println(); 
		} 
	} 
	
	//This method draws an inverted pyramid pattern using asterisks
	public static void drawInvertedPyramidofStars() { 
		
		int i, spaces, stars =0;
		int rows =5;
		for (i = rows; i >= 1; i--) 
		{ 
			for (spaces = 0; spaces <= rows-i; spaces++) { 			
				System.out.print(" "); 
			} 
			for (stars = 0; stars <= rows-spaces; stars++) { 
				System.out.print("* "); 
			} 
			System.out.println(); 
		} 
	} 
	
	//This method draws a pyramid of numbers
	public static void drawPyramidOfNumbers() { 
		for (int rows = 0; rows < 5; rows++) { 
			for (int spaces = 0; spaces < 5 - rows; spaces++) { 
				System.out.print(" "); 
			} 
			for (int numbers = 0; numbers <= rows; numbers++) { 
				System.out.print(numbers + " "); 
			} 
			System.out.println(); 
		} 
	}

}
