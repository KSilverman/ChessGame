package Objects;

import java.util.ArrayList;
import java.util.List;

import Enums.Color;
import Enums.Type;

public class Board {
	
	private Square[][] board;
	private char[] letterPos = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
	private List<Piece> wPieces;
	private List<Piece> bPieces;
	
	public Board()
	{
		board = new Square[8][8];
		wPieces = new ArrayList<Piece>();
		bPieces = new ArrayList<Piece>();
		populateBoard();
		init_pieces();
	}
	
	private void populateBoard()
	{
		for(int i = 8; i >= 1; i--)
		{
			for(int j = 0; j < 8; j++)
			{
				Square square;
				if(j % 2 == 0)
					square = new Square(new Location(letterPos[j], i), Color.DARK, null);
				else
					square = new Square(new Location(letterPos[j], i), Color.LIGHT, null);
				board[i-1][j] = square;
			}
		}
	}
	
	private void init_pieces()
	{
		for(int i = 1; i <= board.length; i++)
		{
			for(int j = 0; j < board[0].length; j++)
			{
				Square s = board[i-1][j];
				Piece p = null;
				if(i == 1)
				{
					if(j == 0 || j == 7)
					{
						p = new Piece(Type.ROOK, s, Color.WHITE, 5);
					}
					if(j == 1 || j == 6)
					{
						p = new Piece(Type.KNIGHT, s, Color.WHITE, 3);
					}
					if(j == 2 || j == 5)
					{
						p = new Piece(Type.BISHOP, s, Color.WHITE, 3);
					}
					if(j == 3)
					{
						p = new Piece(Type.QUEEN, s, Color.WHITE, 3);
					}
					if(j == 4)
					{
						p = new Piece(Type.KING, s, Color.WHITE, 3);
					}
					wPieces.add(p);
				}
				if(i == 2)
				{
					p = new Piece(Type.PAWN, s, Color.WHITE, 1);
					wPieces.add(p);
				}
				if(i == 7)
				{
					p = new Piece(Type.PAWN, s, Color.BLACK, 1);
					bPieces.add(p);
				}
				if(i == 8)
				{
					if(j == 0 || j == 7)
					{
						p = new Piece(Type.ROOK, s, Color.BLACK, 5);
					}
					if(j == 1 || j == 6)
					{
						p = new Piece(Type.KNIGHT, s, Color.BLACK, 3);
					}
					if(j == 2 || j == 5)
					{
						p = new Piece(Type.BISHOP, s, Color.BLACK, 3);
					}
					if(j == 3)
					{
						p = new Piece(Type.QUEEN, s, Color.BLACK, 3);
					}
					if(j == 4)
					{
						p = new Piece(Type.KING, s, Color.BLACK, 3);
					}
					bPieces.add(p);
				}
				s.setPiece(p);
			}
		}
	}
	
	public void printBoard()
	{
		for(int i = board.length; i > 0; i--)
		{
			for(int j = 0; j < board[0].length; j++)
			{
				Square square = board[i-1][j];
				if(square.getPiece() != null)
					System.out.print("{ " + square.getPiece().getColor().toString() + " " + square.getPiece().getType().toString() + " }");
				else
					System.out.print("{ " + square.getLocation().getColomn() + ", " + square.getLocation().getRow() +" }");
			}
			System.out.println("");
		}
	}
	
	public List<Piece> getWhitePieces()
	{
		return this.wPieces;
	}
	
	public List<Piece> getBlackPieces()
	{
		return this.bPieces;
	}

}
