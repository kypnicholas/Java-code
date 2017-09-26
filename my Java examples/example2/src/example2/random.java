package example2;

import java.util.*;
import java.math.*;

public class random {

	public static void main(String[] args) {

		//create the grid
		final int rowWidth = 9;
		final int colHeight = 9;
		
		Random rand = new Random();
			
		int [][] board = new int [rowWidth][colHeight];
			
		//fill the grid
		for (int row = 0; row < board.length; row++) {
			
			for (int col = 0; col < board[row].length; col++) {
				
				board[row][col] = rand.nextInt(10);
			}
		}

		//display output
		for(int i = 0; i < board.length; i++) {

			for(int j = 0; j < board[i].length; j++) {
					
				System.out.print(board[i][j] + " ");
				//System.out.println();
			}
			System.out.println();
		}

	} //end of main
} //end of class Main
