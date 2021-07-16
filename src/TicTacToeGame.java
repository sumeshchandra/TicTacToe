
public class TicTacToeGame {

	/*Creating Board method()...
	 * under which ther is two for loops for creating  array*/
	 public static void Board()
	   {
	    char[] board=new char[10];
	    for(int i=1;i<=3;i++)
	    {
	        for(int j=1;j<=3;j++)
	        {
	            System.out.print('_');
	            System.out.print('|');
	        }
	        System.out.println();
	    }
	}
	 public static void main(String[] args)
	   {
		 /*Printing Welcome message*/
	        System.out.println("Welcome to Tic Tac Toe Game");
	        Board();
	   }

}
