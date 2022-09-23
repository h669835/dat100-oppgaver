package dat100.hvl.uke39.tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewGameBtnListener implements ActionListener {

	private GameBoard board;

	public NewGameBtnListener(GameBoard board) {
		this.board = board;
	}

	public void actionPerformed(ActionEvent arg0) {
		board.newGame();
	}

}
