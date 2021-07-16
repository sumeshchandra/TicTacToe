
public class TicTacToeGame {

	public char board[] = new char[10]; 

	TicTacToeGame() {
		creatboard();
	}
	// creating creatboard method
	public void creatboard() {
	for (int no =1; no < 10; no++) {
		board[no] = ' ';
		}	
	}
	public static void main(String[] args) {
		TicTacToeGame tictactoegame = new TicTacToeGame();

	}

}
