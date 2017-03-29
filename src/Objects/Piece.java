package Objects;

import Enums.Color;
import Enums.Type;

public class Piece {
	
	Type type;
	Square s;
	Color c;
	int points;
	
	public Piece(Type type,	Square s, Color c, int points)
	{
		this.type = type;
		this.s = s;
		this.c = c;
		this.points = points;
	}
	
	public Type getType()
	{
		return type;
	}
	
	public Square getSquare()
	{
		return s;
	}
	
	public Color getColor()
	{
		return c;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public void setSquare(Square s)
	{
		this.s = s;
	}

}
