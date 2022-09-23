package dat100.hvl.uke39.tictactoe;

public class GameController {

	private char[][] board;
	private char turn;

	public GameController() {
		turn = TicTacToe.X_PLAYER_CHR; // Player 'X' starts the game
		board = new char[TicTacToe.SIZE][TicTacToe.SIZE];
	}

	public char getTurn() {
		return turn;
	}

	public void nextTurn() {
		switch (turn) {
		case TicTacToe.X_PLAYER_CHR:
			turn = TicTacToe.O_PLAYER_CHR;
			break;
		case TicTacToe.O_PLAYER_CHR:
			turn = TicTacToe.X_PLAYER_CHR;
			break;
		}
	}

	// check board given that field (x,y) has been selected by player
	public char checkGameBoard(int x, int y, char player) {
		char winner = ' ';

		System.out.println("Updating Gameboard (" + x + "," + y + ") = " + player);
		board[y][x] = player;

		System.out.println("Checking Gameboard");

		if (checkGameBoardPlayer(TicTacToe.X_PLAYER_CHR)) {
			winner = TicTacToe.X_PLAYER_CHR;
		} else if (checkGameBoardPlayer(TicTacToe.O_PLAYER_CHR)) {
			winner = TicTacToe.O_PLAYER_CHR;
		}

		System.out.println("Winner = " + winner);

		return winner;
	}

	public boolean checkGameBoardPlayer(char player) {

		boolean gameover = false;

		// check all rows on the board (horizontal)
		int y = 0;
		while (!gameover && y < TicTacToe.SIZE) {

			gameover = checkHorizontal(y, player);
			y++;
		}

		// check all columns on the board (vertical)
		int x = 0;
		while (!gameover && x < TicTacToe.SIZE) {

			gameover = checkVertical(x, player);
			x++;
		}

		if (!gameover) {
			gameover = checkDiagonals(player);
		}

		return gameover;
	}

	private boolean checkHorizontal(int y, char player) {
		char first = board[y][0];
		int likeEtterHverandre = 0;
		for (int i = 0; i < TicTacToe.SIZE; i++) {
			if (board[y][i] == first) {
				likeEtterHverandre += 1;
			} else {
				first = board[y][i];
				likeEtterHverandre = 1;
			}

			if (likeEtterHverandre == TicTacToe.LENGDE_KRAV && first == player) {
				System.out.println("Horisontal seier for: " + player + " y-pos: " + y);
				return true;
			}
		}
		return false;

	}

	private boolean checkVertical(int x, char player) {
		int likeEtterHverandre = 0;
		char first = board[0][x];

		for (int i = 0; i < TicTacToe.SIZE; i++) {
			if (board[i][x] == first) {
				likeEtterHverandre += 1;
			} else {
				first = board[i][x];
				likeEtterHverandre = 1;
			}

			if (likeEtterHverandre == TicTacToe.LENGDE_KRAV && first == player) {
				System.out.println("Vertikal seier for: " + player + " x-pos: " + x);
				return true;
			}
		}
		return false;
	}

	private boolean checkDiagonals(char player) {

		int x_shift_needed = board[0].length - TicTacToe.LENGDE_KRAV;
		int y_shift_needed = board.length - TicTacToe.LENGDE_KRAV;

		if (TicTacToe.LENGDE_KRAV == TicTacToe.SIZE) {
			if (diagonal(board, player)) {
				return true;
			}
			return false;
		} else {
			for (int y_shift = 0; y_shift < y_shift_needed; y_shift++) {
				for (int x_shift = 0; x_shift < x_shift_needed; x_shift++) {
					char[][] checkBoard = shift(board, x_shift, y_shift);
					if (diagonal(checkBoard, player)) {
						return true;
					}
				}
			}
			return false;
		}

	}

	/**
	 * @param board
	 * @param x_shift
	 * @param y_shift
	 * @return shifted board
	 */
	private char[][] shift(char[][] board, int x_shift, int y_shift) {
		char[][] tempBoard = new char[TicTacToe.LENGDE_KRAV][TicTacToe.LENGDE_KRAV];
		for (int i = 0; i < tempBoard.length; i++) {
			for (int j = 0; j < tempBoard[i].length; j++) {
				tempBoard[i][j] = board[i + y_shift][j + x_shift];
			}
		}
		return tempBoard;
	}

	private boolean diagonal(char[][] board, char player) {
		// Skjekk diagnal \
		int likeEtterHverandre = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i][i] == player) {
				likeEtterHverandre++;
			} else {
				likeEtterHverandre = 0;
			}
		}

		// Skjekk diagonal /
		int likeEtterHverandre2 = 0;
		for (int i = 0; i < board.length; i++) {
			if (board[i][board.length - 1 - i] == player) {
				likeEtterHverandre2++;
			} else {
				likeEtterHverandre2 = 0;
			}
		}
		if (likeEtterHverandre == TicTacToe.LENGDE_KRAV || likeEtterHverandre2 == TicTacToe.LENGDE_KRAV) {
			return true;
		}
		return false;
	}

}
