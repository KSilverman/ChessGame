package ChessGame;

import javax.swing.JFrame;

import Objects.Board;

public class ChessGame {
	
	public static void main(String[] args)
	{
		Board b = new Board();
		b.printBoard();
		JFrame frame = new JFrame();
		frame.setSize(1125, 720);
		frame.setTitle("Chess Game");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
