import java.util.*;

public class TicTacToeGame {

	public static void main(String[] args) {
		/*Printing Welcome message*/
		System.out.println("Welcome to Tic Tac Toe Game");
		System.out.println("Choose a letter o or x : ");
		Scanner s = new Scanner(System.in);
		char letter = s.next().charAt(0);
		char Choice;
		chooseLetter(letter);
		Board();
	}

	/*Creating Board method()...
	 * under which ther is two for loops for creating  array*/
	public static void Board() {
		char[] board = new char[10];
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.print('_');
				System.out.print('|');
			}
			System.out.println();
		}
	}

	public static void chooseLetter(char letter) {
		switch (letter) {
			case 'o':
				System.out.println("player entered letter: o");
				System.out.println("computer choice is: x");
				break;
			case 'x':
				System.out.println("player entered letter: x");
				System.out.println("computer choice is: o");
				break;
		}
	}


}
