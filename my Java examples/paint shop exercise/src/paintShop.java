import java.util.*;


public class paintShop {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter the room dimensions");
		System.out.println("--------------------------------");
		
		/*System.out.println("Enter number of walls you want to paint:");
		int noOfWalls = in.nextInt();
		
		int countWalls = noOfWalls;
		
		while (countWalls<= noOfWalls)
		{
			System.out.println("Enter the Width of the wall:");
			double width = in.nextDouble();
			System.out.println("Enter the Length of the wall: ");
			double length = in.nextDouble();
			
			countWalls++;
		}*/	
		
		System.out.println("Enter the Width of the room:");
		double width = in.nextDouble();
		System.out.println("Enter the Length of the room: ");
		double length = in.nextDouble();
		System.out.println("Enter the Height of the room:");
		double height = in.nextDouble();
		
		
		double roomArea = (width*length);  ////////fix it       
 		System.out.println("The area you want to paint is: " + roomArea + " cubic meters.\n");
		
		
		int cheapBuckets=0; 
		int standardBuckets=0; 
		int specialBuckets=0; 
		
		//double cheapPrice = roomVol*1.5;   
		//double standardPrice = roomVol*2;
		//double specialPrice = roomVol*4.5;
	
		double cheapLitr = roomArea/2.5;
		System.out.println("You will need: " + cheapLitr + " litres of cheap paint");		
		double standardLitr = roomArea/3.5;
		System.out.println("You will need: " + standardLitr + " litres of standard paint");
		double specialLitr = roomArea/4.5;
		System.out.println("You will need: " + specialLitr + " litres of special paint\n");
		

		
		double cheapPortion = roomArea/10;
		//System.out.println(cheapPortion);
		for (int i=0; i< cheapLitr; i+=10)
		{
			cheapBuckets = cheapBuckets + 1;
		}
		System.out.println("You are going to need: " + cheapBuckets + " buckets of 10L cheap paint");
		
		double standardPortion = roomArea/5;
		//System.out.println(standardPortion);
		for (int i=0; i< standardLitr; i+=5)
		{
			standardBuckets = standardBuckets + 1;
		}
		System.out.println("You are going to need: " + standardBuckets + " buckets of 5L standard paint");

		
		double specialPortion = roomArea/2;
		//System.out.println(specialPortion);
		for (int i=0; i< specialLitr; i+=2)
		{
			specialBuckets = specialBuckets + 1;
		}
		System.out.println("You are going to need: " + specialBuckets + " buckets of 2L special paint\n");
		
		
		
		double priceCheap = cheapBuckets*15;
		double priceStandard = standardBuckets*10;
		double priceSpecial= specialBuckets*9;
		
		System.out.println("The price for " + cheapBuckets + " buckets of 10L cheap paint is: " + priceCheap);
		System.out.println("The price for " + standardBuckets + " buckets of 5L standard paint is: " + priceStandard);
		System.out.println("The price for " + specialBuckets + " buckets of 2L special paint is: " + priceSpecial);
		
		double[] myArray = {priceCheap, priceStandard, priceSpecial};
		for (int i=myArray.length-1; i>=0; i--)
		{	
			Arrays.sort(myArray);
		}
		System.out.println("\n\nThe cheapest option is the one that costs: " +  myArray[0] + "GBP");	
		
		
	}
}
