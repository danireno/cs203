import java.util.Scanner;


public class TicTacToe {
	public static void main(String[] args) {
		play p1, p2;
		char[] symbols = {'o', 'x'};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter player 1 name (o): ");
		p1 = new play( scanner.next() );
		
		System.out.print("Enter player 2 name (x): ");
		p2 = new play( scanner.next() );
		
		char[][] board = new char[3][3];
		
		initBoard(board);
		
		boolean win = false;
		boolean draw = true;
		int p = 1;
		Position pos;
		
		do {			
			pos = readPosition(scanner, board, p);
			
			fillPosition(symbols, board, p, pos);
					
			printBoard(board);
			
			win = checkWin(board, win, pos);		
			
			draw = checkDraw(board);			
			
			p = 3 - p;
		} while (!win && !draw );
		
		if(win){
			System.out.println("Player " + (3 - p) + " wins the game!"); 			
		} else if (draw){
			System.out.println("It is a draw!");
		}
				
	}

	private static void fillPosition(char[] symbols, char[][] board, int p,
			Position pos) {
		board[pos.x][pos.y] = symbols[p - 1];
	}

	private static void initBoard(char[][] board) {
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				board[i][j] = '_';
			}
		}
	}

	private static Position readPosition(Scanner scanner, char[][] board, int p) {
		Position pos = new Position();
		do {						
			do {
				System.out.print("Player " + p + " enter (i, j): ");
				pos.x = scanner.nextInt();		
				pos.y = scanner.nextInt();							
			} while ( pos.x < 1 || pos.x > board.length || pos.y < 1 || pos.y > board.length);
			
			pos.x -= 1;
			pos.y -= 1;			
		} while(board[pos.x][pos.y] != '_');
		return pos;
	}

	private static boolean checkWin(char[][] board, boolean win, Position pos) {
		if( board[pos.x][0] == board[pos.x][1] && board[pos.x][0] == board[pos.x][2] ){
			// player wins
			win = true;
		} else if ( board[0][pos.y] == board[1][pos.y] && board[0][pos.y] == board[2][pos.y] ){
			// player wins
			win = true;
		}
		return win;
	}

	private static boolean checkDraw(char[][] board) {
		boolean draw;
		// check draw
		draw = true;
		for(int k = 0; k < board.length; k++){
			for(int l = 0; l < board[k].length; l++){				
				if( board[k][l] == '_' )
					draw = false;
			}
		}
		return draw;
	}

	private static void printBoard(char[][] board) {
		// print board
		for(int k = 0; k < board.length; k++){
			for(int l = 0; l < board[k].length; l++){				
				System.out.print( board[k][l] + " ");
			}
			System.out.println();
		}
	}

}
