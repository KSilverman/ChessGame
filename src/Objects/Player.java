package Objects;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Piece> capturedPieces;
	
	public Player()
	{
		capturedPieces = new ArrayList<Piece>();
	}
	
	public List<Piece> getCapturedPieces()
	{
		return this.capturedPieces;
	}

}
