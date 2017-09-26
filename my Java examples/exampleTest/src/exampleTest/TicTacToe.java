package exampleTest;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
	       //Create scanner
	       Scanner input = new Scanner(System.in);

	       //create array for board
	       char[][]board = new char[4][4];
	       //initialize the board/array
	       for (int i= 1; i < 4; i++) {
	           for (int j= 1; j < 4; j++) {
	               board[i][j] = ' ';
	           }
	       }


	       //make final char for board display
	       char empty = ' ';
	       final char playerX = 'X';
	       final char playerO = 'O';



	       //create print out of board
	       displayBoard(board);


	       //create loop to keep game going until there is a winner
	       while(empty == ' '){
	           //Printout for player X
	           System.out.println("\nEnter a row (1, 2, or 3) for player X:");
	           int row = input.nextInt();
	           System.out.println("Enter a column (1, 2, or 3) for player X:");
	           int column = input.nextInt();
	           board[row][column] = 'X';
	           //Need to printout the new board with an X where user input
	           displayBoard(board);


	           //call method that will check for winner
	           empty = checkWinner(board,empty);

	           //check if X won
	           if(empty == 'X')
	               break;
	           //Printout for player O
	           System.out.println("\nEnter a row (1, 2, or 3) for player O:");
	           row = input.nextInt();
	           System.out.println("Enter a column (1, 2, or 3) for player O:");
	           column = input.nextInt();
	           board[row][column] = 'O';
	           //Need to printout the new board with an O where user input
	           System.out.println();
	           displayBoard(board);
	           //call method that will check for winner
	           empty = checkWinner(board,empty);
	       }
	       System.out.println(empty + "'s win");
	   }

	   //Create method to display board
	public static void displayBoard(char[][]board){
	           for (int x = 1; x < 4; x++) {
	               System.out.println("-------");
	               for (int y = 1; y < 4; y++) {
	                       System.out.print("|" + board[x][y]);
	               }
	               System.out.println("|");
	           }
	           System.out.println("-------");
	       }

	//Create method to check for winner
	public static char checkWinner(char[][]board, char empty){
	            //check horizontally
	           for (int i= 1; i < 4; i++) {
	               if (board[i][1] == board[i][2] && board[i][1] == board[i][3]) {
	                   if (board[i][1] != empty) {
	                       return board[i][1];

	                   }
	               }
	           }
	           for(int i = 1; i < board.length; i ++){
	              
	               
	               //check vertically
	               if (board[1][i] == board[2][i] &&   board[1][i] == board[3][i]) {
	                   if (board[1][i] != empty) {
	                       return board[1][i];
	                   }
	               }

	               //check diagonally
	                if (board[1][1] == board[2][2] && board[1][1] == board[3][3]) {
	                       if (board[1][1] != empty) {
	                           return board[1][1];
	                       }
	                }
	               if (board[1][3] == board[2][2] && board[1][3] == board[3][1]) {
	                   if (board[1][3] != empty) {
	                       return board[1][3];
	                   }
	               }
	           }
	           return empty;

	}

	}
		

