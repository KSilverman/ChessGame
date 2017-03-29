package Objects;

public class Location {
	
	char col;
	int row;
	
	public Location(char col, int row)
	{
		this.col= col;
		this.row = row;
	}
	
	public char getColomn()
	{
		return col;
	}
	
	public int getRow()
	{
		return row;
	}
	

}
