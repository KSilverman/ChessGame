package Objects;

import Enums.Color;

public class Square {
	
	Location loc;
	Color c;
	Piece p;
	
	public Square(Location loc, Color c, Piece p)
	{
		this.loc = loc;
		this.c = c;
		this.p = p;
	}
	
	public Location getLocation()
	{
		return loc;
	}
	
	public Color getColor()
	{
		return c;
	}
	
	public Piece getPiece()
	{
		return p;
	}
	
	public void setPiece(Piece p)
	{
		this.p = p;
	}

}
