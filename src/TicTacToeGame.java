import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static char[] board = new char[10];
	static char playerOption,computerOption;
	public static Scanner scanner = new Scanner(System.in);
	static int[] computerNum;
	static Random random = new Random();

	public static void main(String[] args)
        {
		getBoard();
		getPlayerChoice();
		currentBoard();
		userMove();
		desiredMove();
		whoPlayFirst();
	}

	 static void getBoard() //method for board
         {
		 for (int i = 0; i < 10; i++) 
                 {
			 board[i] = ' ';
		 }
	 }

	 static void getPlayerChoice() //Method to choose the option
         {
		 System.out.print("Choose an Option x or o : ");
		 playerOption = scanner.next().charAt(0);
		 if (playerOption == 'x')
			 	computerOption='o';
		 else
			 	computerOption ='x';
		 System.out.println("You Selected : " +playerOption);
	 }
	 static void showBoard()//Method for print the board
         {
	        System.out.println("  " + board[1] + "  |  " + board[2]  + "   | " + board[3] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[4] + "  |  " + board[5]  + "   | " + board[6] + "  ");
	        System.out.println(".....|......|.....");
	        System.out.println("  " + board[7] + "  |  " + board[8]  + "   | " + board[9] + "  ");
		 }

	private static void currentBoard() {
		int RADIX = 10;
		System.out.println("\n");
		for (int i = 1; i < 10; i++) {
			if (board[i] != 'x' && board[i] != 'o')
				board[i] = Character.forDigit(i, RADIX);
		}

		showBoard(); //call showboard method
	}

	static void userMove()
	{
		System.out.println("\nSelect the cell from 1 to 9 :");
		int userChoice = scanner.nextInt();
		if (board[userChoice] != 'x' && board[userChoice] != '0')
		{
			board[userChoice] = playerOption;
		} else {
		System.out.println("Invalid Cell");
		}
		// calling currrent board method
		currentBoard();
		
	}

	static void desiredMove()
	{
		System.out.println("\nSelect the cell from 1 to 9 : ");
		int userChoice = scanner.nextInt();
		if (board[userChoice] != 'x' && board[userChoice] != '0')
		{
			board[userChoice] = playerOption;
		} else {
			System.out.println("Invalid Input");
		}
		currentBoard(); // calling current boad method
		userMove(); // calling user move method
	}
	
	static void whoPlayFirst() 
    {
    System.out.println("\nMaking toss to check who play first\n\nselect the number 1 for head and 2 for tail\n ");
    int check = scanner.nextInt();
    if (check == 1 || check == 2)
        {
        int flip = random.nextInt(2) + 1;
        if (flip == 1) 
           {
            System.out.println("HEAD");
        }
           else
            {
            System.out.println("TAIL");
        }
        if (flip == check) 
            {
            System.out.println("You Won the Toss You will Start the Game\n");
            desiredMove();
        }
          else
           {
            System.out.println(" You Lost computer will Start the Game \n");
            computerMove();
        }
    } else 
          {
        System.out.println("\nInvalid input Again\n");
       whoPlayFirst();
      }
}
     //creating  for computer move
     static void computerMove() 
         {
        computerNum = new int[9];
        int  computerChoice = random.nextInt(9)+1;
        board[computerChoice]=computerOption;
        System.out.println("the computer choice "+computerChoice+"' now its your turn.");
        desiredMove();
    }
}