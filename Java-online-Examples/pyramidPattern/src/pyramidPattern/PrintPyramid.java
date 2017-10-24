package pyramidPattern;

public class PrintPyramid {
	
	public static void main(String args[]) { 
		System.out.println("Pyramid of stars: "); 
		drawPyramidofStars(); 
		System.out.println("Pyramid of numbers: "); 
		drawPyramidOfNumbers(); } 
	
	//This method draws a pyramid pattern using asterisk character
	public static void drawPyramidofStars() { 
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5 - i; j++) { 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) { 
				System.out.print("* "); 
			} 
			System.out.println(); 
		} 
	} 
	
	//This method draws a pyramid of numbers
	public static void drawPyramidOfNumbers() { 
		for (int i = 0; i < 5; i++) { 
			for (int j = 0; j < 5 - i; j++) { 
				System.out.print(" "); 
			} 
			for (int k = 0; k <= i; k++) { 
				System.out.print(k + " "); 
			} 
			System.out.println(); 
		} 
	}

}
