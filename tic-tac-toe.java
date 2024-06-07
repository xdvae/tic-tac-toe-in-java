import java.util.Random;
import java.util.Scanner;


public class tic_tac_toe {
	static String[][] board = new String[3][3];
	static int won;
	
	public static void drawboard() {
		
		for(int i = 0; i < board.length; i++) {
			System.out.println();
			for(int j = 0; j < board[i].length; j++){
				System.out.print(board[i][j]+" ");
				
				}
			}
	}
	
	public static int check_winner_p1() {

		if((board[0][0] == "[X]" && board[0][1] == "[X]" && board[0][2] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[1][0] == "[X]" && board[1][1] == "[X]" && board[1][2] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[2][0] == "[X]" && board[2][1] == "[X]" && board[2][2] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[2][0] == "[X]" && board[2][1] == "[X]" && board[2][2] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[0][0] == "[X]" && board[1][0] == "[X]" && board[2][0] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[0][1] == "[X]" && board[1][1] == "[X]" && board[2][1] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[0][2] == "[X]" && board[1][2] == "[X]" && board[2][2] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[0][0] == "[X]" && board[1][1] == "[X]" && board[2][2] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else if((board[0][2] == "[X]" && board[1][1] == "[X]" && board[2][0] == "[X]")) {
			System.out.println("Player 1 wins");
			won = 1;
		}
		else {
			won = 0;
		}
		return won;
	}
	public static int check_winner_p2() {

		if((board[0][0] == "[O]" && board[0][1] == "[O]" && board[0][2] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[1][0] == "[O]" && board[1][1] == "[O]" && board[1][2] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[2][0] == "[O]" && board[2][1] == "[O]" && board[2][2] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[2][0] == "[O]" && board[2][1] == "[O]" && board[2][2] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[0][0] == "[O]" && board[1][0] == "[O]" && board[2][0] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[0][1] == "[O]" && board[1][1] == "[O]" && board[2][1] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[0][2] == "[O]" && board[1][2] == "[O]" && board[2][2] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[0][0] == "[O]" && board[1][1] == "[O]" && board[2][2] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else if((board[0][2] == "[O]" && board[1][1] == "[O]" && board[2][0] == "[O]")) {
			drawboard();
			System.out.println("Player 2 wins");
			won = 1;
		}
		else {
			won = 0;
		}
		return won;
		
	}
	public static void play_com() {
		int input_p1;
		int input_p2;
		boolean valid_move = false;
		int boardSize = 3;
		int row;
		int col;
		
		board[0][0] = "[1]";
		board[0][1] = "[2]";
		board[0][2] = "[3]";
		board[1][0] = "[4]";
		board[1][1] = "[5]";
		board[1][2] = "[6]";
		board[2][0] = "[7]";
		board[2][1] = "[8]";
		board[2][2] = "[9]";
		Scanner sc = new Scanner(System.in);
		
		while(won != 1) {
			drawboard();
			System.out.println("Player 1: Enter the number of box you want to pick!");
			while(valid_move != true) {
			input_p1 = sc.nextInt();
			boardSize = 3;
			row = (input_p1 - 1) / boardSize;
			col = (input_p1 - 1) % boardSize;
			
			if(board[row][col] == "[O]" || board[row][col] == "[X]") {
				System.out.println("Box has already been taken!");
				valid_move = false;
			}
			else {
				board[row][col] = "[X]";
				valid_move = true;
			}
			}
			valid_move = false;
			
			check_winner_p1();
			check_winner_p2();
			
			if(won != 1) {
				
				Random random = new Random();
				int com_choice = random.nextInt(9) + 1;

			System.out.println("Com picked :"+com_choice);
			while(valid_move != true) {
			input_p2 = com_choice;
			 row = (input_p2 - 1) / boardSize;
			 col = (input_p2 - 1) % boardSize;
			 
			 if(board[row][col] == "[O]" || board[row][col] == "[X]") {
					valid_move = false;
				}
				else {
					board[row][col] = "[O]";
					valid_move = true;
				}
			}
			valid_move = false;
			
			check_winner_p1();
			check_winner_p2();
			
				}
			}
	}
	public static void main(String[] args) {
		
		int input_p1;
		int input_p2;
		boolean valid_move = false;
		int boardSize = 3;
		int row;
		int col;
		int mode;
		
		System.out.println("Tic-Tac-Toe");
		System.out.println("Coded in java by vaibhav.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nPick an option! \n1.Play against a computer.\n2.Play against a person.");
		mode = sc.nextInt();
		if(mode == 1) {
			play_com();
		}

		board[0][0] = "[1]";
		board[0][1] = "[2]";
		board[0][2] = "[3]";
		board[1][0] = "[4]";
		board[1][1] = "[5]";
		board[1][2] = "[6]";
		board[2][0] = "[7]";
		board[2][1] = "[8]";
		board[2][2] = "[9]";
		
		while(won != 1) {
			drawboard();
			System.out.println("Player 1: Enter the number of box you want to pick!");
			while(valid_move != true) {
			input_p1 = sc.nextInt();
			boardSize = 3;
			row = (input_p1 - 1) / boardSize;
			col = (input_p1 - 1) % boardSize;
			
			if(board[row][col] == "[O]" || board[row][col] == "[X]") {
				System.out.println("Box has already been taken!");
				valid_move = false;
			}
			else {
				board[row][col] = "[X]";
				valid_move = true;
			}
			}
			valid_move = false;
			
			drawboard();
			check_winner_p1();
			check_winner_p2();
			
			if(won != 1) {
			System.out.println("Player 2: Enter the number of box you want to pick!");
			while(valid_move != true) {
			input_p2 = sc.nextInt();
			 row = (input_p2 - 1) / boardSize;
			 col = (input_p2 - 1) % boardSize;
			 
			 if(board[row][col] == "[O]" || board[row][col] == "[X]") {
					System.out.println("Box has already been taken!");
					valid_move = false;
				}
				else {
					board[row][col] = "[O]";
					valid_move = true;
				}
			}
			valid_move = false;
			
				check_winner_p1();
				check_winner_p2();
			

			}
		}	
	}
}
